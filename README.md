# Java-memo

Java に関しての知識メモ

## textlint 動作方法

- 前提
  - pnpm がインストールされていること
    - `pnpm -v` でバージョン確認
  - VSCode で textlint 拡張機能がインストールされていること
  - VSCode で以下を設定すること

```json
// 文字入力時に textlint を実行する
"textlint.run": "onType",
// 保存時に自動修正する
"textlint.autoFixOnSave": true,
```

- パッケージの復元
  - `pnpm i`

## 使用している textlint ルール

- [preset-ja-spacing](https://github.com/textlint-ja/textlint-rule-preset-ja-spacing)

## パッケージアップデート

- `pnpm outdated` で更新可能なパッケージを確認
- `pnpm update` でパッケージを最新に更新
- `pnpm update --latest` でパッケージを最新のメジャーバージョンに更新

## Author

- GitHub: [Gunj0](https://github.com/Gunj0)
- X(Twitter): [@gunj0dev](https://x.com/gunj0dev)
