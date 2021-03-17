// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 邮箱地址，默认空	
    @NameInMap("email")
    public String email;

    // 证件号
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 证件类型，默认CRED_PSN_CH_IDCARD，详见个人证件类型说明文档（https://tech.antfin.com/docs/2/155166）
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 手机号码，默认空
    @NameInMap("mobile")
    public String mobile;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 用户唯一标识，可传入第三方平台的个人用户id、证件号、手机号、邮箱等，如果设置则作为账号唯一性字段，相同信息不可重复创建。（个人用户与机构的唯一标识不可重复）
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static CreateContractAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractAccountRequest self = new CreateContractAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractAccountRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateContractAccountRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public CreateContractAccountRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public CreateContractAccountRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateContractAccountRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateContractAccountRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
