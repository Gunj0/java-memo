# インターフェース

- クラスが実装すべきメソッドの仕様を定義するための型
- Spring では DI の対象としてインターフェースを使用することが多い

## インターフェースの例

```java: SampleRepository.java
package com.example;

public interface SampleRepository {
 String getName();
}
```

## インターフェースを実装するクラスの例

- ファイル名に Impl を末尾につけるのが一般的

```java: SampleRepositoryImpl.java
package com.example;

import org.springframework.stereotype.Repository;

@Repository
public class SampleRepositoryImpl implements SampleRepository {
 @Override
 public String getName() {
  return "test";
 }
}
```
