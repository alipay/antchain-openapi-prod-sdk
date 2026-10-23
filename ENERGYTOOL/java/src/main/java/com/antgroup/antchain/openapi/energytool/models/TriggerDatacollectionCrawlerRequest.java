// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class TriggerDatacollectionCrawlerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 任务 id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 额外参数
    @NameInMap("extra")
    @Validation(required = true)
    public String extra;

    public static TriggerDatacollectionCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerDatacollectionCrawlerRequest self = new TriggerDatacollectionCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public TriggerDatacollectionCrawlerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TriggerDatacollectionCrawlerRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public TriggerDatacollectionCrawlerRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}
