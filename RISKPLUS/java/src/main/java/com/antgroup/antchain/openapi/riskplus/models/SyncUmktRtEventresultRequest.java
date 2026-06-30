// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SyncUmktRtEventresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 详细事件明细
    @NameInMap("detail")
    @Validation(required = true)
    public java.util.List<EventResultSyncDetail> detail;

    public static SyncUmktRtEventresultRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncUmktRtEventresultRequest self = new SyncUmktRtEventresultRequest();
        return TeaModel.build(map, self);
    }

    public SyncUmktRtEventresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncUmktRtEventresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncUmktRtEventresultRequest setDetail(java.util.List<EventResultSyncDetail> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.List<EventResultSyncDetail> getDetail() {
        return this.detail;
    }

}
