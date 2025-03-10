package dev.petuska.kmdc.slider

import dev.petuska.kmdc.core.MDCEvent
import org.w3c.dom.Element
import org.w3c.dom.HTMLElement

@JsModule("@material/slider")
public external object MDCSliderModule {
  public class MDCSlider(element: Element) {
    public interface MDCSliderOptions {
      public var skipInitialUIUpdate: Boolean?
    }

    public companion object {
      public fun attachTo(element: Element, options: MDCSliderOptions = definedExternally): MDCSlider
    }

    public var root: HTMLElement
    public fun getDefaultFoundation(): dynamic
    public fun initialize(options: MDCSliderOptions = definedExternally): dynamic
    public fun initialSyncWithDOM()
    public fun layout()
    public fun getValueStart(): Number
    public fun setValueStart(valueStart: Number)
    public fun getValue(): Number
    public fun setValue(value: Number)
    public fun getDisabled(): Boolean
    public fun setDisabled(disabled: Boolean)
    public fun setValueToAriaValueTextFn(mapFn: ((value: Number) -> String)?)
  }

  @Suppress("ClassName")
  public object events {
    public val CHANGE: String
    public val INPUT: String
  }

  public class MDCSliderChangeEventDetail {
    public val value: Number
    public val thumb: Int
  }

  public class MDCSliderChangeEvent : MDCEvent<MDCSliderChangeEventDetail>
}
