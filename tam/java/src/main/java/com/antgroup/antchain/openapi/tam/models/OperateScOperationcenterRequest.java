// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class OperateScOperationcenterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 手机号/邮箱
    @NameInMap("receiver")
    @Validation(required = true)
    public String receiver;

    public static OperateScOperationcenterRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateScOperationcenterRequest self = new OperateScOperationcenterRequest();
        return TeaModel.build(map, self);
    }

    public OperateScOperationcenterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateScOperationcenterRequest setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }
    public String getReceiver() {
        return this.receiver;
    }

}
