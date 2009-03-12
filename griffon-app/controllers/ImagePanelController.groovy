import javax.swing.ImageIcon

class ImagePanelController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(args) {
        model.loadedImageFile = args.file
        updateFile()
    }
    
    def closeImage = { evt = null ->
        view.imagesPane.remove(view.tab)
        destroyMVCGroup (model.loadedImageFile.path)
    }

    def updateFile = { evt = null ->
        if (model.loadedImageFile.lastModified() > model.lastModified) {
            model.imageIcon = new ImageIcon(model.loadedImageFile.absolutePath)
            model.lastModified = model.loadedImageFile.lastModified()
        }
    }
}