// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEverifyTwometainternalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

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

    // 内部字段
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    public static QueryEverifyTwometainternalRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEverifyTwometainternalRequest self = new QueryEverifyTwometainternalRequest();
        return TeaModel.build(map, self);
    }

    public QueryEverifyTwometainternalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEverifyTwometainternalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEverifyTwometainternalRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public QueryEverifyTwometainternalRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public QueryEverifyTwometainternalRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

}
