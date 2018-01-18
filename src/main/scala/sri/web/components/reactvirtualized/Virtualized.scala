package sri.web.components.reactvirtualized

import sri.core.{CreateElementJSNoInline, JSComponent, ReactElement, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scalajsplus.{OptDefault, OptionalParam}
import scalajsplus.macros.{FunctionObjectMacro, exclude}

@js.native
@JSImport("react-virtualized", "List")
object VirtualizedListComponent extends JSComponent[js.Object] {}

object VirtualizedList {

  def apply(height: Double,
            width: Double,
            rowCount: Int,
            rowHeight: Double,
            rowRenderer: VirtualizedListRowRendererOptions => ReactNode,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[VirtualizedListComponent.type, Unit] =
              null)
    : ReactElement { type Instance = VirtualizedListComponent.type } = {
    val p = FunctionObjectMacro()
    CreateElementJSNoInline[VirtualizedListComponent.type](
      VirtualizedListComponent,
      p,
      key = key,
      ref = ref)
  }
}
@js.native
trait VirtualizedListRowRendererOptions extends js.Object {
  val index: Int = js.native
  val key: String = js.native
  val isScrolling: Boolean = js.native
  val isVisible: Boolean = js.native
  val parent: js.Any = js.native
  val style: js.Object = js.native

}
@js.native
@JSImport("react-virtualized", "AutoSizer")
object AutoSizerComponent extends JSComponent[js.Object]

object AutoSizer {

  def apply(className: OptionalParam[String] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[AutoSizerComponent.type, Unit] = null)(
      children: js.Function1[AutoSizerChildOptions, ReactElement])
    : ReactElement { type Instance = AutoSizerComponent.type } = {
    val p = FunctionObjectMacro()
    CreateElementJSNoInline[AutoSizerComponent.type](
      AutoSizerComponent,
      p,
      key = key,
      ref = ref,
      children = js.Array(children.asInstanceOf[ReactNode]))
  }
}

@js.native
trait AutoSizerChildOptions extends js.Object {
  val height: Double = js.native
  val width: Double = js.native
}

@js.native
@JSImport("react-virtualized", "InfiniteLoader")
object InfiniteLoaderComponent extends JSComponent[js.Object]

object InfiniteLoader {

  def apply(isRowLoaded: InfiniteLoaderRowLoadedOptions => Boolean,
            loadMoreRows: InfiniteLoaderLoadMoreRowsOptions => js.Promise[Any],
            rowCount: Int,
            className: OptionalParam[String] = OptDefault,
            minimumBatchSize: OptionalParam[Int] = OptDefault,
            threshold: OptionalParam[Int] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[InfiniteLoaderComponent.type, Unit] =
              null)(
      children: js.Function1[InfiniteLoaderChildOptions, ReactElement])
    : ReactElement { type Instance = InfiniteLoaderComponent.type } = {
    val p = FunctionObjectMacro()
    CreateElementJSNoInline[InfiniteLoaderComponent.type](
      InfiniteLoaderComponent,
      p,
      key = key,
      ref = ref,
      children = js.Array(children.asInstanceOf[ReactNode]))
  }
}

@js.native
trait InfiniteLoaderRowLoadedOptions extends js.Object {
  val index: Int = js.native
}

@js.native
trait InfiniteLoaderLoadMoreRowsOptions extends js.Object {
  val startIndex: Int = js.native
  val stopIndex: Int = js.native
}

@js.native
trait InfiniteLoaderChildOptions extends js.Object {
  val onRowsRendered: js.Function = js.native
  val registerChild: js.Function = js.native
}
