package uk.co.datumedge.hamcrest.json;

import static org.skyscreamer.jsonassert.JSONCompareMode.STRICT;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONCompareMode;

final class JSONAssertComparator<T> implements JSONModalComparator<T> {

    private final JSONAssertComparatorFactory<T> factory;

    private final JSONCompareMode compareMode;

    static <T> JSONModalComparator<T> modalComparatorFor(JSONAssertComparatorFactory<T> factory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private JSONAssertComparator(JSONAssertComparatorFactory<T> factory) {
        this(factory, STRICT);
    }

    private JSONAssertComparator(JSONAssertComparatorFactory<T> factory, JSONCompareMode compareMode) {
        this.factory = factory;
        this.compareMode = compareMode;
    }

    @Override
    public JSONComparisonResult compare(T expected, T actual) throws JSONException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public JSONModalComparator<T> butAllowingAnyArrayOrdering() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public JSONModalComparator<T> butAllowingExtraUnexpectedFields() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
