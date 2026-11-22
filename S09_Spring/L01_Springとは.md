# Spring とは

- Java のアプリ開発を支援するフレームワーク
- DI や AOP (Aspect Oriented Programming) などの機能を提供
- 主に Web アプリ開発に利用される
- Tomcat は組み込みサーバとして利用されることが多い

## インストール方法

- Eclipse のマーケットプレイスからインストール
  - ヘルプ > Eclipse マーケットプレイス > 「Spring Tools」で検索
  - 「Spring Tools (aka Spring IDE and Spring Tool Suite)」をインストール
  - Eclipse を再起動

## 開発方法

- 新規 > その他 > Spring スターター・プロジェクト
  - 依存関係: Lombok, Spring Boot DevTools, Spring Web を選択
- パースペクティブ: Java

## 動作方法

- Boot ダッシュボード から local を選択して起動

## 基本

- src/main/java/com.example/Application.java
  - Spring Boot アプリケーションのエントリーポイントとなるクラス
