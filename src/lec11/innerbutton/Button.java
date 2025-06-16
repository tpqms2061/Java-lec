package lec11.innerbutton;



public class Button {
    interface OnclickListener {
        void onClick();
    }

    private OnclickListener listener;

    public void setOnClickListener(OnclickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (listener != null) {
            listener.onClick();

        }
    }

    private class ClickHandler implements OnclickListener {
        @Override
        public void onClick() {
            System.out.println("Button was clicked");

        }
    }

    public void simulate() {
        setOnClickListener(new ClickHandler());
        click();
    }

    public static void main(String[] args) {
        Button btn = new Button();

        btn.simulate();


    }
}
