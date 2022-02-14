// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryFlowOnestepnotaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id，通过twc.notary.flow.onestepnotary.create接口获取
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 是否需要legal标，默认为false，如果需要则填true
    @NameInMap("need_legal_logo")
    public Boolean needLegalLogo;

    public static QueryFlowOnestepnotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowOnestepnotaryRequest self = new QueryFlowOnestepnotaryRequest();
        return TeaModel.build(map, self);
    }

    public QueryFlowOnestepnotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFlowOnestepnotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFlowOnestepnotaryRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public QueryFlowOnestepnotaryRequest setNeedLegalLogo(Boolean needLegalLogo) {
        this.needLegalLogo = needLegalLogo;
        return this;
    }
    public Boolean getNeedLegalLogo() {
        return this.needLegalLogo;
    }

}
