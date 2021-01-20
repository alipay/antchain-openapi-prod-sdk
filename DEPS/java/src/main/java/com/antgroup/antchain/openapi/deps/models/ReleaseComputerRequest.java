// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ReleaseComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 计算资源id，可以指定多个
    @NameInMap("computer_ids")
    public java.util.List<String> computerIds;

    // 请求业务id，用于幂等性控制等，需要客户端提供并保证唯一。最大64位单字节字符
    @NameInMap("req_biz_id")
    public String reqBizId;

    public static ReleaseComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseComputerRequest self = new ReleaseComputerRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReleaseComputerRequest setComputerIds(java.util.List<String> computerIds) {
        this.computerIds = computerIds;
        return this;
    }
    public java.util.List<String> getComputerIds() {
        return this.computerIds;
    }

    public ReleaseComputerRequest setReqBizId(String reqBizId) {
        this.reqBizId = reqBizId;
        return this;
    }
    public String getReqBizId() {
        return this.reqBizId;
    }

}
