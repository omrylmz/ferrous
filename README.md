# Ferrous

The official [Rust Book (mdbook)](https://doc.rust-lang.org/book/) color scheme for VS Code and JetBrains IDEs.

A faithful port of the three dark themes from the Rust documentation - perfect for Rust developers who love the familiar look of the Rust Book.

## Variants

| Theme | Background | Description |
|-------|------------|-------------|
| **Ferrous Coal** | `#1d1f21` | The darkest theme with neutral gray tones (Tomorrow Night) |
| **Ferrous Navy** | `#161923` | Deep blue-tinted dark theme |
| **Ferrous Ayu** | `#191f26` | Warm amber accents with muted backgrounds |

## Installation

### JetBrains IDEs (IntelliJ, RustRover, WebStorm, PyCharm, etc.)

**Option 1: Marketplace (Recommended)**
1. Go to **Settings** → **Plugins** → **Marketplace**
2. Search for "Ferrous"
3. Click **Install** and restart
4. Go to **Settings** → **Appearance** → **Theme** and select a Ferrous theme

**Option 2: Manual Plugin Install**
1. Download the latest `.zip` from [Releases](https://github.com/omrylmz/ferrous/releases)
2. Go to **Settings** → **Plugins** → ⚙️ → **Install Plugin from Disk**
3. Select the downloaded file and restart
4. Go to **Settings** → **Appearance** → **Theme** and select a Ferrous theme

**Option 3: Color Scheme Only**
If you only want the syntax colors without the full UI theme:
1. Download the `.xml` file from `jetbrains/colors/`
2. Go to **Settings** → **Editor** → **Color Scheme**
3. Click ⚙️ → **Import Scheme**
4. Select the downloaded file

### VS Code

**Option 1: Marketplace (Recommended)**
1. Open Extensions sidebar (`Ctrl+Shift+X`)
2. Search for "Ferrous"
3. Click Install
4. Select theme: `Preferences: Color Theme` → Ferrous Coal/Navy/Ayu

**Option 2: Manual Installation**
Download `.vsix` from [Releases](https://github.com/omrylmz/ferrous/releases), then:
```bash
code --install-extension ferrous-1.0.1.vsix
```

## Color Palette

### Coal Theme (Tomorrow Night)
- Background: `#1d1f21`
- Foreground: `#c5c8c6`
- Comment: `#969896`
- Red (variable/tag): `#cc6666`
- Orange (number): `#de935f`
- Yellow (class): `#f0c674`
- Green (string): `#b5bd68`
- Aqua (operator): `#8abeb7`
- Blue (function): `#81a2be`
- Purple (keyword): `#b294bb`

### Navy Theme
- Same syntax colors as Coal
- UI Background: `#161923`
- Sidebar: `#282d3f`
- Accent: `#2b79a2`

### Ayu Theme
- Background: `#191f26`
- Foreground: `#e6e1cf`
- Comment: `#5c6773`
- Orange (keyword): `#ff7733`
- Yellow (type/number): `#ffee99`
- Green (string): `#b8cc52`
- Amber (function): `#ffb454`
- Blue (name): `#36a3d9`
- Cyan (escape): `#95e6cb`

## Font

Optimized for **Source Code Pro** (14pt, 1.2 line height) - the same font used in rustdoc.

## Credits

- Color schemes based on [mdBook](https://github.com/rust-lang/mdBook) by the Rust Project
- Tomorrow Night theme by [Chris Kempson](https://github.com/chriskempson/tomorrow-theme)
- Ayu theme by [Dempfi](https://github.com/dempfi/ayu)

## License

MIT License - See [LICENSE](LICENSE) for details.

## Contributing

Contributions welcome! Feel free to:
- Report issues
- Submit pull requests
- Request additional IDE/editor support
