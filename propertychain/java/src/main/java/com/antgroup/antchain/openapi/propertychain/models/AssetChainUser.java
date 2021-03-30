// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class AssetChainUser extends TeaModel {
    // 申请Id
    @NameInMap("apply_id")
    public String applyId;

    // 联盟申请类型【NONE,JOIN,CREATE,ALL】
    @NameInMap("apply_type")
    public String applyType;

    // 当前联盟信息
    @NameInMap("current_league_info")
    public LeagueInfo currentLeagueInfo;

    // 企业名称
    @NameInMap("firm_name")
    public String firmName;

    // 申请流程状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
    @NameInMap("league_apply_status")
    public String leagueApplyStatus;

    // 是否是盟主
    @NameInMap("league_leader")
    public Boolean leagueLeader;

    // 登录名
    @NameInMap("login_name")
    public String loginName;

    // 蚂蚁金融科技租户ID
    @NameInMap("open_tenant")
    public String openTenant;

    // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
    @NameInMap("role_type")
    public String roleType;

    public static AssetChainUser build(java.util.Map<String, ?> map) throws Exception {
        AssetChainUser self = new AssetChainUser();
        return TeaModel.build(map, self);
    }

    public AssetChainUser setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public AssetChainUser setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public AssetChainUser setCurrentLeagueInfo(LeagueInfo currentLeagueInfo) {
        this.currentLeagueInfo = currentLeagueInfo;
        return this;
    }
    public LeagueInfo getCurrentLeagueInfo() {
        return this.currentLeagueInfo;
    }

    public AssetChainUser setFirmName(String firmName) {
        this.firmName = firmName;
        return this;
    }
    public String getFirmName() {
        return this.firmName;
    }

    public AssetChainUser setLeagueApplyStatus(String leagueApplyStatus) {
        this.leagueApplyStatus = leagueApplyStatus;
        return this;
    }
    public String getLeagueApplyStatus() {
        return this.leagueApplyStatus;
    }

    public AssetChainUser setLeagueLeader(Boolean leagueLeader) {
        this.leagueLeader = leagueLeader;
        return this;
    }
    public Boolean getLeagueLeader() {
        return this.leagueLeader;
    }

    public AssetChainUser setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public AssetChainUser setOpenTenant(String openTenant) {
        this.openTenant = openTenant;
        return this;
    }
    public String getOpenTenant() {
        return this.openTenant;
    }

    public AssetChainUser setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
