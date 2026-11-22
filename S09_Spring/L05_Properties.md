# Properties

- アプリケーションの設定は `application.properties` または `application.yml` ファイルで管理する
- 例えば、サーバーのポート番号やデータベースの接続情報などを設定できる

## application.properties の例

```text: application.properties
server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=password
```
