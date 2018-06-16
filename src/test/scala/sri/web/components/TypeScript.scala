package sri.web.components

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
@js.native
@JSImport("typescript", JSImport.Namespace)
object Typescript extends js.Object {

  def createSourceFile(fileName: String,
                       code: String,
                       languageVersion: js.Any = ???,
                       setParentNodes: Boolean = ???): SourceFile =
    js.native

  def getCombinedModifierFlags(node: Node): js.Dynamic = js.native

  @js.native
  trait SyntaxKind extends js.Object

  @js.native
  object SyntaxKind extends js.Object {
    val Unknown: SyntaxKind = js.native
    val EndOfFileToken: SyntaxKind = js.native
    val SingleLineCommentTrivia: SyntaxKind = js.native
    val MultiLineCommentTrivia: SyntaxKind = js.native
    val NewLineTrivia: SyntaxKind = js.native
    val WhitespaceTrivia: SyntaxKind = js.native
    val ShebangTrivia: SyntaxKind = js.native
    val ConflictMarkerTrivia: SyntaxKind = js.native
    val NumericLiteral: SyntaxKind = js.native
    val StringLiteral: SyntaxKind = js.native
    val JsxText: SyntaxKind = js.native
    val JsxTextAllWhiteSpaces: SyntaxKind = js.native
    val RegularExpressionLiteral: SyntaxKind = js.native
    val NoSubstitutionTemplateLiteral: SyntaxKind = js.native
    val TemplateHead: SyntaxKind = js.native
    val TemplateMiddle: SyntaxKind = js.native
    val TemplateTail: SyntaxKind = js.native
    val OpenBraceToken: SyntaxKind = js.native
    val CloseBraceToken: SyntaxKind = js.native
    val OpenParenToken: SyntaxKind = js.native
    val CloseParenToken: SyntaxKind = js.native
    val OpenBracketToken: SyntaxKind = js.native
    val CloseBracketToken: SyntaxKind = js.native
    val DotToken: SyntaxKind = js.native
    val DotDotDotToken: SyntaxKind = js.native
    val SemicolonToken: SyntaxKind = js.native
    val CommaToken: SyntaxKind = js.native
    val LessThanToken: SyntaxKind = js.native
    val LessThanSlashToken: SyntaxKind = js.native
    val GreaterThanToken: SyntaxKind = js.native
    val LessThanEqualsToken: SyntaxKind = js.native
    val GreaterThanEqualsToken: SyntaxKind = js.native
    val EqualsEqualsToken: SyntaxKind = js.native
    val ExclamationEqualsToken: SyntaxKind = js.native
    val EqualsEqualsEqualsToken: SyntaxKind = js.native
    val ExclamationEqualsEqualsToken: SyntaxKind = js.native
    val EqualsGreaterThanToken: SyntaxKind = js.native
    val PlusToken: SyntaxKind = js.native
    val MinusToken: SyntaxKind = js.native
    val AsteriskToken: SyntaxKind = js.native
    val AsteriskAsteriskToken: SyntaxKind = js.native
    val SlashToken: SyntaxKind = js.native
    val PercentToken: SyntaxKind = js.native
    val PlusPlusToken: SyntaxKind = js.native
    val MinusMinusToken: SyntaxKind = js.native
    val LessThanLessThanToken: SyntaxKind = js.native
    val GreaterThanGreaterThanToken: SyntaxKind = js.native
    val GreaterThanGreaterThanGreaterThanToken: SyntaxKind = js.native
    val AmpersandToken: SyntaxKind = js.native
    val BarToken: SyntaxKind = js.native
    val CaretToken: SyntaxKind = js.native
    val ExclamationToken: SyntaxKind = js.native
    val TildeToken: SyntaxKind = js.native
    val AmpersandAmpersandToken: SyntaxKind = js.native
    val BarBarToken: SyntaxKind = js.native
    val QuestionToken: SyntaxKind = js.native
    val ColonToken: SyntaxKind = js.native
    val AtToken: SyntaxKind = js.native
    val EqualsToken: SyntaxKind = js.native
    val PlusEqualsToken: SyntaxKind = js.native
    val MinusEqualsToken: SyntaxKind = js.native
    val AsteriskEqualsToken: SyntaxKind = js.native
    val AsteriskAsteriskEqualsToken: SyntaxKind = js.native
    val SlashEqualsToken: SyntaxKind = js.native
    val PercentEqualsToken: SyntaxKind = js.native
    val LessThanLessThanEqualsToken: SyntaxKind = js.native
    val GreaterThanGreaterThanEqualsToken: SyntaxKind = js.native
    val GreaterThanGreaterThanGreaterThanEqualsToken: SyntaxKind = js.native
    val AmpersandEqualsToken: SyntaxKind = js.native
    val BarEqualsToken: SyntaxKind = js.native
    val CaretEqualsToken: SyntaxKind = js.native
    val Identifier: SyntaxKind = js.native
    val BreakKeyword: SyntaxKind = js.native
    val CaseKeyword: SyntaxKind = js.native
    val CatchKeyword: SyntaxKind = js.native
    val ClassKeyword: SyntaxKind = js.native
    val ConstKeyword: SyntaxKind = js.native
    val ContinueKeyword: SyntaxKind = js.native
    val DebuggerKeyword: SyntaxKind = js.native
    val DefaultKeyword: SyntaxKind = js.native
    val DeleteKeyword: SyntaxKind = js.native
    val DoKeyword: SyntaxKind = js.native
    val ElseKeyword: SyntaxKind = js.native
    val EnumKeyword: SyntaxKind = js.native
    val ExportKeyword: SyntaxKind = js.native
    val ExtendsKeyword: SyntaxKind = js.native
    val FalseKeyword: SyntaxKind = js.native
    val FinallyKeyword: SyntaxKind = js.native
    val ForKeyword: SyntaxKind = js.native
    val FunctionKeyword: SyntaxKind = js.native
    val IfKeyword: SyntaxKind = js.native
    val ImportKeyword: SyntaxKind = js.native
    val InKeyword: SyntaxKind = js.native
    val InstanceOfKeyword: SyntaxKind = js.native
    val NewKeyword: SyntaxKind = js.native
    val NullKeyword: SyntaxKind = js.native
    val ReturnKeyword: SyntaxKind = js.native
    val SuperKeyword: SyntaxKind = js.native
    val SwitchKeyword: SyntaxKind = js.native
    val ThisKeyword: SyntaxKind = js.native
    val ThrowKeyword: SyntaxKind = js.native
    val TrueKeyword: SyntaxKind = js.native
    val TryKeyword: SyntaxKind = js.native
    val TypeOfKeyword: SyntaxKind = js.native
    val VarKeyword: SyntaxKind = js.native
    val VoidKeyword: SyntaxKind = js.native
    val WhileKeyword: SyntaxKind = js.native
    val WithKeyword: SyntaxKind = js.native
    val ImplementsKeyword: SyntaxKind = js.native
    val InterfaceKeyword: SyntaxKind = js.native
    val LetKeyword: SyntaxKind = js.native
    val PackageKeyword: SyntaxKind = js.native
    val PrivateKeyword: SyntaxKind = js.native
    val ProtectedKeyword: SyntaxKind = js.native
    val PublicKeyword: SyntaxKind = js.native
    val StaticKeyword: SyntaxKind = js.native
    val YieldKeyword: SyntaxKind = js.native
    val AbstractKeyword: SyntaxKind = js.native
    val AsKeyword: SyntaxKind = js.native
    val AnyKeyword: SyntaxKind = js.native
    val AsyncKeyword: SyntaxKind = js.native
    val AwaitKeyword: SyntaxKind = js.native
    val BooleanKeyword: SyntaxKind = js.native
    val ConstructorKeyword: SyntaxKind = js.native
    val DeclareKeyword: SyntaxKind = js.native
    val GetKeyword: SyntaxKind = js.native
    val IsKeyword: SyntaxKind = js.native
    val KeyOfKeyword: SyntaxKind = js.native
    val ModuleKeyword: SyntaxKind = js.native
    val NamespaceKeyword: SyntaxKind = js.native
    val NeverKeyword: SyntaxKind = js.native
    val ReadonlyKeyword: SyntaxKind = js.native
    val RequireKeyword: SyntaxKind = js.native
    val NumberKeyword: SyntaxKind = js.native
    val ObjectKeyword: SyntaxKind = js.native
    val SetKeyword: SyntaxKind = js.native
    val StringKeyword: SyntaxKind = js.native
    val SymbolKeyword: SyntaxKind = js.native
    val TypeKeyword: SyntaxKind = js.native
    val UndefinedKeyword: SyntaxKind = js.native
    val FromKeyword: SyntaxKind = js.native
    val GlobalKeyword: SyntaxKind = js.native
    val OfKeyword: SyntaxKind = js.native
    val QualifiedName: SyntaxKind = js.native
    val ComputedPropertyName: SyntaxKind = js.native
    val TypeParameter: SyntaxKind = js.native
    val Parameter: SyntaxKind = js.native
    val Decorator: SyntaxKind = js.native
    val PropertySignature: SyntaxKind = js.native
    val PropertyDeclaration: SyntaxKind = js.native
    val MethodSignature: SyntaxKind = js.native
    val MethodDeclaration: SyntaxKind = js.native
    val Constructor: SyntaxKind = js.native
    val GetAccessor: SyntaxKind = js.native
    val SetAccessor: SyntaxKind = js.native
    val CallSignature: SyntaxKind = js.native
    val ConstructSignature: SyntaxKind = js.native
    val IndexSignature: SyntaxKind = js.native
    val TypePredicate: SyntaxKind = js.native
    val TypeReference: SyntaxKind = js.native
    val FunctionType: SyntaxKind = js.native
    val ConstructorType: SyntaxKind = js.native
    val TypeQuery: SyntaxKind = js.native
    val TypeLiteral: SyntaxKind = js.native
    val ArrayType: SyntaxKind = js.native
    val TupleType: SyntaxKind = js.native
    val UnionType: SyntaxKind = js.native
    val IntersectionType: SyntaxKind = js.native
    val ParenthesizedType: SyntaxKind = js.native
    val ThisType: SyntaxKind = js.native
    val TypeOperator: SyntaxKind = js.native
    val IndexedAccessType: SyntaxKind = js.native
    val MappedType: SyntaxKind = js.native
    val LiteralType: SyntaxKind = js.native
    val ObjectBindingPattern: SyntaxKind = js.native
    val ArrayBindingPattern: SyntaxKind = js.native
    val BindingElement: SyntaxKind = js.native
    val ArrayLiteralExpression: SyntaxKind = js.native
    val ObjectLiteralExpression: SyntaxKind = js.native
    val PropertyAccessExpression: SyntaxKind = js.native
    val ElementAccessExpression: SyntaxKind = js.native
    val CallExpression: SyntaxKind = js.native
    val NewExpression: SyntaxKind = js.native
    val TaggedTemplateExpression: SyntaxKind = js.native
    val TypeAssertionExpression: SyntaxKind = js.native
    val ParenthesizedExpression: SyntaxKind = js.native
    val FunctionExpression: SyntaxKind = js.native
    val ArrowFunction: SyntaxKind = js.native
    val DeleteExpression: SyntaxKind = js.native
    val TypeOfExpression: SyntaxKind = js.native
    val VoidExpression: SyntaxKind = js.native
    val AwaitExpression: SyntaxKind = js.native
    val PrefixUnaryExpression: SyntaxKind = js.native
    val PostfixUnaryExpression: SyntaxKind = js.native
    val BinaryExpression: SyntaxKind = js.native
    val ConditionalExpression: SyntaxKind = js.native
    val TemplateExpression: SyntaxKind = js.native
    val YieldExpression: SyntaxKind = js.native
    val SpreadElement: SyntaxKind = js.native
    val ClassExpression: SyntaxKind = js.native
    val OmittedExpression: SyntaxKind = js.native
    val ExpressionWithTypeArguments: SyntaxKind = js.native
    val AsExpression: SyntaxKind = js.native
    val NonNullExpression: SyntaxKind = js.native
    val MetaProperty: SyntaxKind = js.native
    val TemplateSpan: SyntaxKind = js.native
    val SemicolonClassElement: SyntaxKind = js.native
    val Block: SyntaxKind = js.native
    val VariableStatement: SyntaxKind = js.native
    val EmptyStatement: SyntaxKind = js.native
    val ExpressionStatement: SyntaxKind = js.native
    val IfStatement: SyntaxKind = js.native
    val DoStatement: SyntaxKind = js.native
    val WhileStatement: SyntaxKind = js.native
    val ForStatement: SyntaxKind = js.native
    val ForInStatement: SyntaxKind = js.native
    val ForOfStatement: SyntaxKind = js.native
    val ContinueStatement: SyntaxKind = js.native
    val BreakStatement: SyntaxKind = js.native
    val ReturnStatement: SyntaxKind = js.native
    val WithStatement: SyntaxKind = js.native
    val SwitchStatement: SyntaxKind = js.native
    val LabeledStatement: SyntaxKind = js.native
    val ThrowStatement: SyntaxKind = js.native
    val TryStatement: SyntaxKind = js.native
    val DebuggerStatement: SyntaxKind = js.native
    val VariableDeclaration: SyntaxKind = js.native
    val VariableDeclarationList: SyntaxKind = js.native
    val FunctionDeclaration: SyntaxKind = js.native
    val ClassDeclaration: SyntaxKind = js.native
    val InterfaceDeclaration: SyntaxKind = js.native
    val TypeAliasDeclaration: SyntaxKind = js.native
    val EnumDeclaration: SyntaxKind = js.native
    val ModuleDeclaration: SyntaxKind = js.native
    val ModuleBlock: SyntaxKind = js.native
    val CaseBlock: SyntaxKind = js.native
    val NamespaceExportDeclaration: SyntaxKind = js.native
    val ImportEqualsDeclaration: SyntaxKind = js.native
    val ImportDeclaration: SyntaxKind = js.native
    val ImportClause: SyntaxKind = js.native
    val NamespaceImport: SyntaxKind = js.native
    val NamedImports: SyntaxKind = js.native
    val ImportSpecifier: SyntaxKind = js.native
    val ExportAssignment: SyntaxKind = js.native
    val ExportDeclaration: SyntaxKind = js.native
    val NamedExports: SyntaxKind = js.native
    val ExportSpecifier: SyntaxKind = js.native
    val MissingDeclaration: SyntaxKind = js.native
    val ExternalModuleReference: SyntaxKind = js.native
    val JsxElement: SyntaxKind = js.native
    val JsxSelfClosingElement: SyntaxKind = js.native
    val JsxOpeningElement: SyntaxKind = js.native
    val JsxClosingElement: SyntaxKind = js.native
    val JsxAttribute: SyntaxKind = js.native
    val JsxAttributes: SyntaxKind = js.native
    val JsxSpreadAttribute: SyntaxKind = js.native
    val JsxExpression: SyntaxKind = js.native
    val CaseClause: SyntaxKind = js.native
    val DefaultClause: SyntaxKind = js.native
    val HeritageClause: SyntaxKind = js.native
    val CatchClause: SyntaxKind = js.native
    val PropertyAssignment: SyntaxKind = js.native
    val ShorthandPropertyAssignment: SyntaxKind = js.native
    val SpreadAssignment: SyntaxKind = js.native
    val EnumMember: SyntaxKind = js.native
    val SourceFile: SyntaxKind = js.native
    val Bundle: SyntaxKind = js.native
    val JSDocTypeExpression: SyntaxKind = js.native
    val JSDocAllType: SyntaxKind = js.native
    val JSDocUnknownType: SyntaxKind = js.native
    val JSDocNullableType: SyntaxKind = js.native
    val JSDocNonNullableType: SyntaxKind = js.native
    val JSDocOptionalType: SyntaxKind = js.native
    val JSDocFunctionType: SyntaxKind = js.native
    val JSDocVariadicType: SyntaxKind = js.native
    val JSDocComment: SyntaxKind = js.native
    val JSDocTag: SyntaxKind = js.native
    val JSDocAugmentsTag: SyntaxKind = js.native
    val JSDocClassTag: SyntaxKind = js.native
    val JSDocParameterTag: SyntaxKind = js.native
    val JSDocReturnTag: SyntaxKind = js.native
    val JSDocTypeTag: SyntaxKind = js.native
    val JSDocTemplateTag: SyntaxKind = js.native
    val JSDocTypedefTag: SyntaxKind = js.native
    val JSDocPropertyTag: SyntaxKind = js.native
    val JSDocTypeLiteral: SyntaxKind = js.native
    val SyntaxList: SyntaxKind = js.native
    val NotEmittedStatement: SyntaxKind = js.native
    val PartiallyEmittedExpression: SyntaxKind = js.native
    val CommaListExpression: SyntaxKind = js.native
    val MergeDeclarationMarker: SyntaxKind = js.native
    val EndOfDeclarationMarker: SyntaxKind = js.native
    val Count: SyntaxKind = js.native
    val FirstAssignment: SyntaxKind = js.native
    val LastAssignment: SyntaxKind = js.native
    val FirstCompoundAssignment: SyntaxKind = js.native
    val LastCompoundAssignment: SyntaxKind = js.native
    val FirstReservedWord: SyntaxKind = js.native
    val LastReservedWord: SyntaxKind = js.native
    val FirstKeyword: SyntaxKind = js.native
    val LastKeyword: SyntaxKind = js.native
    val FirstFutureReservedWord: SyntaxKind = js.native
    val LastFutureReservedWord: SyntaxKind = js.native
    val FirstTypeNode: SyntaxKind = js.native
    val LastTypeNode: SyntaxKind = js.native
    val FirstPunctuation: SyntaxKind = js.native
    val LastPunctuation: SyntaxKind = js.native
    val FirstToken: SyntaxKind = js.native
    val LastToken: SyntaxKind = js.native
    val FirstTriviaToken: SyntaxKind = js.native
    val LastTriviaToken: SyntaxKind = js.native
    val FirstLiteralToken: SyntaxKind = js.native
    val LastLiteralToken: SyntaxKind = js.native
    val FirstTemplateToken: SyntaxKind = js.native
    val LastTemplateToken: SyntaxKind = js.native
    val FirstBinaryOperator: SyntaxKind = js.native
    val LastBinaryOperator: SyntaxKind = js.native
    val FirstNode: SyntaxKind = js.native
    val FirstJSDocNode: SyntaxKind = js.native
    val LastJSDocNode: SyntaxKind = js.native
    val FirstJSDocTagNode: SyntaxKind = js.native
    val LastJSDocTagNode: SyntaxKind = js.native

  }
  @js.native
  trait ModifierFlag extends js.Object

