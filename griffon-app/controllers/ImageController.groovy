import javax.swing.JFileChooser

class ImageController {
    // these will be injected by Griffon
    def model
    def view

    def openImage = { evt = null -> 
        
        File f = new File(model.fileName)

        // create new MVC group
        createMVCGroup ('ImagePanel', f.path,
            [file: f, imagesPane: view.imagesPane, tabName: f.name])        
    }
        
    def browse = { evt = null ->
        def openResult = view.fileChooserWindow.showOpenDialog(view.imageViewerFrame)
        if (JFileChooser.APPROVE_OPTION == openResult) {
            model.fileName = view.fileChooserWindow.selectedFile.toString()
            view.textBinding.reverseUpdate()
        }
    }
}