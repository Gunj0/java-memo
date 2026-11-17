# Tomcatについて

- [Tomcat](https://tomcat.apache.org/)
- Java の Web アプリを実行するためのサーブレットコンテナ
- Java Servlet, JavaServer Pages (JSP) などの Java Web 技術をサポート
- Apache ソフトウェア財団が開発・提供している

## インストール方法

- `mise use -g tomcat@latest`

## 起動方法

- `mise where tomcat` でインストールパスを確認
- `catalina.bat` の文字コードを UTF-8 に変更する
  - `setlocal` の下に以下を追記
    - `chcp 65001 > nul`
- 管理者権限で PowerShell を起動し以下を実行
  - `./catalina.bat run`
- `http://localhost:8080` にアクセスする

## Eclipse との連携

- ウィンドウ > ビューの表示 > サーバー
- 新規サーバー > Apache > Tomcat v11.0 サーバー
  - Tomcat のインストールディレクトリを指定
    - `mise where tomcat`
  - JRE
    - mise でインストールした JDK を指定
- 右クリック > 開始 で起動することを確認
