// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commerce.models;

import com.aliyun.tea.*;

public class CancelInstancebillPayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 月账单唯一表示
    @NameInMap("summary_unique_id")
    @Validation(required = true)
    public String summaryUniqueId;

    public static CancelInstancebillPayRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelInstancebillPayRequest self = new CancelInstancebillPayRequest();
        return TeaModel.build(map, self);
    }

    public CancelInstancebillPayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelInstancebillPayRequest setSummaryUniqueId(String summaryUniqueId) {
        this.summaryUniqueId = summaryUniqueId;
        return this;
    }
    public String getSummaryUniqueId() {
        return this.summaryUniqueId;
    }

}
