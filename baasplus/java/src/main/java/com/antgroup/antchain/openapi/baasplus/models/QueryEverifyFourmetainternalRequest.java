// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEverifyFourmetainternalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称
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

    // 企业法人身份证号码
    // 
    @NameInMap("legal_person_cert_no")
    @Validation(required = true)
    public String legalPersonCertNo;

    // 内部字段
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    public static QueryEverifyFourmetainternalRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEverifyFourmetainternalRequest self = new QueryEverifyFourmetainternalRequest();
        return TeaModel.build(map, self);
    }

    public QueryEverifyFourmetainternalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEverifyFourmetainternalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEverifyFourmetainternalRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public QueryEverifyFourmetainternalRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public QueryEverifyFourmetainternalRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public QueryEverifyFourmetainternalRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public QueryEverifyFourmetainternalRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

}
