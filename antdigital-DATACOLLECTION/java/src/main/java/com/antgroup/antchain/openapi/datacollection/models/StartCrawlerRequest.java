// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.datacollection.models;

import com.aliyun.tea.*;

public class StartCrawlerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 采集任务实例id
    @NameInMap("inst_id")
    @Validation(required = true)
    public String instId;

    public static StartCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCrawlerRequest self = new StartCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public StartCrawlerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartCrawlerRequest setInstId(String instId) {
        this.instId = instId;
        return this;
    }
    public String getInstId() {
        return this.instId;
    }

}
