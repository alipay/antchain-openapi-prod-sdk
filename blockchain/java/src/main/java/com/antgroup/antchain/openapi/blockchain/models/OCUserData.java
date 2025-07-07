// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class OCUserData extends TeaModel {
    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTime;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>186xxxxx</p>
     */
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 用户姓名
    /**
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static OCUserData build(java.util.Map<String, ?> map) throws Exception {
        OCUserData self = new OCUserData();
        return TeaModel.build(map, self);
    }

    public OCUserData setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public OCUserData setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public OCUserData setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
