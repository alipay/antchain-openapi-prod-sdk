// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyPrivatecontractCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 私有云实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 私有云系统内部生成的id
    @NameInMap("user_inner_id")
    @Validation(required = true)
    public String userInnerId;

    // 用户类型,个人PERSON，企业ORG
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 用户名称, 个人为个人名称，企业为企业名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 用户证件类型，默认个人,身份证CRED_PSN_CH_IDCARD；
    // 企业,统一社会信用代码,CRED_ORG_USCC
    @NameInMap("user_cert_type")
    @Validation(required = true)
    public String userCertType;

    // 证件号码
    @NameInMap("user_cert_number")
    @Validation(required = true)
    public String userCertNumber;

    public static ApplyPrivatecontractCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyPrivatecontractCertRequest self = new ApplyPrivatecontractCertRequest();
        return TeaModel.build(map, self);
    }

    public ApplyPrivatecontractCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyPrivatecontractCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyPrivatecontractCertRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApplyPrivatecontractCertRequest setUserInnerId(String userInnerId) {
        this.userInnerId = userInnerId;
        return this;
    }
    public String getUserInnerId() {
        return this.userInnerId;
    }

    public ApplyPrivatecontractCertRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public ApplyPrivatecontractCertRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ApplyPrivatecontractCertRequest setUserCertType(String userCertType) {
        this.userCertType = userCertType;
        return this;
    }
    public String getUserCertType() {
        return this.userCertType;
    }

    public ApplyPrivatecontractCertRequest setUserCertNumber(String userCertNumber) {
        this.userCertNumber = userCertNumber;
        return this;
    }
    public String getUserCertNumber() {
        return this.userCertNumber;
    }

}
