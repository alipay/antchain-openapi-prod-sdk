// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class User extends TeaModel {
    // 用户账户，手机号格式为： +区号-手机号，分享码：6位字母，支付宝登录账号：手机号/邮箱
    @NameInMap("user_id_no")
    @Validation(required = true)
    public String userIdNo;

    // 用户账号类型，当前仅支持手机号和分享码，PHONE：手机号，SHARE_CODE：分享码，
    // ALIPAY_LOGON_ID：支付宝登录账号
    @NameInMap("user_id_type")
    @Validation(required = true)
    public String userIdType;

    public static User build(java.util.Map<String, ?> map) throws Exception {
        User self = new User();
        return TeaModel.build(map, self);
    }

    public User setUserIdNo(String userIdNo) {
        this.userIdNo = userIdNo;
        return this;
    }
    public String getUserIdNo() {
        return this.userIdNo;
    }

    public User setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

}
