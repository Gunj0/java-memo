# JDK, JRE とは

- JDK: Java Development Kit
  - Java の開発に必要なツールやライブラリをまとめたもの
  - Java SE の仕様に基づいて各ベンダーが提供している
- JRE: Java Runtime Environment
  - Java の実行に必要な環境
  - JDK に含まれる

## 種類

- [Oracle JDK](https://www.oracle.com/jp/java/technologies/downloads/)
  - Oracle 社が提供する公式の JDK, 商用利用にはライセンスが必要
- [Eclipse Temurin](https://adoptium.net/ja/temurin)
  - Eclipse Foundation が提供する OpenJDK の配布版, 無償で利用可能
- [Amazon Corretto](https://aws.amazon.com/corretto/)
  - Amazon が提供する OpenJDK の配布版, 無償で利用可能
- [Microsoft Build of OpenJDK](https://learn.microsoft.com/ja-jp/java/openjdk/)
  - Microsoft が提供する OpenJDK の配布版, 無償で利用可能
- [Red Hat OpenJDK](https://developers.redhat.com/products/openjdk/download)
  - Red Hat が提供する OpenJDK の配布版, 無償で利用可能

## インストール方法

- [mise](https://mise.jdx.dev/) をインストールする
- `mise use -g java@latest` で最新の JDK をインストールする
  - ※2026/11 時点では、デフォルトで Temurin の JDK が使用される

## バージョン確認方法

```bash
# Java コンパイラのバージョン確認
❯ javac -version
javac 25.0.5

# Java のバージョン確認
❯ java -version
openjdk version "27.0.1.0.2" 2026-10-21
OpenJDK Runtime Environment Temurin-27.0.1.0.2+1 (build 27.0.1.0.2+1)
OpenJDK 64-Bit Server VM Temurin-27.0.1.0.2+1 (build 27.0.1.0.2+1, mixed mode, sharing)
```
