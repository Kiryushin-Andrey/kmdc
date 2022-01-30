package dev.petuska.kmdc.dialog

import androidx.compose.runtime.Composable
import dev.petuska.kmdc.core.ComposableBuilder
import dev.petuska.kmdc.core.MDCDsl
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ElementScope
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.HTMLHeadingElement

public class MDCDialogTitleScope(scope: ElementScope<HTMLHeadingElement>) : ElementScope<HTMLHeadingElement> by scope

/**
 * [JS API](https://github.com/material-components/material-components-web/tree/v13.0.0/packages/mdc-dialog)
 */
@MDCDsl
@Composable
public fun MDCDialogScope.MDCDialogTitle(
  title: String? = null,
  attrs: AttrBuilderContext<HTMLHeadingElement>? = null,
  content: ComposableBuilder<MDCDialogTitleScope>? = null
) {
  MDCDialogTitleImpl(titleId, title, attrs, content)
}

/**
 * [JS API](https://github.com/material-components/material-components-web/tree/v13.0.0/packages/mdc-dialog)
 */
@MDCDsl
@Composable
public fun MDCDialogHeaderScope.MDCDialogTitle(
  title: String? = null,
  attrs: AttrBuilderContext<HTMLHeadingElement>? = null,
  content: ComposableBuilder<MDCDialogTitleScope>? = null
) {
  MDCDialogTitleImpl(titleId, title, attrs, content)
}

@Composable
private fun MDCDialogTitleImpl(
  titleId: String,
  title: String?,
  attrs: AttrBuilderContext<HTMLHeadingElement>? = null,
  content: ComposableBuilder<MDCDialogTitleScope>? = null
) {
  H3(
    attrs = {
      classes("mdc-dialog__title")
      id(titleId)
      attrs?.invoke(this)
    },
    content = {
      title?.let { Text(it) }
      content?.let { MDCDialogTitleScope(this).it() }
    }
  )
}