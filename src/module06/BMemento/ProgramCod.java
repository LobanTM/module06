package module06.BMemento;

/**
 * Created by tetya on 10.07.2017.
 *
 * originator (memento)
 */
public class ProgramCod {
    String cod;         //беспосередньо код
    String description; //опис, та коментарі до коду

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    private Memento memento;
    //цілком внутрішній клас, всі методи якого закриті назовні
    private class Memento {
        String text;
        String descrText;

        Memento(){
            this.text = cod;
            this.descrText = description;
        }

        String getText() {
            return text;
        }

        String getDescrText() {
            return descrText;
        }
    }

    public void save(){
        memento = new Memento();
    }

    public void undoChange(){
        cod = memento.getText();
        description = memento.getDescrText();
    }
}
