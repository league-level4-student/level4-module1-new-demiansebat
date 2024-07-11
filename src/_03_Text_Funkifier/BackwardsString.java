package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	String e="";
char[] backwards= unfunkifiedText.toCharArray();
for (int i = backwards.length-1; i >=0 ; i--) {
	
	e+=backwards[i];
}

        return e;

    }
}
