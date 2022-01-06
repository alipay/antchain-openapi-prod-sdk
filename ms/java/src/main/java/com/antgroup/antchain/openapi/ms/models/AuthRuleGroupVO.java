// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AuthRuleGroupVO extends TeaModel {
    // 	服务id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 是否生效，1 生效，0 未生效。默认未生效
    @NameInMap("enabled")
    @Validation(required = true)
    public Long enabled;

    // 最后更新日期
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 	租户实例id	
    // 
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 一份白名单或者黑名单下所有服务鉴权规则
    @NameInMap("rules")
    @Validation(required = true)
    public java.util.List<AuthRuleVO> rules;

    // 下发是否成功, 0 失败, 1 成功, 2 部分失败
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // WHITELIST 或者是 BLACKLIST
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 规则组id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static AuthRuleGroupVO build(java.util.Map<String, ?> map) throws Exception {
        AuthRuleGroupVO self = new AuthRuleGroupVO();
        return TeaModel.build(map, self);
    }

    public AuthRuleGroupVO setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AuthRuleGroupVO setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public AuthRuleGroupVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AuthRuleGroupVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AuthRuleGroupVO setRules(java.util.List<AuthRuleVO> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<AuthRuleVO> getRules() {
        return this.rules;
    }

    public AuthRuleGroupVO setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public AuthRuleGroupVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AuthRuleGroupVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
