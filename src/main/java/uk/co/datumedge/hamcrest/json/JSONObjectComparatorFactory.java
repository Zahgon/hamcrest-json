package uk.co.datumedge.hamcrest.json;

import static org.skyscreamer.jsonassert.JSONCompare.compareJSON;
import static uk.co.datumedge.hamcrest.json.JSONAssertComparisonResult.resultOf;
import org.json.JSONException;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONCompareMode;

/**
 * A {@code JSONComparator} implementation that compares {@code JSONObject}s, backed by SkyScreamer's JSONAssert library.
 */
final class JSONObjectComparatorFactory implements JSONAssertComparatorFactory<JSONObject> {

    private static final JSONAssertComparatorFactory<JSONObject> INSTANCE = new JSONObjectComparatorFactory();

    static JSONAssertComparatorFactory<JSONObject> jsonObjectComparison() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private JSONObjectComparatorFactory() {
    }

    @Override
    public JSONComparator<JSONObject> comparatorWith(final JSONCompareMode compareMode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
