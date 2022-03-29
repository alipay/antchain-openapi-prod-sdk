// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XMetricResponse extends TeaModel {
    // timeseries
    @NameInMap("result")
    @Validation(required = true)
    public java.util.List<XMetricData> result;

    // result type
    @NameInMap("result_type")
    @Validation(required = true)
    public String resultType;

    public static XMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        XMetricResponse self = new XMetricResponse();
        return TeaModel.build(map, self);
    }

    public XMetricResponse setResult(java.util.List<XMetricData> result) {
        this.result = result;
        return this;
    }
    public java.util.List<XMetricData> getResult() {
        return this.result;
    }

    public XMetricResponse setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

}
