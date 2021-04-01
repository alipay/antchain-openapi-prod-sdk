// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidVcrepositoryAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 配置此did列表，为这些did分配读取目标VC的权限，如果目标VC存储时是明文存储，则操作失败（无需做此权限管控）。
    @NameInMap("auth_did_list")
    @Validation(required = true)
    public java.util.List<String> authDidList;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 目标VC的owner，也就是VC内容中的subject身份。
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 指定查询目标VC时的过滤字段（可是标准VC内容的field），指定此字段后，配合需指定filter_value字段。
    @NameInMap("filter_field")
    @Validation(required = true)
    public String filterField;

    // ["VerifiableCredential","DelegateVCRepository","LocationInfo"]
    @NameInMap("filter_value")
    public String filterValue;

    // 保留字段，请求增加授权的调用方did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
    @NameInMap("signature")
    public String signature;

    // 读取目标证书VC的id，通过配置此参数可以直接找到目标VC。
    @NameInMap("verifiable_claim_id")
    public String verifiableClaimId;

    public static StartDidVcrepositoryAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidVcrepositoryAuthRequest self = new StartDidVcrepositoryAuthRequest();
        return TeaModel.build(map, self);
    }

    public StartDidVcrepositoryAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidVcrepositoryAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidVcrepositoryAuthRequest setAuthDidList(java.util.List<String> authDidList) {
        this.authDidList = authDidList;
        return this;
    }
    public java.util.List<String> getAuthDidList() {
        return this.authDidList;
    }

    public StartDidVcrepositoryAuthRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public StartDidVcrepositoryAuthRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidVcrepositoryAuthRequest setFilterField(String filterField) {
        this.filterField = filterField;
        return this;
    }
    public String getFilterField() {
        return this.filterField;
    }

    public StartDidVcrepositoryAuthRequest setFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }
    public String getFilterValue() {
        return this.filterValue;
    }

    public StartDidVcrepositoryAuthRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StartDidVcrepositoryAuthRequest setVerifiableClaimId(String verifiableClaimId) {
        this.verifiableClaimId = verifiableClaimId;
        return this;
    }
    public String getVerifiableClaimId() {
        return this.verifiableClaimId;
    }

}
