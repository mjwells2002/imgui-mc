# imgui-mc
ImGui for minecraft based on imgui-java

## TODO:

- Stop mouse input to imgui while in game
- Wiki
- Add more stuff to this todo list

## Maven repo
```groovy
   maven {
        name = "breadloaf.public"
        url = "https://maven.breadloaf.xyz/repository/public"
    }
```

## dependencies
```groovy
modImplementation "xyz.breadloaf.imguimc:imgui-mc:${project.imguimc_version}"
```

## fabric.mod.json
```json
...
"depends": {
    ...
    "imguimc": "${imguimc_version}",
}
...
```

## Current versions

| MC version | imguimc version | imgui-java version                                                     |
| ---------- | --------------- | ---------------------------------------------------------------------- |
| 1.17.1     | 1.17.1-1.0.3    | [1.84.1.1](https://github.com/SpaiR/imgui-java/releases/tag/v1.84.1.1) |

## Features

Use the same familiar imgui interface your used to to create a multi window interface in minecraft!

### Extensions:

- ImNodes
  
    A small, dependency-free node editor for dear imgui. (A good choice for simple start.)
- imgui-node-editor
  
    Node Editor using ImGui. (A bit more complex than ImNodes, but has more features.)
- ImGuizmo
  
    Immediate mode 3D gizmo for scene editing and other controls based on Dear Imgui.
- implot
  
    Advanced 2D Plotting for Dear ImGui.
- ImGuiColorTextEdit
  
    Syntax highlighting text editor for ImGui.

## Examples

Using ImGuizmo to provide basic 3D tools in game.
![Example showing 3D modeling tools in game](https://i.imgur.com/y65sWyQ.png)


Example showing window dragging
![GIF showing window dragging](https://cdn.discordapp.com/attachments/854660703742328884/886957812725452800/Peek_2021-09-13_13-44.gif)