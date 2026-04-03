// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportIotagentClientRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例ID，由蚂蚁提供
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // SKU名称，由蚂蚁提供
    @NameInMap("sku_name")
    @Validation(required = true)
    public String skuName;

    // 模版智能体ID，由蚂蚁提供
    @NameInMap("template_agent_id")
    @Validation(required = true)
    public String templateAgentId;

    // 话题，由蚂蚁提供
    @NameInMap("agent_topic")
    @Validation(required = true)
    public String agentTopic;

    // 设备标识列表
    @NameInMap("uid_list")
    @Validation(required = true)
    public java.util.List<String> uidList;

    public static ImportIotagentClientRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportIotagentClientRequest self = new ImportIotagentClientRequest();
        return TeaModel.build(map, self);
    }

    public ImportIotagentClientRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportIotagentClientRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportIotagentClientRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportIotagentClientRequest setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public ImportIotagentClientRequest setTemplateAgentId(String templateAgentId) {
        this.templateAgentId = templateAgentId;
        return this;
    }
    public String getTemplateAgentId() {
        return this.templateAgentId;
    }

    public ImportIotagentClientRequest setAgentTopic(String agentTopic) {
        this.agentTopic = agentTopic;
        return this;
    }
    public String getAgentTopic() {
        return this.agentTopic;
    }

    public ImportIotagentClientRequest setUidList(java.util.List<String> uidList) {
        this.uidList = uidList;
        return this;
    }
    public java.util.List<String> getUidList() {
        return this.uidList;
    }

}
