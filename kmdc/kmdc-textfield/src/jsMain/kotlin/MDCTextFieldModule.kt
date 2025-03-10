package dev.petuska.kmdc.textfield

import dev.petuska.kmdc.core.MDCBaseModule
import dev.petuska.kmdc.ripple.MDCRippleModule
import org.w3c.dom.Element

@JsModule("@material/textfield")
public external object MDCTextFieldModule {
  public class MDCTextField(element: Element) : MDCBaseModule.MDCComponent<dynamic> {
    public companion object {
      public fun attachTo(element: Element): MDCTextField
    }

    public var value: String
    public var disabled: Boolean
    public var valid: Boolean
    public var prefixText: String
    public var suffixText: String

    // Proxied from input element
    public var required: Boolean
    public var pattern: String
    public var minLength: Number
    public var maxLength: Number
    public var min: Number
    public var max: Number
    public var step: Number

    // Write-only
    public var useNativeValidation: Boolean
    public var helperTextContent: String
    public var ripple: MDCRippleModule.MDCRipple
    public var leadingIconAriaLabel: String
    public var trailingIconAriaLabel: String
    public var leadingIconContent: String
    public var trailingIconContent: String

    public fun focus()
    public fun layout()
  }
}
