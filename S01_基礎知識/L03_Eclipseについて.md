# Eclipse について

- OSS の統合開発環境（IDE）
- Java 開発によく使われる
- IBM が開発に関わっている
- プラグイン等で C/C++ や他の言語の開発も可能

## インストール方法

- winget からインストール
  - `winget install EclipseFoundation.EclipseIDE.`
- Pleiades (Eclipse 日本語化プラグイン) をダウンロードしてインストール
  - https://willbrains.jp/#pleiades.html
  - > 「Pleiades プラグイン・ダウンロード」からダウンロード
  - setup.exe を開き、以下を選択する
    - `%LOCALAPPDATA%\Microsoft\WinGet\Packages\EclipseFoundation.Eclipse.JEE_Microsoft.Winget.Source_8wekyb3d8bbwe\eclipse.eclipse.exe`
- 参考
  - https://www.kkaneko.jp/tools/win/eclipse.html

## JDK 設定

- ウィンドウ > 設定 > Java > インストール済みの JRE
  - mise でインストールした JDK を選択する
- ウィンドウ > 設定 > Java > コンパイラー
  - コンパイラーの準拠レベルを JDK のバージョンに合わせる
  - まだ対応していない場合、mise でインストールするバージョンを下げる

## パースペクティブ設定

- ウィンドウ > パースペクティブ > パースペクティブを開く > その他 > Web
