package local.sandbox.samples

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import dev.petuska.kmdc.layout.grid.MDCLayoutGridCell
import dev.petuska.kmdc.layout.grid.MDCLayoutGridCellOpts
import dev.petuska.kmdc.layout.grid.MDCLayoutGridCells
import dev.petuska.kmdc.layout.grid.MDCLayoutGridCellsScope
import dev.petuska.kmdc.segmented.button.MDCSegmentedButton
import dev.petuska.kmdc.segmented.button.MDCSegmentedButtonSegment
import dev.petuska.kmdc.segmented.button.onSegmentSelected
import dev.petuska.kmdc.switch.MDCSwitch
import local.sandbox.engine.Sample
import local.sandbox.engine.Samples
import org.jetbrains.compose.web.attributes.disabled

@Suppress("unused")
private val SwitchSamples = Samples("MDCSwitch") {
  Sample("Initially Off") { name ->
    Render(name, false)
  }
  Sample("Initially On") { name ->
    Render(name, true)
  }
}

@Composable
private fun MDCLayoutGridCellsScope.Render(name: String, initiallySelected: Boolean) {
  var selected by remember { mutableStateOf(initiallySelected) }
  var disabled by remember { mutableStateOf(false) }
  MDCLayoutGridCells {
    MDCLayoutGridCell({
      span = 12u
      align = MDCLayoutGridCellOpts.Align.Middle
    }) {
      MDCSegmentedButton {
        MDCSegmentedButtonSegment(
          if (disabled) "Enable" else "Disable",
          opts = { this.selected = !disabled },
          attrs = { onSegmentSelected { disabled = !it.detail.selected } }
        )
      }
    }
    MDCLayoutGridCell({
      span = 12u
      align = MDCLayoutGridCellOpts.Align.Middle
    }) {
      MDCSwitch(
        selected = selected,
        attrs = {
          if (disabled) disabled()
          onClick {
            selected = !selected
            console.log("$name#$selected")
          }
        }
      )
    }
  }
}
