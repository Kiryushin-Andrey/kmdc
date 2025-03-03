package dev.petuska.kmdc.card

import androidx.compose.runtime.Composable
import dev.petuska.kmdc.core.Builder
import dev.petuska.kmdc.core.ComposableBuilder
import dev.petuska.kmdc.core.MDCDsl
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.ElementScope
import org.w3c.dom.HTMLDivElement

public data class MDCCardMediaOpts(var type: Type = Type.Free) {
  public enum class Type(public vararg val classes: String) {
    Free,
    Square("mdc-card__media--square"),
    Cinema("mdc-card__media--16-9")
  }
}

public class MDCCardMediaScope(scope: ElementScope<HTMLDivElement>) : ElementScope<HTMLDivElement> by scope

/**
 * [JS API](https://github.com/material-components/material-components-web/tree/v13.0.0/packages/mdc-card)
 */
@MDCDsl
@Composable
public fun MDCCardScope.MDCCardMedia(
  opts: Builder<MDCCardMediaOpts>? = null,
  attrs: AttrBuilderContext<HTMLDivElement>? = null,
  content: ComposableBuilder<MDCCardMediaScope>? = null
) {
  val options = MDCCardMediaOpts().apply { opts?.invoke(this) }
  Div(
    attrs = {
      classes("mdc-card__media", *options.type.classes)
      attrs?.invoke(this)
    },
  ) {
    content?.let { MDCCardMediaScope(this).it() }
  }
}

/**
 * [JS API](https://github.com/material-components/material-components-web/tree/v13.0.0/packages/mdc-card)
 */
@MDCDsl
@Composable
public fun MDCCardMediaScope.MDCCardMediaContent(
  attrs: AttrBuilderContext<HTMLDivElement>? = null,
  content: ContentBuilder<HTMLDivElement>? = null
) {
  Div(
    attrs = {
      classes("mdc-card__media-content")
      attrs?.invoke(this)
    },
    content = content?.let { { MDCCardScope(this).it() } }
  )
}
