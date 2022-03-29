// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateSofamqTopicRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需更新读写权限的 Topic 所对应的实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 设置该 Topic 的读写模式。取值说明：6：同时支持读写；4：禁写；2：禁读。
    @NameInMap("perm")
    @Validation(required = true)
    public Long perm;

    // 需更新读写权限的 Topic 名称。一个用户下不可重复。
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static UpdateSofamqTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSofamqTopicRequest self = new UpdateSofamqTopicRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSofamqTopicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSofamqTopicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSofamqTopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSofamqTopicRequest setPerm(Long perm) {
        this.perm = perm;
        return this;
    }
    public Long getPerm() {
        return this.perm;
    }

    public UpdateSofamqTopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
