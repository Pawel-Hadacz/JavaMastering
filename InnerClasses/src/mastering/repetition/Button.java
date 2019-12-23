package mastering.repetition;

public class Button {
    private String title;
    private onClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(onClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
    public void onClick(){
        onClickListener.onClick(title);
    }
    public interface onClickListener{
         void onClick(String title);
    }

}
