package test.ShujujiegoAndsf;

public class reverse {
    private String input;

    public reverse(String input) {
        this.input = input;
    }

    public String doReverse() {
        String output = "";
        MyCharstack ms = new MyCharstack(input.length());
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            ms.push(ch);
        }
        while (!ms.isEmpty()) {
            output += ms.pop();
        }
        return output;
    }
}
