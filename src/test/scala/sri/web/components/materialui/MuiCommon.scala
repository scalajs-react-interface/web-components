package sri.web.components.materialui

import sri.web.components.{Common, ScalaField}

trait MuiCommon extends Common {

  val MUI_PREFIX = "Mui"

  val jsPropTypesOverrides: Map[String, Set[ScalaField]] = Map(
    "Grid" -> Set(
      ScalaField("xs", "Boolean | Int"),
      ScalaField("sm", "Boolean | Int"),
      ScalaField("md", "Boolean | Int"),
      ScalaField("lg", "Boolean | Int"),
      ScalaField("xl", "Boolean | Int"),
      ScalaField("gutter", "Boolean | Int"),
      ScalaField("hidden", "js.Object")
    ),
    "BottomNavigation" -> Set(ScalaField("onChange", "(ReactEventH,Int) => _")),
    "BottomNavigationButton" -> Set(ScalaField("onChange",
                                               "(ReactEventH,Int) => _"),
                                    ScalaField("onClick", "ReactEventH => _")),
    "Checkbox" -> Set(ScalaField("onChange", "(ReactEventH,Boolean) => _")),
    "Chip" -> Set(ScalaField("onClick", "(ReactEventH) => _")),
    "Collapse" -> Set(
      ScalaField("timeout", "String | Int | Double | js.Object")),
    "Dialog" -> Set(
      ScalaField("onBackdropClick", "(ReactEventH) => _"),
      ScalaField("onEnter", "(ReactEventH) => _"),
      ScalaField("onEntering", "(ReactEventH) => _"),
      ScalaField("onEntered", "(ReactEventH) => _"),
      ScalaField("onEscapeKeyUp", "(ReactEventH) => _"),
      ScalaField("onExit", "(ReactEventH) => _"),
      ScalaField("onExiting", "(ReactEventH) => _"),
      ScalaField("onExited", "(ReactEventH) => _"),
      ScalaField("transitionDuration", "Double | Int | js.Object"),
      ScalaField("onRequestClose", "(ReactEventH) => _")
    ),
    "Drawer" -> Set(ScalaField("onClose", "(ReactEventH) => _")),
    "IconButton" -> Set(
      ScalaField("buttonRef", "MuiButtonComponent.type => _")),
    "Input" -> Set(
      ScalaField("onBlur", "ReactEventI => _"),
      ScalaField("onChange", "ReactEventI => _"),
      ScalaField("onClean", "ReactEventI => _"),
      ScalaField("onDirty", "ReactEventI => _"),
      ScalaField("onFocus", "ReactEventI => _"),
      ScalaField("onKeyDown", "ReactEventI => _"),
      ScalaField("value",
                 "String | Int | Double | js.Array[Double] | js.Array[String]"),
      ScalaField("onKeyUp", "ReactEventI => _")
    ),
    "List" -> Set(ScalaField("rootRef", "dom.Element => _")),
    "Typography" -> Set(ScalaField("headlineMapping", "js.Object")),
    "TablePagination" -> Set(ScalaField("rowsPerPageOptions", "js.Array[Int]")),
    "Menu" -> Set(
      ScalaField("anchorEl", "dom.Element"),
      ScalaField("onEnter", "dom.Element => _"),
      ScalaField("onEntering", "dom.Element => _"),
      ScalaField("onEntered", "dom.Element => _"),
      ScalaField("onExit", "dom.Element => _"),
      ScalaField("onExiting", "dom.Element => _"),
      ScalaField("transitionDuration", "Double | Int | String"),
      ScalaField("onExited", "dom.Element => _"),
      ScalaField("onRequestClose", "ReactEventH => _")
    ),
    "MenuList" -> Set(
      ScalaField("onBlur", "ReactEventH => _"),
      ScalaField("onKeyDown", "ReactEventH => _")
    ),
    "Radio" -> Set(ScalaField("onChange", "(ReactEventH,Boolean) => _")),
    "RadioGroup" -> Set(ScalaField("onChange", "(ReactEventH,String) => _"),
                        ScalaField("onBlur", "ReactEventH => _"),
                        ScalaField("onKeyDown", "ReactEventH => _")),
    "MuiThemeProvider" -> Set(ScalaField("styleManager", "MuiStyleManager"),
                              ScalaField("theme", "MuiTheme")),
    "Popover" -> Set(
      ScalaField("transitionDuration", "String | Int | Double | js.Object")),
    "Switch" -> Set(ScalaField("onChange", "(ReactEventH,Boolean) => _")),
    "StepContent" -> Set(
      ScalaField("transitionDuration", "String | Int | Double | js.Object")),
    "Select" -> Set(
      ScalaField(
        "value",
        "String | Int | Double | js.Array[Double] | js.Array[String]")),
    "Hidden" -> Set(ScalaField("onChange", "(ReactEventH,Boolean) => _"),
                    ScalaField("only",
                               "MuiBreakpoint | js.Array[MuiBreakpoint]")),
    "Tabs" -> Set(
      ScalaField("onChange", "(ReactEventH,Int) => _"),
      ScalaField("indicatorColor", "String"),
      ScalaField("index", "Boolean | Double | Int"),
      ScalaField("textColor", "String")
    ),
    "Tab" -> Set(ScalaField("textColor", "String")),
    "Grow" -> Set(ScalaField("timeout", "String | Int | Double | js.Object")),
    "TextField" -> Set(
      ScalaField("onChange", "(ReactEventI) => _"),
      ScalaField(
        "value",
        "String | Int | Double | js.Array[Double] | js.Array[String]")),
    "Snackbar" -> Set(ScalaField("anchorOrigin", "js.Object"),
                      ScalaField("onRequestClose", "(ReactEventH,String) => _"))
  )
}
