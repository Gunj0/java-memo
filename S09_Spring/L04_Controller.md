# Controller

- Spring MVC におけるコントローラーは、HTTP リクエストを処理し、レスポンスを返す役割を持つ
- `@Controller` または `@RestController` アノテーションを使用して定義する
- DispatcherServlet がリクエストを受け取り、適切なコントローラーに振り分ける
- コントローラーはモデルを作成し、ビューに渡してレスポンスを生成する

## コントローラーの例

```java: SampleController.java
package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
    // マッピング
    @GetMapping({"/index", "/"})
    public String hello() {
        return "index.html";
    }
}
```
