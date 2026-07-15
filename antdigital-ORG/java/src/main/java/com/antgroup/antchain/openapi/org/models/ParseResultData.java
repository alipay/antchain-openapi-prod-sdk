// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class ParseResultData extends TeaModel {
    // 手机号
    /**
     * <strong>example:</strong>
     * <p>132XXXXXXXX</p>
     */
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 是否有解析能力
    // 0:否
    // 1: 是
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
