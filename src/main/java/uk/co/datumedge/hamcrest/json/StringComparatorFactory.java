package uk.co.datumedge.hamcrest.json;

import static org.skyscreamer.jsonassert.JSONCompare.compareJSON;
import static uk.co.datumedge.hamcrest.json.JSONAssertComparisonResult.resultOf;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONCompareMode;

final class StringComparatorFactory implements JSONAssertComparatorFactory<String> {

    private static final JSONAssertComparatorFactory<String> INSTANCE = new StringComparatorFactory();

    static JSONAssertComparatorFactory<String> stringComparison() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private StringComparatorFactory() {
    }

    @Override
    public JSONComparator<String> comparatorWith(final JSONCompareMode compareMode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
