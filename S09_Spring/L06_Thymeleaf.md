# Thymeleaf

- Spring MVC で使用されるテンプレートエンジン
- HTML ファイルに埋め込む形で動的にコンテンツを生成できる

## 基本的な使い方

- src/main/resources/templates 配下に HTML ファイルを配置する
- HTML ファイルに `th:text` 属性を使用して動的に値を表示できる

```html: sample.html
<html xmlns:th="http://www.thymeleaf.org">
<body>
    <p th:text="${message}">Hello, World!</p>
</body>
</html>
```

```java: SampleController.java
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String sample(Model model) {
        model.addAttribute("message", "Hello, Thymeleaf!");
        return "sample";
    }
}
```
