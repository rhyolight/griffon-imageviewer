application {
    title='Image'
    startupGroups = ['image']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "ImagePanel"
    'ImagePanel' {
        model = 'ImagePanelModel'
        view = 'ImagePanelView'
        controller = 'ImagePanelController'
    }

    // MVC Group for "image"
    'image' {
        model = 'ImageModel'
        view = 'ImageView'
        controller = 'ImageController'
    }

}
