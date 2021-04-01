// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidZkpverifiableclaimProofRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // vc对应的授予者
    @NameInMap("subject")
    @Validation(required = true)
    public String subject;

    // vc原文
    @NameInMap("vc")
    @Validation(required = true)
    public String vc;

    // zkp证明生成信息
    @NameInMap("zkp_info")
    @Validation(required = true)
    public java.util.List<DidZKPInfo> zkpInfo;

    public static StartDidZkpverifiableclaimProofRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidZkpverifiableclaimProofRequest self = new StartDidZkpverifiableclaimProofRequest();
        return TeaModel.build(map, self);
    }

    public StartDidZkpverifiableclaimProofRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidZkpverifiableclaimProofRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidZkpverifiableclaimProofRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public StartDidZkpverifiableclaimProofRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public StartDidZkpverifiableclaimProofRequest setVc(String vc) {
        this.vc = vc;
        return this;
    }
    public String getVc() {
        return this.vc;
    }

    public StartDidZkpverifiableclaimProofRequest setZkpInfo(java.util.List<DidZKPInfo> zkpInfo) {
        this.zkpInfo = zkpInfo;
        return this;
    }
    public java.util.List<DidZKPInfo> getZkpInfo() {
        return this.zkpInfo;
    }

}
