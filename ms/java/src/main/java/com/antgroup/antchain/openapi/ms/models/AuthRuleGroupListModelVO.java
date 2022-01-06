// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AuthRuleGroupListModelVO extends TeaModel {
    // 应用名称, 多个应用逗号分隔
    @NameInMap("app_name")
    public String appName;

    // 黑名单组id
    @NameInMap("black_group_id")
    public Long blackGroupId;

    // 黑名单状态（1开启/0关闭）
    @NameInMap("black_state")
    public Long blackState;

    // 鉴权源
    @NameInMap("data_id")
    public String dataId;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 主键
    @NameInMap("id")
    public Long id;

    // 租户实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 鉴权规则列表
    @NameInMap("rules")
    public java.util.List<AuthRuleModelVO> rules;

    // 生效状态（0 失败, 1 成功, 2 部分失败）
    @NameInMap("status")
    public Long status;

    // 白名单组id
    @NameInMap("white_group_id")
    public Long whiteGroupId;

    // 白名单状态（1开启/0关闭）
    @NameInMap("white_state")
    public Long whiteState;

    // 变更状态
    @NameInMap("change_status")
    public String changeStatus;

    public static AuthRuleGroupListModelVO build(java.util.Map<String, ?> map) throws Exception {
        AuthRuleGroupListModelVO self = new AuthRuleGroupListModelVO();
        return TeaModel.build(map, self);
    }

    public AuthRuleGroupListModelVO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AuthRuleGroupListModelVO setBlackGroupId(Long blackGroupId) {
        this.blackGroupId = blackGroupId;
        return this;
    }
    public Long getBlackGroupId() {
        return this.blackGroupId;
    }

    public AuthRuleGroupListModelVO setBlackState(Long blackState) {
        this.blackState = blackState;
        return this;
    }
    public Long getBlackState() {
        return this.blackState;
    }

    public AuthRuleGroupListModelVO setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AuthRuleGroupListModelVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AuthRuleGroupListModelVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AuthRuleGroupListModelVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AuthRuleGroupListModelVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AuthRuleGroupListModelVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AuthRuleGroupListModelVO setRules(java.util.List<AuthRuleModelVO> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<AuthRuleModelVO> getRules() {
        return this.rules;
    }

    public AuthRuleGroupListModelVO setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public AuthRuleGroupListModelVO setWhiteGroupId(Long whiteGroupId) {
        this.whiteGroupId = whiteGroupId;
        return this;
    }
    public Long getWhiteGroupId() {
        return this.whiteGroupId;
    }

    public AuthRuleGroupListModelVO setWhiteState(Long whiteState) {
        this.whiteState = whiteState;
        return this;
    }
    public Long getWhiteState() {
        return this.whiteState;
    }

    public AuthRuleGroupListModelVO setChangeStatus(String changeStatus) {
        this.changeStatus = changeStatus;
        return this;
    }
    public String getChangeStatus() {
        return this.changeStatus;
    }

}
