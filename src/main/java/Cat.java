import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class Cat {

    private String message;

    public Cat() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
