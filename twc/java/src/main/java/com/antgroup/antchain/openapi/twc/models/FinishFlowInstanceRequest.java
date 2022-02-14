// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class FinishFlowInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id，通过twc.notary.instance.create(创建存证流程实例)获取
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 是否需要legal标，默认为false，如果需要则填true
    @NameInMap("need_legal_logo")
    public Boolean needLegalLogo;

    public static FinishFlowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishFlowInstanceRequest self = new FinishFlowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public FinishFlowInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishFlowInstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishFlowInstanceRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public FinishFlowInstanceRequest setNeedLegalLogo(Boolean needLegalLogo) {
        this.needLegalLogo = needLegalLogo;
        return this;
    }
    public Boolean getNeedLegalLogo() {
        return this.needLegalLogo;
    }

}
