// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryAheadrealtimePricecompareRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 运行日，格式：yyyy-mm-dd
    @NameInMap("run_date")
    @Validation(required = true)
    public String runDate;

    // 省地区编码，目前仅支持江苏省
    @NameInMap("province")
    @Validation(required = true)
    public String province;

    public static QueryAheadrealtimePricecompareRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAheadrealtimePricecompareRequest self = new QueryAheadrealtimePricecompareRequest();
        return TeaModel.build(map, self);
    }

    public QueryAheadrealtimePricecompareRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAheadrealtimePricecompareRequest setRunDate(String runDate) {
        this.runDate = runDate;
        return this;
    }
    public String getRunDate() {
        return this.runDate;
    }

    public QueryAheadrealtimePricecompareRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

}
