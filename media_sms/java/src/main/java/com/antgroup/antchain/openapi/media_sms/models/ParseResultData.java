// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class ParseResultData extends TeaModel {
    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 是否有解析能力
    // 0:否
    // 1: 是
    @NameInMap("receive_state")
    @Validation(required = true)
    public Long receiveState;

    public static ParseResultData build(java.util.Map<String, ?> map) throws Exception {
        ParseResultData self = new ParseResultData();
        return TeaModel.build(map, self);
    }

    public ParseResultData setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ParseResultData setReceiveState(Long receiveState) {
        this.receiveState = receiveState;
        return this;
    }
    public Long getReceiveState() {
        return this.receiveState;
    }

}
