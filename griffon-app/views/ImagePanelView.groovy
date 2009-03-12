import java.awt.event.MouseAdapter

tabbedPane(imagesPane, selectedIndex: imagesPane.tabCount) {
    scrollPane(title:tabName, id:'tab') {
        label(id:'imageLabel', icon:bind {model.imageIcon}, mouseClicked: { controller.closeImage()})
    }
}
