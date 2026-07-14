// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateDigitalregistrationApplyformsealflowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数登ID
    @NameInMap("digital_register_id")
    @Validation(required = true)
    public String digitalRegisterId;

    // ewrwrwerwr
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 签章经办人身份证号（数登申请人是企业的场景下必填）
    @NameInMap("agent_cert_no")
    public String agentCertNo;

    // 签章经办人姓名（数登申请人是企业的场景下必填）
    @NameInMap("agent_cert_name")
    public String agentCertName;

    public static CreateDigitalregistrationApplyformsealflowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalregistrationApplyformsealflowRequest self = new CreateDigitalregistrationApplyformsealflowRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalregistrationApplyformsealflowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDigitalregistrationApplyformsealflowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDigitalregistrationApplyformsealflowRequest setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

    public CreateDigitalregistrationApplyformsealflowRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDigitalregistrationApplyformsealflowRequest setAgentCertNo(String agentCertNo) {
        this.agentCertNo = agentCertNo;
        return this;
    }
    public String getAgentCertNo() {
        return this.agentCertNo;
    }

    public CreateDigitalregistrationApplyformsealflowRequest setAgentCertName(String agentCertName) {
        this.agentCertName = agentCertName;
        return this;
    }
    public String getAgentCertName() {
        return this.agentCertName;
    }

}
