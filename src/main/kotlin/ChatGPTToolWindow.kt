import javax.swing.JButton
import javax.swing.JPanel
import javax.swing.JTextField

class ChatGPTToolWindow(private val toolWindow: com.intellij.openapi.wm.ToolWindow) {
    private val messageTextField: JTextField = JTextField()
    private val sendButton: JButton = JButton().apply {
        this.text = "Send"
    }
    private val toolWindowContent: JPanel = JPanel().apply {
        this.add(messageTextField)
        this.add(sendButton)
    }

    fun getContent(): JPanel {
        return toolWindowContent
    }
}