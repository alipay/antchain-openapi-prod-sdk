// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trustiot.models;

import com.aliyun.tea.*;

public class ImportBlockchainBotIotagentClientRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备标识列表
    @NameInMap("uid_list")
    @Validation(required = true)
    public java.util.List<String> uidList;

    // 实例Id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // SKU名称
    @NameInMap("sku_name")
    @Validation(required = true)
    public String skuName;

    // 模版智能体ID
    @NameInMap("template_agent_id")
    @Validation(required = true)
    public String templateAgentId;

    // 智能体话题
    @NameInMap("agent_topic")
    @Validation(required = true)
    public String agentTopic;

    public static ImportBlockchainBotIotagentClientRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportBlockchainBotIotagentClientRequest self = new ImportBlockchainBotIotagentClientRequest();
        return TeaModel.build(map, self);
    }

    public ImportBlockchainBotIotagentClientRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportBlockchainBotIotagentClientRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportBlockchainBotIotagentClientRequest setUidList(java.util.List<String> uidList) {
        this.uidList = uidList;
        return this;
    }
    public java.util.List<String> getUidList() {
        return this.uidList;
    }

    public ImportBlockchainBotIotagentClientRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportBlockchainBotIotagentClientRequest setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public ImportBlockchainBotIotagentClientRequest setTemplateAgentId(String templateAgentId) {
        this.templateAgentId = templateAgentId;
        return this;
    }
    public String getTemplateAgentId() {
        return this.templateAgentId;
    }

    public ImportBlockchainBotIotagentClientRequest setAgentTopic(String agentTopic) {
        this.agentTopic = agentTopic;
        return this;
    }
    public String getAgentTopic() {
        return this.agentTopic;
    }

}
