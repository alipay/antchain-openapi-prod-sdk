// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidCorporateFourmetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 颁发证书的subject did
    // 
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 企业名称
    // 
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    // 企业证件号
    // 
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    // 法人姓名
    // 
    @NameInMap("legal_person_cert_name")
    @Validation(required = true)
    public String legalPersonCertName;

    // 法人身份证件号
    // 
    @NameInMap("legal_person_cert_no")
    @Validation(required = true)
    public String legalPersonCertNo;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidCorporateFourmetaRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidCorporateFourmetaRequest self = new StartDidCorporateFourmetaRequest();
        return TeaModel.build(map, self);
    }

    public StartDidCorporateFourmetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidCorporateFourmetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidCorporateFourmetaRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidCorporateFourmetaRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public StartDidCorporateFourmetaRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public StartDidCorporateFourmetaRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public StartDidCorporateFourmetaRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public StartDidCorporateFourmetaRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
