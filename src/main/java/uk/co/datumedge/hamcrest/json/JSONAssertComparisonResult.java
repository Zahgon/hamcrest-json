package uk.co.datumedge.hamcrest.json;

import static uk.co.datumedge.hamcrest.json.JSONComparisonResult.comparisonPassed;
import org.hamcrest.Description;
import org.hamcrest.SelfDescribing;
import org.skyscreamer.jsonassert.FieldComparisonFailure;
import org.skyscreamer.jsonassert.JSONCompareResult;

final class JSONAssertComparisonResult {

    private JSONAssertComparisonResult() {
    }

    static JSONComparisonResult resultOf(JSONCompareResult result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static JSONComparisonResult diagnose(final JSONCompareResult result) {
        return new JSONComparisonResult(new SelfDescribing() {

            @Override
            public void describeTo(Description description) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        });
    }
}
