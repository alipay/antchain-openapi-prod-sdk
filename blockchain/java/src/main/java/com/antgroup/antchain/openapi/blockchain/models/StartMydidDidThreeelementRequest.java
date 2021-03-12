// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidDidThreeelementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户自有用户的唯一id
    @NameInMap("custumor_uid")
    @Validation(required = true, maxLength = 64, minLength = 10)
    public String custumorUid;

    // 实名认证身份证号
    @NameInMap("verify_info_id")
    @Validation(required = true, maxLength = 20, minLength = 14)
    public String verifyInfoId;

    // 实名认证用户名
    @NameInMap("verify_info_name")
    @Validation(required = true, maxLength = 20, minLength = 4)
    public String verifyInfoName;

    // 电话号码
    @NameInMap("verify_info_phone")
    @Validation(required = true, maxLength = 11, minLength = 11)
    public String verifyInfoPhone;

    public static StartMydidDidThreeelementRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMydidDidThreeelementRequest self = new StartMydidDidThreeelementRequest();
        return TeaModel.build(map, self);
    }

    public StartMydidDidThreeelementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMydidDidThreeelementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMydidDidThreeelementRequest setCustumorUid(String custumorUid) {
        this.custumorUid = custumorUid;
        return this;
    }
    public String getCustumorUid() {
        return this.custumorUid;
    }

    public StartMydidDidThreeelementRequest setVerifyInfoId(String verifyInfoId) {
        this.verifyInfoId = verifyInfoId;
        return this;
    }
    public String getVerifyInfoId() {
        return this.verifyInfoId;
    }

    public StartMydidDidThreeelementRequest setVerifyInfoName(String verifyInfoName) {
        this.verifyInfoName = verifyInfoName;
        return this;
    }
    public String getVerifyInfoName() {
        return this.verifyInfoName;
    }

    public StartMydidDidThreeelementRequest setVerifyInfoPhone(String verifyInfoPhone) {
        this.verifyInfoPhone = verifyInfoPhone;
        return this;
    }
    public String getVerifyInfoPhone() {
        return this.verifyInfoPhone;
    }

}
