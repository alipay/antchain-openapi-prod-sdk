// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidVcrepositoryFilterandreadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求读取数据的did。
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 配合owner_did字段一起使用，指定查询目标VC时的过滤字段（可是标准VC内容的字段），指定此字段后，配合需指定filter_value字段。
    @NameInMap("filter_field")
    @Validation(required = true)
    public String filterField;

    // ["VerifiableCredential","DelegateVCRepository","LocationInfo"]
    @NameInMap("filter_value")
    @Validation(required = true)
    public String filterValue;

    // 保留字段，请求读的did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
    @NameInMap("signature")
    public String signature;

    // 目标VC的subject字段，参与过滤条件。
    @NameInMap("subject_did")
    @Validation(required = true)
    public String subjectDid;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidVcrepositoryFilterandreadRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidVcrepositoryFilterandreadRequest self = new StartDidVcrepositoryFilterandreadRequest();
        return TeaModel.build(map, self);
    }

    public StartDidVcrepositoryFilterandreadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidVcrepositoryFilterandreadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidVcrepositoryFilterandreadRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidVcrepositoryFilterandreadRequest setFilterField(String filterField) {
        this.filterField = filterField;
        return this;
    }
    public String getFilterField() {
        return this.filterField;
    }

    public StartDidVcrepositoryFilterandreadRequest setFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }
    public String getFilterValue() {
        return this.filterValue;
    }

    public StartDidVcrepositoryFilterandreadRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StartDidVcrepositoryFilterandreadRequest setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public StartDidVcrepositoryFilterandreadRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
