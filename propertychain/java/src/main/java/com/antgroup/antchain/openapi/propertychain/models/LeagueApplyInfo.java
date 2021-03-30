// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class LeagueApplyInfo extends TeaModel {
    // 申请账号
    @NameInMap("apply_account")
    public String applyAccount;

    // 申请企业
    @NameInMap("apply_corp")
    public String applyCorp;

    // 申请Id
    @NameInMap("apply_id")
    public String applyId;

    // 申请人手机
    @NameInMap("apply_mobile_num")
    public String applyMobileNum;

    // 申请时间
    @NameInMap("apply_time")
    public String applyTime;

    // 申请类型【NONE,JOIN,CREATE,ALL】
    @NameInMap("apply_type")
    public String applyType;

    // 当前流程状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
    @NameInMap("current_status")
    public String currentStatus;

    // 流程历史
    @NameInMap("flow_history")
    public java.util.List<FlowInfo> flowHistory;

    // 角色【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
    @NameInMap("role_type")
    public String roleType;

    public static LeagueApplyInfo build(java.util.Map<String, ?> map) throws Exception {
        LeagueApplyInfo self = new LeagueApplyInfo();
        return TeaModel.build(map, self);
    }

    public LeagueApplyInfo setApplyAccount(String applyAccount) {
        this.applyAccount = applyAccount;
        return this;
    }
    public String getApplyAccount() {
        return this.applyAccount;
    }

    public LeagueApplyInfo setApplyCorp(String applyCorp) {
        this.applyCorp = applyCorp;
        return this;
    }
    public String getApplyCorp() {
        return this.applyCorp;
    }

    public LeagueApplyInfo setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public LeagueApplyInfo setApplyMobileNum(String applyMobileNum) {
        this.applyMobileNum = applyMobileNum;
        return this;
    }
    public String getApplyMobileNum() {
        return this.applyMobileNum;
    }

    public LeagueApplyInfo setApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }
    public String getApplyTime() {
        return this.applyTime;
    }

    public LeagueApplyInfo setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public LeagueApplyInfo setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
        return this;
    }
    public String getCurrentStatus() {
        return this.currentStatus;
    }

    public LeagueApplyInfo setFlowHistory(java.util.List<FlowInfo> flowHistory) {
        this.flowHistory = flowHistory;
        return this;
    }
    public java.util.List<FlowInfo> getFlowHistory() {
        return this.flowHistory;
    }

    public LeagueApplyInfo setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
