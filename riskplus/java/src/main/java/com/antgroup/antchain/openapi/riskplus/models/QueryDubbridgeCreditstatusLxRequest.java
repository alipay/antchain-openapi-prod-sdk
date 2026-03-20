// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCreditstatusLxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合作方代码
    @NameInMap("partner_code")
    @Validation(required = true)
    public String partnerCode;

    // 业务入参，json格式字符串
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 请求发送时间
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    public static QueryDubbridgeCreditstatusLxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCreditstatusLxRequest self = new QueryDubbridgeCreditstatusLxRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCreditstatusLxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeCreditstatusLxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeCreditstatusLxRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public QueryDubbridgeCreditstatusLxRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public QueryDubbridgeCreditstatusLxRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
