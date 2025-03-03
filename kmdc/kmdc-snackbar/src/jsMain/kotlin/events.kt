package dev.petuska.kmdc.snackbar

import MDCSnackbarModule
import dev.petuska.kmdc.core.MDCAttrsDsl
import org.jetbrains.compose.web.attributes.AttrsBuilder
import org.w3c.dom.HTMLElement

/**
 * [JS API](https://github.com/material-components/material-components-web/tree/v13.0.0/packages/mdc-snackbar)
 */
@MDCAttrsDsl
public inline fun AttrsBuilder<HTMLElement>.onSnackbarOpening(
  crossinline listener: (MDCSnackbarModule.MDCSnackbarOpenEvent) -> Unit
) {
  addEventListener("MDCSnackbar:opening") {
    listener(it.nativeEvent.unsafeCast<MDCSnackbarModule.MDCSnackbarOpenEvent>())
  }
}

/**
 * [JS API](https://github.com/material-components/material-components-web/tree/v13.0.0/packages/mdc-snackbar)
 */
@MDCAttrsDsl
public inline fun AttrsBuilder<HTMLElement>.onSnackbarOpened(
  crossinline listener: (MDCSnackbarModule.MDCSnackbarOpenEvent) -> Unit
) {
  addEventListener("MDCSnackbar:opened") {
    listener(it.nativeEvent.unsafeCast<MDCSnackbarModule.MDCSnackbarOpenEvent>())
  }
}

/**
 * [JS API](https://github.com/material-components/material-components-web/tree/v13.0.0/packages/mdc-snackbar)
 */
@MDCAttrsDsl
public inline fun AttrsBuilder<HTMLElement>.onSnackbarClosing(
  crossinline listener: (MDCSnackbarModule.MDCSnackbarCloseEvent) -> Unit
) {
  addEventListener("MDCSnackbar:closing") {
    listener(it.nativeEvent.unsafeCast<MDCSnackbarModule.MDCSnackbarCloseEvent>())
  }
}

/**
 * [JS API](https://github.com/material-components/material-components-web/tree/v13.0.0/packages/mdc-snackbar)
 */
@MDCAttrsDsl
public inline fun AttrsBuilder<HTMLElement>.onSnackbarClosed(
  crossinline listener: (MDCSnackbarModule.MDCSnackbarCloseEvent) -> Unit
) {
  addEventListener("MDCSnackbar:closed") {
    listener(it.nativeEvent.unsafeCast<MDCSnackbarModule.MDCSnackbarCloseEvent>())
  }
}
