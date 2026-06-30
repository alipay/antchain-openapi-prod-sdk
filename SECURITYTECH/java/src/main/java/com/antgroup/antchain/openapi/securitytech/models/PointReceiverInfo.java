// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class PointReceiverInfo extends TeaModel {
    // 联系人名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("contact_name")
    @Validation(required = true)
    public String contactName;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>13000000000</p>
     */
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 收货地址
    /**
     * <strong>example:</strong>
     * <p>上海市</p>
     */
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    public static PointReceiverInfo build(java.util.Map<String, ?> map) throws Exception {
        PointReceiverInfo self = new PointReceiverInfo();
        return TeaModel.build(map, self);
    }

    public PointReceiverInfo setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public PointReceiverInfo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public PointReceiverInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

}
