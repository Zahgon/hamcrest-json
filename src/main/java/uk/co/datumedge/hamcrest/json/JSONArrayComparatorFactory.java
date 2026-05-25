package uk.co.datumedge.hamcrest.json;

import static org.skyscreamer.jsonassert.JSONCompare.compareJSON;
import static uk.co.datumedge.hamcrest.json.JSONAssertComparisonResult.resultOf;
import org.json.JSONArray;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONCompareMode;

/**
 * A {@code JSONComparator} implementation that compares {@code JSONArray}s, backed by SkyScreamer's JSONAssert library.
 */
final class JSONArrayComparatorFactory implements JSONAssertComparatorFactory<JSONArray> {

    private static final JSONAssertComparatorFactory<JSONArray> INSTANCE = new JSONArrayComparatorFactory();

    static JSONAssertComparatorFactory<JSONArray> jsonArrayComparison() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private JSONArrayComparatorFactory() {
    }

    @Override
    public JSONComparator<JSONArray> comparatorWith(final JSONCompareMode compareMode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
