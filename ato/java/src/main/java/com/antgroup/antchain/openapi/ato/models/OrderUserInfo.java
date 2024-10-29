// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderUserInfo extends TeaModel {
    // 承租人名称
    @NameInMap("user_name")
    public String userName;

    // 承租人手机号
    @NameInMap("user_phone_number")
    public String userPhoneNumber;

    // 地址
    @NameInMap("user_address")
    public String userAddress;

    // 支付宝账号
    @NameInMap("alipay_uid")
    public String alipayUid;

    // 租赁类别
    // 1:个人用户
    // 2:企业用户
    @NameInMap("lessee_type")
    public Long lesseeType;

    // 承租人身份证
    @NameInMap("user_id")
    public String userId;

    public static OrderUserInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderUserInfo self = new OrderUserInfo();
        return TeaModel.build(map, self);
    }

    public OrderUserInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public OrderUserInfo setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
        return this;
    }
    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public OrderUserInfo setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public OrderUserInfo setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

    public OrderUserInfo setLesseeType(Long lesseeType) {
        this.lesseeType = lesseeType;
        return this;
    }
    public Long getLesseeType() {
        return this.lesseeType;
    }

    public OrderUserInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
