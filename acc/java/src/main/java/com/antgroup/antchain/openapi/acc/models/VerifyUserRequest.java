// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class VerifyUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账号id
    @NameInMap("user_id")
    @Validation(required = true)
    public Long userId;

    // 个人名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 证件类型
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 证件号码
    @NameInMap("cert_num")
    @Validation(required = true)
    public String certNum;

    // 个人证件正面图片,osskey值
    // 
    @NameInMap("cert_file_front_id")
    public String certFileFrontId;

    // 个人证件反面图片,oss的key值
    @NameInMap("cert_file_reverse_id")
    public String certFileReverseId;

    // JPG
    @NameInMap("cert_file_front_type")
    public String certFileFrontType;

    // 个人证件文件反面，文件类型
    @NameInMap("cert_file_reverse_type")
    public String certFileReverseType;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static VerifyUserRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyUserRequest self = new VerifyUserRequest();
        return TeaModel.build(map, self);
    }

    public VerifyUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyUserRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public VerifyUserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VerifyUserRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public VerifyUserRequest setCertNum(String certNum) {
        this.certNum = certNum;
        return this;
    }
    public String getCertNum() {
        return this.certNum;
    }

    public VerifyUserRequest setCertFileFrontId(String certFileFrontId) {
        this.certFileFrontId = certFileFrontId;
        return this;
    }
    public String getCertFileFrontId() {
        return this.certFileFrontId;
    }

    public VerifyUserRequest setCertFileReverseId(String certFileReverseId) {
        this.certFileReverseId = certFileReverseId;
        return this;
    }
    public String getCertFileReverseId() {
        return this.certFileReverseId;
    }

    public VerifyUserRequest setCertFileFrontType(String certFileFrontType) {
        this.certFileFrontType = certFileFrontType;
        return this;
    }
    public String getCertFileFrontType() {
        return this.certFileFrontType;
    }

    public VerifyUserRequest setCertFileReverseType(String certFileReverseType) {
        this.certFileReverseType = certFileReverseType;
        return this;
    }
    public String getCertFileReverseType() {
        return this.certFileReverseType;
    }

    public VerifyUserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
