//package ppp
//
//import com.sun.org.apache.bcel.internal.Const
//
///**
// * Interface for CSV Reader settings
// *
// * @author doyaaaaaken
// */
//interface ICsvReaderContext {
//
//    /**
//     * Character used as quote between each fields
//     *
//     * ex.)
//     *     '"'
//     *     '\''
//     */
//    val quoteChar: Char
//
//    /**
//     * Character used as delimiter between each fields
//     *
//     * ex.)
//     *     ","
//     *     "\t" (TSV file)
//     */
//    val delimiter: Char
//
//    /**
//     * Character to escape quote inside field string.
//     * Normally, you don't have to change this option.
//     *
//     * According to [CSV specification](https://tools.ietf.org/html/rfc4180#section-2),
//     * > If double-quotes are used to enclose fields, then a double-quote appearing inside a field must be escaped by preceding it with another double quote.
//     * > For example:
//     * > "aaa","b""bb","ccc"
//     */
//    val escapeChar: Char
//
//    /**
//     * If empty line is found, skip it or not (=throw an exception).
//     */
//    val skipEmptyLine: Boolean
//
//    /**
//     * If a invalid row which has different number of fields from other rows is found, skip it or not (=throw an exception).
//     */
//    @Deprecated("Use insufficientFieldsRowBehaviour and excessRowsBehaviour to specify 'ignore'")
//    val skipMissMatchedRow: Boolean
//
//    /**
//     * If a header occurs multiple times whether auto renaming should be applied when `readAllWithHeaderAsSequence()` (=throw an exception).
//     *
//     * Renaming is done based on occurrence and only applied from the first detected duplicate onwards.
//     * ex:
//     * [a,b,b,b,c,a] => [a,b,b_2,b_3,c,a_2]
//     */
//    val autoRenameDuplicateHeaders: Boolean
//
//    /**
//     * If a row does not have the expected number of fields (columns), how, and if, the reader should proceed
//     */
//    val insufficientFieldsRowBehaviour: InsufficientFieldsRowBehaviour
//
//    /**
//     * If a row exceeds have the expected number of fields (columns), how, and if, the reader should proceed
//     */
//    val excessFieldsRowBehaviour: ExcessFieldsRowBehaviour
//}
//
//enum class InsufficientFieldsRowBehaviour {
//
//    /**
//     * Throw an exception (default)
//     */
//    ERROR,
//
//    /**
//     * Ignore the row and skip to the next row
//     */
//    IGNORE
//}
//
//enum class ExcessFieldsRowBehaviour {
//
//    /**
//     * Throw an exception (default)
//     */
//    ERROR,
//
//    /**
//     * Ignore the row and skip to the next row
//     */
//    IGNORE,
//
//    /**
//     * Trim the excess fields from the row (e.g. if 8 fields are present and 7 are expected, return the first 7 fields)
//     */
//    TRIM
//}
//
///**
// * CSV Reader settings used in `csvReader` DSL method.
// *
// * @author doyaaaaaken
// */
//class CsvReaderContext : ICsvReaderContext {
//    override var quoteChar: Char = '"'
//    override var delimiter: Char = ','
//    override var escapeChar: Char = '"'
//    override var skipEmptyLine: Boolean = false
//    override var skipMissMatchedRow: Boolean = false
//    override var autoRenameDuplicateHeaders: Boolean = false
//    override var insufficientFieldsRowBehaviour: InsufficientFieldsRowBehaviour = InsufficientFieldsRowBehaviour.ERROR
//    override var excessFieldsRowBehaviour: ExcessFieldsRowBehaviour = ExcessFieldsRowBehaviour.ERROR
//}