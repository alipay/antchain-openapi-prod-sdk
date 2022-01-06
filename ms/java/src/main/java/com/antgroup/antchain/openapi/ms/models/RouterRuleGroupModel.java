// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class RouterRuleGroupModel extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 服务id
    @NameInMap("data_id")
    public String dataId;

    // 是否生效，1 生效，0 未生效。默认未生效
    @NameInMap("enabled")
    public Long enabled;

    // 更新日期
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // id
    @NameInMap("id")
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 编辑人
    @NameInMap("operator")
    public String operator;

    // 路由规则
    @NameInMap("rules")
    public java.util.List<RouterRuleModel> rules;

    // service 表示服务
    @NameInMap("type")
    public String type;

    // 版本号
    @NameInMap("dispatch_version")
    public Long dispatchVersion;

    public static RouterRuleGroupModel build(java.util.Map<String, ?> map) throws Exception {
        RouterRuleGroupModel self = new RouterRuleGroupModel();
        return TeaModel.build(map, self);
    }

    public RouterRuleGroupModel setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public RouterRuleGroupModel setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public RouterRuleGroupModel setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public RouterRuleGroupModel setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public RouterRuleGroupModel setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RouterRuleGroupModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RouterRuleGroupModel setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public RouterRuleGroupModel setRules(java.util.List<RouterRuleModel> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<RouterRuleModel> getRules() {
        return this.rules;
    }

    public RouterRuleGroupModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RouterRuleGroupModel setDispatchVersion(Long dispatchVersion) {
        this.dispatchVersion = dispatchVersion;
        return this;
    }
    public Long getDispatchVersion() {
        return this.dispatchVersion;
    }

}
