// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryAheadrealtimePricediffpredictionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 运行日，格式：yyyy-mm-dd
    @NameInMap("run_date")
    @Validation(required = true)
    public String runDate;

    // 省份行政编码，目前仅支持江苏省
    @NameInMap("province")
    @Validation(required = true)
    public String province;

    public static QueryAheadrealtimePricediffpredictionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAheadrealtimePricediffpredictionRequest self = new QueryAheadrealtimePricediffpredictionRequest();
        return TeaModel.build(map, self);
    }

    public QueryAheadrealtimePricediffpredictionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAheadrealtimePricediffpredictionRequest setRunDate(String runDate) {
        this.runDate = runDate;
        return this;
    }
    public String getRunDate() {
        return this.runDate;
    }

    public QueryAheadrealtimePricediffpredictionRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

}
