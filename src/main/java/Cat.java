import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class Cat {
    @Autowired
    private Environment environment;
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
