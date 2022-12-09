import javax.swing.JButton
import javax.swing.JPanel
import javax.swing.JTextField

class ChatGPTToolWindow(private val toolWindow: com.intellij.openapi.wm.ToolWindow) {
    private val messageTextField: JTextField = JTextField()
    private val sendMessageButton: JButton = JButton()
    private val toolWindowContent: JPanel = JPanel()



    fun getContent(): JPanel {
        return toolWindowContent
    }
}