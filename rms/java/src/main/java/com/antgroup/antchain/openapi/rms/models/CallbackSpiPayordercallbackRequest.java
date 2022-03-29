// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CallbackSpiPayordercallbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 南天门支付后回调请求, 见 http://help.aliyun-inc.com/internaldoc/detail/134798.html?spm=ntm.workbench-devPlatform-extendPoint.0.0.42a919afQhBhEB.
    @NameInMap("data")
    public String data;

    public static CallbackSpiPayordercallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackSpiPayordercallbackRequest self = new CallbackSpiPayordercallbackRequest();
        return TeaModel.build(map, self);
    }

    public CallbackSpiPayordercallbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackSpiPayordercallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
