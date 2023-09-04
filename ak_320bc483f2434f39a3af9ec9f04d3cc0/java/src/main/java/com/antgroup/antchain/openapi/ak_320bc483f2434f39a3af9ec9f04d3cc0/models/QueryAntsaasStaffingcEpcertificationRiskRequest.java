// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class QueryAntsaasStaffingcEpcertificationRiskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 一次认证的唯一标识,在调用认证初始化接口的时候获取
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 企业全称
    @NameInMap("ep_name")
    @Validation(required = true)
    public String epName;

    // 统一社会信用代码或营业执照注册号
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    public static QueryAntsaasStaffingcEpcertificationRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsaasStaffingcEpcertificationRiskRequest self = new QueryAntsaasStaffingcEpcertificationRiskRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntsaasStaffingcEpcertificationRiskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntsaasStaffingcEpcertificationRiskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntsaasStaffingcEpcertificationRiskRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public QueryAntsaasStaffingcEpcertificationRiskRequest setEpName(String epName) {
        this.epName = epName;
        return this;
    }
    public String getEpName() {
        return this.epName;
    }

    public QueryAntsaasStaffingcEpcertificationRiskRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

}