  @js.native
  object ModifierFlags extends js.Object {

    val None: ModifierFlag = js.native
    val Export: ModifierFlag = js.native
    val Ambient: ModifierFlag = js.native
    val Public: ModifierFlag = js.native
    val Private: ModifierFlag = js.native
    val Protected: ModifierFlag = js.native
    val Readonly: ModifierFlag = js.native
    val Static: ModifierFlag = js.native
    val Abstract: ModifierFlag = js.native
    val Async: ModifierFlag = js.native
    val Default: ModifierFlag = js.native
    val Const: ModifierFlag = js.native
    val HasComputedFlags: ModifierFlag = js.native
    val AccessibilityModifier: ModifierFlag = js.native
    val ParameterPropertyModifier: ModifierFlag = js.native
    val NonPublicAccessibilityModifier: ModifierFlag = js.native
    val TypeScriptModifier: ModifierFlag = js.native
    val ExportDefault: ModifierFlag = js.native
  }

  @js.native
  trait ParentNode extends js.Object {
    def getChildren(): js.Array[Node] = js.native
  }

  @js.native
  trait Node extends js.Object {

    val kind: SyntaxKind = js.native

    val name: js.UndefOr[PropertyName] = js.native

    val modifiers: js.UndefOr[NodeArray[Modifier]] = js.native

