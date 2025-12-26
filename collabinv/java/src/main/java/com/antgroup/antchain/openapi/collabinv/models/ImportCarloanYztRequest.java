// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class ImportCarloanYztRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 手机号
    @NameInMap("phone_num")
    @Validation(required = true)
    public String phoneNum;

    // 车牌号
    @NameInMap("license_no")
    @Validation(required = true)
    public String licenseNo;

    public static ImportCarloanYztRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportCarloanYztRequest self = new ImportCarloanYztRequest();
        return TeaModel.build(map, self);
    }

    public ImportCarloanYztRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportCarloanYztRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportCarloanYztRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ImportCarloanYztRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public ImportCarloanYztRequest setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

}
