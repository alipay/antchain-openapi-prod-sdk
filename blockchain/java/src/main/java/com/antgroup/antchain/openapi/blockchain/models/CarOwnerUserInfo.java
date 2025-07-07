// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CarOwnerUserInfo extends TeaModel {
    // 用户id
    /**
     * <strong>example:</strong>
     * <p>XX</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("phone_num")
    @Validation(required = true)
    public String phoneNum;

    public static CarOwnerUserInfo build(java.util.Map<String, ?> map) throws Exception {
        CarOwnerUserInfo self = new CarOwnerUserInfo();
        return TeaModel.build(map, self);
    }

    public CarOwnerUserInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CarOwnerUserInfo setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

}