    val parent: js.UndefOr[Node] = js.native

    def getChildren(): js.Array[Node] = js.native

    def getChildAt(index: Int): Node = js.native

  }

  @js.native
  trait Token[T] extends Node {}

  type Modifier = Token[SyntaxKind]

  @js.native
  trait SourceFile extends Declaration {
    val statements: NodeArray[Statement]
  }

  @js.native
  trait Identifier extends js.Object {

    val escapedText: String = js.native

    val text: String = js.native

  }

  @js.native
  trait EnumDeclaration extends js.Object {
    val modifiers: js.UndefOr[js.Array[ModifierFlag]] = js.native
    val name: js.UndefOr[Identifier] = js.native
    val members: js.Array[EnumMember] = js.native
  }

  type PropertyName = String | Double | Identifier

  type ModuleName = Identifier | String

  @js.native
  trait EnumMember extends js.Object {

    val kind: SyntaxKind = js.native

    val name: Identifier | String | Int | Double = js.native
  }

  @js.native
  trait NodeArray[T] extends js.Array[T] {
    val hasTrailingComma: js.UndefOr[Boolean] = js.native
  }

  @js.native
  trait TypeNode extends Node {
    val _typeNodeBrand: js.Any = js.native
  }

  @js.native
  trait TypeReferenceNode extends TypeNode {
    val typeName: Identifier | String | Int | Double = js.native
    val typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
  }

