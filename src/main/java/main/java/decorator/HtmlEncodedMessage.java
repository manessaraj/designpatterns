package main.java.decorator;

import main.java.decorator.Message;
import org.apache.commons.lang.StringEscapeUtils;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message {
    private Message message;

    public HtmlEncodedMessage(Message message) {
        this.message = message;
    }

    public String getContent() {
        return StringEscapeUtils.escapeHtml(message.getContent());
    }
}
