// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d7c024d004594db188cee2346b384a48.models;

import com.aliyun.tea.*;

public class SmsSendStatus extends TeaModel {
    // 手机号
    @NameInMap("phone_no")
    @Validation(required = true)
    public String phoneNo;

    // 发送状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 发送状态描述
    @NameInMap("detail_msg")
    @Validation(required = true)
    public String detailMsg;

    public static SmsSendStatus build(java.util.Map<String, ?> map) throws Exception {
        SmsSendStatus self = new SmsSendStatus();
        return TeaModel.build(map, self);
    }

    public SmsSendStatus setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public SmsSendStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SmsSendStatus setDetailMsg(String detailMsg) {
        this.detailMsg = detailMsg;
        return this;
    }
    public String getDetailMsg() {
        return this.detailMsg;
    }

}
