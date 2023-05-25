// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defininstchannel.models;

import com.aliyun.tea.*;

public class SubmitFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 通用参数
    @NameInMap("sys_param")
    @Validation(required = true)
    public SystemParam sysParam;

    // 业务参数
    @NameInMap("encoded_biz_param")
    @Validation(required = true)
    public String encodedBizParam;

    public static SubmitFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFileRequest self = new SubmitFileRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitFileRequest setSysParam(SystemParam sysParam) {
        this.sysParam = sysParam;
        return this;
    }
    public SystemParam getSysParam() {
        return this.sysParam;
    }

    public SubmitFileRequest setEncodedBizParam(String encodedBizParam) {
        this.encodedBizParam = encodedBizParam;
        return this;
    }
    public String getEncodedBizParam() {
        return this.encodedBizParam;
    }

}
