// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AuthRuleGroup extends TeaModel {
    // 服务id
    @NameInMap("data_id")
    public String dataId;

    // 是否生效，1 生效，0 未生效。默认未生效
    @NameInMap("enabled")
    public Long enabled;

    // 租户实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 一份白名单或者黑名单下所有服务鉴权规则
    @NameInMap("rules")
    public java.util.List<AuthRuleVO> rules;

    // 下发是否成功, 0 失败, 1 成功, 2 部分失败
    @NameInMap("status")
    public Long status;

    // whitelist/blacklist
    @NameInMap("type")
    public String type;

    // 最后更新时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static AuthRuleGroup build(java.util.Map<String, ?> map) throws Exception {
        AuthRuleGroup self = new AuthRuleGroup();
        return TeaModel.build(map, self);
    }

    public AuthRuleGroup setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AuthRuleGroup setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public AuthRuleGroup setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AuthRuleGroup setRules(java.util.List<AuthRuleVO> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<AuthRuleVO> getRules() {
        return this.rules;
    }

    public AuthRuleGroup setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public AuthRuleGroup setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AuthRuleGroup setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
