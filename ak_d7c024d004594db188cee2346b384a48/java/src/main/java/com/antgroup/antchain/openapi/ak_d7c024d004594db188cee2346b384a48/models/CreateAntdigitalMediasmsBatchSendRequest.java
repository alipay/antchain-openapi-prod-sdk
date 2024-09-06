// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d7c024d004594db188cee2346b384a48.models;

import com.aliyun.tea.*;

public class CreateAntdigitalMediasmsBatchSendRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 群发任务id，不超过70个长度，用于幂等
    @NameInMap("mass_task_id")
    @Validation(required = true)
    public String massTaskId;

    // 模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 变量值需要按模板定义时的变量顺序传递且个数需要对等
    @NameInMap("content_list")
    @Validation(required = true)
    public java.util.List<ContentSend> contentList;

    // 是否立即发送
    @NameInMap("send_now")
    @Validation(required = true)
    public Boolean sendNow;

    // 立即发送时，该字段不消费
    @NameInMap("send_time")
    @Validation(required = true)
    public String sendTime;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 拓展字段
    @NameInMap("ext_info")
    public String extInfo;

    public static CreateAntdigitalMediasmsBatchSendRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntdigitalMediasmsBatchSendRequest self = new CreateAntdigitalMediasmsBatchSendRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntdigitalMediasmsBatchSendRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntdigitalMediasmsBatchSendRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntdigitalMediasmsBatchSendRequest setMassTaskId(String massTaskId) {
        this.massTaskId = massTaskId;
        return this;
    }
    public String getMassTaskId() {
        return this.massTaskId;
    }

    public CreateAntdigitalMediasmsBatchSendRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateAntdigitalMediasmsBatchSendRequest setContentList(java.util.List<ContentSend> contentList) {
        this.contentList = contentList;
        return this;
    }
    public java.util.List<ContentSend> getContentList() {
        return this.contentList;
    }

    public CreateAntdigitalMediasmsBatchSendRequest setSendNow(Boolean sendNow) {
        this.sendNow = sendNow;
        return this;
    }
    public Boolean getSendNow() {
        return this.sendNow;
    }

    public CreateAntdigitalMediasmsBatchSendRequest setSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public String getSendTime() {
        return this.sendTime;
    }

    public CreateAntdigitalMediasmsBatchSendRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateAntdigitalMediasmsBatchSendRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
