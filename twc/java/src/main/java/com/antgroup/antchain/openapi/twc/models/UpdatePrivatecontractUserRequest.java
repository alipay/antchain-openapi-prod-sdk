// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UpdatePrivatecontractUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 私有云实例id
    // 
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 私有云生成的内部用户Id
    // 
    @NameInMap("user_inner_id")
    @Validation(required = true)
    public String userInnerId;

    // 用户名称，个人用户为个人名称，企业为企业名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 企业用户必填，企业法人名称
    // 
    @NameInMap("legal_name")
    public String legalName;

    // 法人证件类型
    // 
    @NameInMap("legal_cert_type")
    public String legalCertType;

    // 法人证件对应的证件号码
    // 
    @NameInMap("legal_cert_number")
    public String legalCertNumber;

    public static UpdatePrivatecontractUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivatecontractUserRequest self = new UpdatePrivatecontractUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivatecontractUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdatePrivatecontractUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdatePrivatecontractUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdatePrivatecontractUserRequest setUserInnerId(String userInnerId) {
        this.userInnerId = userInnerId;
        return this;
    }
    public String getUserInnerId() {
        return this.userInnerId;
    }

    public UpdatePrivatecontractUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UpdatePrivatecontractUserRequest setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public UpdatePrivatecontractUserRequest setLegalCertType(String legalCertType) {
        this.legalCertType = legalCertType;
        return this;
    }
    public String getLegalCertType() {
        return this.legalCertType;
    }

    public UpdatePrivatecontractUserRequest setLegalCertNumber(String legalCertNumber) {
        this.legalCertNumber = legalCertNumber;
        return this;
    }
    public String getLegalCertNumber() {
        return this.legalCertNumber;
    }

}