  @js.native
  trait TypeParameterDeclaration extends js.Object {

    val name: Identifier = js.native

    val constraint: js.UndefOr[TypeNode] = js.native

    val default: js.UndefOr[TypeNode] = js.native

  }

  @js.native
  trait PropertySignature extends TypeElement {
    val `type`: js.UndefOr[TypeNode] = js.native
  }

  type BindingPattern = ObjectBindingPattern | ArrayBindingPattern

  type BindingName = Identifier | BindingPattern

  @js.native
  trait BindingElement extends js.Object {

    val propertyName: js.UndefOr[PropertyName] = js.native

    val name: BindingName = js.native

  }

  @js.native
  trait ObjectBindingPattern extends Node {

    val elements: NodeArray[BindingElement] = js.native

  }

  @js.native
  trait ArrayBindingPattern extends Node {
    val elements: NodeArray[BindingElement] = js.native
  }

  @js.native
  trait QuestionToken extends js.Object {}

  @js.native
  trait ParameterDeclaration extends Node {
    val questionToken: js.UndefOr[QuestionToken] = js.native
    val dotDotDotToken: js.UndefOr[js.Any] = js.native
    val `type`: js.UndefOr[TypeNode] = js.native
  }

  @js.native
  trait SignatureDeclarationBase extends Node {

