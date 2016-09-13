package rest;

public class TextDTO {
	
	private String text;

	public TextDTO(String text) {
		this.setText(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "TextDTO [text=" + text + "]";
	}

}
