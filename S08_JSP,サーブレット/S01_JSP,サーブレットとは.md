# JSP,サーブレットとは

- JSP: JavaServer Pages
  - Java を HTML 内に埋め込み、サーバー側で処理を行って HTML を生成する
  - 主に Tomcat 上で動作する
- サーブレット
  - Java で書かれたサーバーサイドのプログラム
  - HTTP リクエストを処理して HTTP レスポンスを生成する

## Eclipse での JSP 開発

- 動的 Web プロジェクトを作成する
  - 新規 > 動的 Web プロジェクト
- サーバーを追加する
  - サーバー右クリック > 追加および除去 > 作成したプロジェクトを追加
- JSP ファイルを作成する
  - プロジェクト右クリック > 新規 > JSP ファイル
  - <% %> 内に Java コードを記述する
  - <%= %> 内に Java 式を記述して結果を出力する
- JSP ファイルを実行する
  - JSP ファイル右クリック > 実行 > サーバー で実行

## サーブレット

- JSP は内部的にサーブレットに変換されて実行される
- JSP は基本的に WEB-INF 内に配置し、直接ブラウザからアクセスできないようにする
- java フォルダ内に以下のようなサーブレットクラスを作成することで間接的にアクセスする

```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
  throws ServletException, IOException {
  request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
}
```
