openAction = action(closure: controller.openImage, name:"Open")

imageViewerFrame = application(title:'Image Viewer', location:[50,50], pack:true, locationByPlatform:true) {
    borderLayout()
    hbox (constraints:NORTH) {
        textField (columns:20, text: bind('fileName', target:model, id:'textBinding') )
        button ("Browse", actionPerformed: controller.browse)
        button (openAction)
    }
    imagesPane = tabbedPane (constraints:CENTER)
}

fileChooserWindow = fileChooser()

doLater {
    imageViewerFrame.size = [500,500]
}