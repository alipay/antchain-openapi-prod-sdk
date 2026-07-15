// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ConfirmWitnessFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署确认数据
    @NameInMap("confirm_datas")
    @Validation(required = true)
    public java.util.List<WitnessConfirmData> confirmDatas;

    // 证据id列表，内部用户必传
    @NameInMap("evidence_ids")
    public java.util.List<String> evidenceIds;

    // 签署记录id列表，外部用户必传
    @NameInMap("signlog_ids")
    public java.util.List<String> signlogIds;

    // 签署票证
    @NameInMap("sign_ticket")
    @Validation(required = true)
    public String signTicket;

    // 见证流程id
    @NameInMap("witness_flow_id")
    @Validation(required = true)
    public String witnessFlowId;

    // 发起请求的实例应用ID
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 发起请求的鉴权token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static ConfirmWitnessFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmWitnessFlowRequest self = new ConfirmWitnessFlowRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmWitnessFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmWitnessFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmWitnessFlowRequest setConfirmDatas(java.util.List<WitnessConfirmData> confirmDatas) {
        this.confirmDatas = confirmDatas;
        return this;
    }
    public java.util.List<WitnessConfirmData> getConfirmDatas() {
        return this.confirmDatas;
    }

    public ConfirmWitnessFlowRequest setEvidenceIds(java.util.List<String> evidenceIds) {
        this.evidenceIds = evidenceIds;
        return this;
    }
    public java.util.List<String> getEvidenceIds() {
        return this.evidenceIds;
    }

    public ConfirmWitnessFlowRequest setSignlogIds(java.util.List<String> signlogIds) {
        this.signlogIds = signlogIds;
        return this;
    }
    public java.util.List<String> getSignlogIds() {
        return this.signlogIds;
    }

    public ConfirmWitnessFlowRequest setSignTicket(String signTicket) {
        this.signTicket = signTicket;
        return this;
    }
    public String getSignTicket() {
        return this.signTicket;
    }

    public ConfirmWitnessFlowRequest setWitnessFlowId(String witnessFlowId) {
        this.witnessFlowId = witnessFlowId;
        return this;
    }
    public String getWitnessFlowId() {
        return this.witnessFlowId;
    }

    public ConfirmWitnessFlowRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ConfirmWitnessFlowRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
