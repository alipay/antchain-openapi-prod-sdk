// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StartTlsnotaryTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 唯一的业务tlsnotary任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 加固文件的oss链接
    @NameInMap("oss_link")
    @Validation(required = true)
    public String ossLink;

    public static StartTlsnotaryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTlsnotaryTaskRequest self = new StartTlsnotaryTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartTlsnotaryTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartTlsnotaryTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartTlsnotaryTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartTlsnotaryTaskRequest setOssLink(String ossLink) {
        this.ossLink = ossLink;
        return this;
    }
    public String getOssLink() {
        return this.ossLink;
    }

}
