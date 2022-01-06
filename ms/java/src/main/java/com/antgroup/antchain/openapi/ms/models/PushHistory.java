// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class PushHistory extends TeaModel {
    // app name
    @NameInMap("app_name")
    public String appName;

    // 创建
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 推送历史id
    @NameInMap("id")
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 编辑人
    @NameInMap("operator")
    public String operator;

    // 推送内容
    // 
    // 
    // 
    // 
    @NameInMap("push_content")
    public String pushContent;

    // 逗号分隔的ruleId
    @NameInMap("rule_ids")
    public String ruleIds;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 推送目标
    @NameInMap("target")
    public String target;

    public static PushHistory build(java.util.Map<String, ?> map) throws Exception {
        PushHistory self = new PushHistory();
        return TeaModel.build(map, self);
    }

    public PushHistory setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public PushHistory setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PushHistory setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PushHistory setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PushHistory setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public PushHistory setPushContent(String pushContent) {
        this.pushContent = pushContent;
        return this;
    }
    public String getPushContent() {
        return this.pushContent;
    }

    public PushHistory setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public String getRuleIds() {
        return this.ruleIds;
    }

    public PushHistory setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PushHistory setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