    val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] =
      js.native

    val parameters: NodeArray[ParameterDeclaration] = js.native

    val `type`: js.UndefOr[TypeNode] = js.native
  }

  @js.native
  trait MethodSignature extends SignatureDeclarationBase with TypeElement {}

  @js.native
  trait FunctionLikeDeclarationBase extends SignatureDeclarationBase {}

  @js.native
  trait FunctionDeclaration extends FunctionLikeDeclarationBase {}

  @js.native
  trait TypeElement extends NamedDeclaration with TypeNode {
    val questionToken: js.UndefOr[js.Object] = js.native
  }
  @js.native
  trait MethodDeclaration extends SignatureDeclarationBase {}

  @js.native
  trait ClassElement extends Node {}

  @js.native
  trait ConstructorDeclaration extends ClassElement {}

  @js.native
  trait SemicolonClassElement extends ClassElement {}

  @js.native
  trait ClassLikeDeclarationBase extends Node {
    val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] =
      js.native
    val heritageClauses: js.UndefOr[NodeArray[HeritageClause]] = js.native
  }

  @js.native
  trait Expression extends Node {
    val _expressionBrand: js.Any = js.native
  }

  @js.native
  trait UnaryExpression extends Expression {
    val _unaryExpressionBrand: js.Any = js.native
  }

  @js.native
  trait UpdateExpression extends UnaryExpression {
    val _updateExpressionBrand: js.Any = js.native
  }

  @js.native
  trait LeftHandSideExpression extends UpdateExpression {
    val _leftHandSideExpressionBrand: js.Any = js.native
  }

  @js.native
  trait ExpressionWithTypeArguments extends TypeNode {
    val expression: LeftHandSideExpression = js.native
    val typeArguments: NodeArray[TypeNode] = js.native
  }

  @js.native
  trait UnionTypeNode extends TypeNode {
    val types: NodeArray[TypeNode] = js.native
  }

  @js.native
  trait BooleanLiteral extends TypeNode {}

  @js.native
  trait LiteralLikeNode extends Node {
    val text: String = js.native
  }

  @js.native
  trait LiteralExpression extends LiteralLikeNode {}

  @js.native
  trait PrefixUnaryExpression extends Node

  @js.native
  trait LiteralTypeNode extends TypeNode {
    val literal: BooleanLiteral | LiteralExpression | PrefixUnaryExpression =
      js.native
  }

  @js.native
  trait HeritageClause extends Node {
    val token: SyntaxKind = js.native
    val types: NodeArray[ExpressionWithTypeArguments] = js.native
  }

  @js.native
  trait ExportSpecifier extends Node {
    val propertyName: js.UndefOr[Identifier] = js.native
  }

  @js.native
  trait ClassDeclaration extends ClassLikeDeclarationBase {}

  @js.native
  trait NamedExports extends Node {
    val elements: NodeArray[ExportSpecifier] = js.native
  }

  @js.native
  trait ExportDeclaration extends Node {
    val exportClause: js.UndefOr[NamedExports] = js.native
    val moduleSpecifier: js.UndefOr[Expression] = js.native
  }

  @js.native
  trait ModuleDeclaration extends DeclarationStatement {
    val body: js.UndefOr[ModuleBlock] = js.native
  }

  @js.native
  trait InterfaceDeclaration extends Node {
    val typeParameters: NodeArray[TypeParameterDeclaration] = js.native
    val heritageClauses: js.UndefOr[NodeArray[HeritageClause]] = js.native
    val members: NodeArray[TypeElement] = js.native
  }

  @js.native
  trait ExportAssignment extends Node {
    val isExportEquals: js.UndefOr[Boolean] = js.native
    val expression: Expression = js.native
  }

  @js.native
  trait VariableDeclarationList extends Node {
    val declarations: NodeArray[VariableDeclaration] = js.native
  }

  @js.native
  trait VariableDeclaration extends Node {
    val `type`: js.UndefOr[TypeNode] = js.native
    val initializer: js.UndefOr[Expression] = js.native
  }

  @js.native
  trait VariableStatement extends Node {
    val declarationList: VariableDeclarationList = js.native
  }

  @js.native
  trait Declaration extends Node

  @js.native
  trait NamedDeclaration extends Declaration

  @js.native
  trait DeclarationStatement extends NamedDeclaration {}

  @js.native
  trait TypeAliasDeclaration extends DeclarationStatement {
    val typeParameters: js.UndefOr[TypeParameterDeclaration] = js.native
    val `type`: TypeNode
  }

  @js.native
  trait Statement extends Node {}

  @js.native
  trait ModuleBlock extends Statement {

    val statements: NodeArray[Statement]
  }

  @js.native
  trait FunctionTypeNode extends TypeNode with SignatureDeclarationBase {}

  @js.native
  trait TypeLiteralNode extends TypeNode {
    val members: NodeArray[TypeElement] = js.native
  }

  @js.native
  trait JsxExpression extends Expression {
    val dotDotDotToken: js.UndefOr[js.Any] = js.native
    val expression: js.UndefOr[Expression] = js.native
  }

  @js.native
  trait ParenthesizedTypeNode extends TypeNode {
    val `type`: TypeNode = js.native
  }

  @js.native
  trait ArrayTypeNode extends TypeNode {
    val elementType: TypeNode
  }

}
