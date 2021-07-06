// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEnterpriseidInternaltwometaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用于内部统计的参数，外部用户请忽略
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    // 企业名称
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    // 企业证件号
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码
    @NameInMap("ep_cert_type")
    @Validation(required = true)
    public String epCertType;

    public static QueryEnterpriseidInternaltwometaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseidInternaltwometaRequest self = new QueryEnterpriseidInternaltwometaRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseidInternaltwometaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEnterpriseidInternaltwometaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEnterpriseidInternaltwometaRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

    public QueryEnterpriseidInternaltwometaRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public QueryEnterpriseidInternaltwometaRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public QueryEnterpriseidInternaltwometaRequest setEpCertType(String epCertType) {
        this.epCertType = epCertType;
        return this;
    }
    public String getEpCertType() {
        return this.epCertType;
    }

}
