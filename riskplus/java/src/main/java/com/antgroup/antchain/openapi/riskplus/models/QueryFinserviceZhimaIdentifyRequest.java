// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryFinserviceZhimaIdentifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 初始化时候返回的唯一标识
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    public static QueryFinserviceZhimaIdentifyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFinserviceZhimaIdentifyRequest self = new QueryFinserviceZhimaIdentifyRequest();
        return TeaModel.build(map, self);
    }

    public QueryFinserviceZhimaIdentifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFinserviceZhimaIdentifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFinserviceZhimaIdentifyRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
