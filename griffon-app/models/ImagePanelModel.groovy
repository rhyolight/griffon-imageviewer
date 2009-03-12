import groovy.beans.Bindable
import javax.swing.ImageIcon

class ImagePanelModel {
    @Bindable File loadedImageFile
    @Bindable ImageIcon imageIcon
    @Bindable long lastModified
}