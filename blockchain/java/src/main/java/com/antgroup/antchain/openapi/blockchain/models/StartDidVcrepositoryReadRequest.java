// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidVcrepositoryReadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求读取数据的did。
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 配合owner_did字段一起使用，指定查询目标VC时的过滤字段（可是标准VC内容的字段），指定此字段后，配合需指定filter_value字段。
    @NameInMap("filter_field")
    public String filterField;

    // 配合filter_field字段，设定具体过滤VC的使用的值，示例说明是在使用`type`字段过滤VC时候的样例。
    @NameInMap("filter_value")
    public String filterValue;

    // 如果没有配置参数verifiable_claim_id，则只能通过制定subject_did、issuer_did和filter参数来查找目标VC内容。 因此只有在调用方未知verifiable_claim_id的情况下，才需要配置此参数。
    @NameInMap("issuer_did")
    public String issuerDid;

    // 保留字段，请求读的did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
    @NameInMap("signature")
    public String signature;

    // 如果没有配置参数verifiable_claim_id，则只能通过制定subject_did、issuer_did和filter参数来查找目标VC内容。
    // 因此只有在调用方未知verifiable_claim_id的情况下，才需要配置此参数。
    @NameInMap("subject_did")
    public String subjectDid;

    // 调用方如果已知目标VC的verifiable_claim_id，建议通过配置此参数来读取目标VC内容，并且不需要配置subject_did、issuer_did和 filter相关参数。
    // 注意如果不配置此字段，则必须配置subject_did, issuer_did, filter_field, filter_value 字段。
    // 注意：如果此字段不是"vc:mychain:"前缀开头，则会使用如下规则生成：
    // verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(issuer_did, subject_did, verifiable_claim_id)); 此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
    @NameInMap("verifiable_claim_id")
    public String verifiableClaimId;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidVcrepositoryReadRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidVcrepositoryReadRequest self = new StartDidVcrepositoryReadRequest();
        return TeaModel.build(map, self);
    }

    public StartDidVcrepositoryReadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidVcrepositoryReadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidVcrepositoryReadRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidVcrepositoryReadRequest setFilterField(String filterField) {
        this.filterField = filterField;
        return this;
    }
    public String getFilterField() {
        return this.filterField;
    }

    public StartDidVcrepositoryReadRequest setFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }
    public String getFilterValue() {
        return this.filterValue;
    }

    public StartDidVcrepositoryReadRequest setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public StartDidVcrepositoryReadRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StartDidVcrepositoryReadRequest setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public StartDidVcrepositoryReadRequest setVerifiableClaimId(String verifiableClaimId) {
        this.verifiableClaimId = verifiableClaimId;
        return this;
    }
    public String getVerifiableClaimId() {
        return this.verifiableClaimId;
    }

    public StartDidVcrepositoryReadRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
