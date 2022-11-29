# JConsoleColor
**JConsoleColor** helps you find your console messages easier by adding the ability to change the printed text color and background in the terminal.
# Usage

```JAVA
PrintMessage("message", Color.YOURCOLOR);
```
This example will print the message in cyan color.
```JAVA
import com.suxaslux.JConsoleColor.*;
import java.awt.*;
import static com.suxaslux.JConsoleColor.Print.PrintMessage;

public class Test {
    public static void main(String[] args) {
        PrintMessage("This line is printed in cyan.", Color.CYAN);
    }
}
```
Output:

![](../../Desktop/output_cyan.png)