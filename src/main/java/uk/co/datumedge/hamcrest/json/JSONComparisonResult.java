package uk.co.datumedge.hamcrest.json;

import org.hamcrest.Description;
import org.hamcrest.SelfDescribing;

/**
 * Models the result of a comparison between two JSON documents.
 */
public final class JSONComparisonResult implements SelfDescribing {

    private static final JSONComparisonResult PASSED = new JSONComparisonResult();

    private final boolean passed;

    private final SelfDescribing description;

    private JSONComparisonResult() {
        this.passed = true;
        this.description = new SelfDescribing() {

            @Override
            public void describeTo(Description description) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        };
    }

    public JSONComparisonResult(SelfDescribing description) {
        this.passed = false;
        this.description = description;
    }

    @Override
    public void describeTo(Description description) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean failed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean passed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static JSONComparisonResult comparisonPassed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
