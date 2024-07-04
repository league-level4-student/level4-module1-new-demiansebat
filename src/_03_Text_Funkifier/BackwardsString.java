package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {
    	String e;
char[] backwards= unfunkifiedText.toCharArray();
for (int i = backwards.length; i >=0 ; i++) {
	 e="";
	e=backwards[i]+e;
	unfunkifiedText=e;
}

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {

        return null;

    }
}
