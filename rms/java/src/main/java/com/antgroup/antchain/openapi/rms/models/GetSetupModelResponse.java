// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetSetupModelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 主站试点的产品是否打开
    @NameInMap("beta_plugin")
    public Boolean betaPlugin;

    // showBizDomain
    @NameInMap("show_biz_domain")
    public Boolean showBizDomain;

    // drm 推送的地址列表, 如果为空，前端默认主站，如果不为空，按照配置来渲染
    @NameInMap("site_drms")
    public java.util.List<SiteWithDrm> siteDrms;

    // 是不是租户总览用空间总览
    @NameInMap("tenant_use_ws_overview")
    public Boolean tenantUseWsOverview;

    // iaas监控开关
    @NameInMap("iaas_monitor")
    public Boolean iaasMonitor;

    // 应用监控的技术栈
    @NameInMap("app_stack")
    public String appStack;

    // 应用监控的技术栈实体
    @NameInMap("app_stack_entity")
    public String appStackEntity;

    // 站点
    @NameInMap("site_env")
    public String siteEnv;

    // useNewAlarmConfig
    @NameInMap("use_new_alarm_config")
    public Boolean useNewAlarmConfig;

    // goc推送开关
    @NameInMap("goc_push_open")
    public Boolean gocPushOpen;

    // 是否打开高级产品配置，脚本、联合计算等
    @NameInMap("adv_custom_pluin_open")
    public Boolean advCustomPluinOpen;

    // 导航是否鉴权
    @NameInMap("nav_auth")
    public Boolean navAuth;

    // unFocusPageShutFresh
    @NameInMap("un_focus_page_shut_fresh")
    public Boolean unFocusPageShutFresh;

    // lineChartIncreFresh
    @NameInMap("line_chart_incre_fresh")
    public Boolean lineChartIncreFresh;

    // ws开关
    @NameInMap("show_ws")
    public Boolean showWs;

    // Tenant开关
    @NameInMap("show_tenant")
    public Boolean showTenant;

    // searchEagleEye
    @NameInMap("search_eagle_eye")
    public Boolean searchEagleEye;

    // 系统指标默认显示的周期
    @NameInMap("sys_metric_interval")
    public String sysMetricInterval;

    // uuidWithWorkspace
    @NameInMap("uuid_with_workspace")
    public Boolean uuidWithWorkspace;

    // 封网变更标志
    @NameInMap("block_change")
    public Boolean blockChange;

    // bizEditors
    @NameInMap("biz_editors")
    public java.util.List<String> bizEditors;

    // 数据接口还使用fiber接口的租户
    @NameInMap("use_fiber_data_tenants")
    public java.util.List<String> useFiberDataTenants;

    // 平台运维技术栈（前端利用这个值来判断将哪些技术栈展示在平台运维版块）
    @NameInMap("platform_monitor_stack_names")
    public java.util.List<String> platformMonitorStackNames;

    // 菜单配置
    @NameInMap("menu_config")
    public MenuConfig menuConfig;

    // 是否开启秒级监控配置，默认关闭
    @NameInMap("second_monitor_enable")
    public Boolean secondMonitorEnable;

    // 是否允许前端显示应用分组
    @NameInMap("show_app_group")
    public Boolean showAppGroup;

    // 是否禁用老版告警
    @NameInMap("disable_old_alarm")
    public Boolean disableOldAlarm;

    // frontDatasource
    @NameInMap("front_datasource")
    public String frontDatasource;

    // frontDashboard
    @NameInMap("front_dashboard")
    public String frontDashboard;

    // showAllChartType
    @NameInMap("show_all_chart_type")
    public String showAllChartType;

    // showImportReplace
    @NameInMap("show_import_replace")
    public String showImportReplace;

    public static GetSetupModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSetupModelResponse self = new GetSetupModelResponse();
        return TeaModel.build(map, self);
    }

    public GetSetupModelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSetupModelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSetupModelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSetupModelResponse setBetaPlugin(Boolean betaPlugin) {
        this.betaPlugin = betaPlugin;
        return this;
    }
    public Boolean getBetaPlugin() {
        return this.betaPlugin;
    }

    public GetSetupModelResponse setShowBizDomain(Boolean showBizDomain) {
        this.showBizDomain = showBizDomain;
        return this;
    }
    public Boolean getShowBizDomain() {
        return this.showBizDomain;
    }

    public GetSetupModelResponse setSiteDrms(java.util.List<SiteWithDrm> siteDrms) {
        this.siteDrms = siteDrms;
        return this;
    }
    public java.util.List<SiteWithDrm> getSiteDrms() {
        return this.siteDrms;
    }

    public GetSetupModelResponse setTenantUseWsOverview(Boolean tenantUseWsOverview) {
        this.tenantUseWsOverview = tenantUseWsOverview;
        return this;
    }
    public Boolean getTenantUseWsOverview() {
        return this.tenantUseWsOverview;
    }

    public GetSetupModelResponse setIaasMonitor(Boolean iaasMonitor) {
        this.iaasMonitor = iaasMonitor;
        return this;
    }
    public Boolean getIaasMonitor() {
        return this.iaasMonitor;
    }

    public GetSetupModelResponse setAppStack(String appStack) {
        this.appStack = appStack;
        return this;
    }
    public String getAppStack() {
        return this.appStack;
    }

    public GetSetupModelResponse setAppStackEntity(String appStackEntity) {
        this.appStackEntity = appStackEntity;
        return this;
    }
    public String getAppStackEntity() {
        return this.appStackEntity;
    }

    public GetSetupModelResponse setSiteEnv(String siteEnv) {
        this.siteEnv = siteEnv;
        return this;
    }
    public String getSiteEnv() {
        return this.siteEnv;
    }

    public GetSetupModelResponse setUseNewAlarmConfig(Boolean useNewAlarmConfig) {
        this.useNewAlarmConfig = useNewAlarmConfig;
        return this;
    }
    public Boolean getUseNewAlarmConfig() {
        return this.useNewAlarmConfig;
    }

    public GetSetupModelResponse setGocPushOpen(Boolean gocPushOpen) {
        this.gocPushOpen = gocPushOpen;
        return this;
    }
    public Boolean getGocPushOpen() {
        return this.gocPushOpen;
    }

    public GetSetupModelResponse setAdvCustomPluinOpen(Boolean advCustomPluinOpen) {
        this.advCustomPluinOpen = advCustomPluinOpen;
        return this;
    }
    public Boolean getAdvCustomPluinOpen() {
        return this.advCustomPluinOpen;
    }

    public GetSetupModelResponse setNavAuth(Boolean navAuth) {
        this.navAuth = navAuth;
        return this;
    }
    public Boolean getNavAuth() {
        return this.navAuth;
    }

    public GetSetupModelResponse setUnFocusPageShutFresh(Boolean unFocusPageShutFresh) {
        this.unFocusPageShutFresh = unFocusPageShutFresh;
        return this;
    }
    public Boolean getUnFocusPageShutFresh() {
        return this.unFocusPageShutFresh;
    }

    public GetSetupModelResponse setLineChartIncreFresh(Boolean lineChartIncreFresh) {
        this.lineChartIncreFresh = lineChartIncreFresh;
        return this;
    }
    public Boolean getLineChartIncreFresh() {
        return this.lineChartIncreFresh;
    }

    public GetSetupModelResponse setShowWs(Boolean showWs) {
        this.showWs = showWs;
        return this;
    }
    public Boolean getShowWs() {
        return this.showWs;
    }

    public GetSetupModelResponse setShowTenant(Boolean showTenant) {
        this.showTenant = showTenant;
        return this;
    }
    public Boolean getShowTenant() {
        return this.showTenant;
    }

    public GetSetupModelResponse setSearchEagleEye(Boolean searchEagleEye) {
        this.searchEagleEye = searchEagleEye;
        return this;
    }
    public Boolean getSearchEagleEye() {
        return this.searchEagleEye;
    }

    public GetSetupModelResponse setSysMetricInterval(String sysMetricInterval) {
        this.sysMetricInterval = sysMetricInterval;
        return this;
    }
    public String getSysMetricInterval() {
        return this.sysMetricInterval;
    }

    public GetSetupModelResponse setUuidWithWorkspace(Boolean uuidWithWorkspace) {
        this.uuidWithWorkspace = uuidWithWorkspace;
        return this;
    }
    public Boolean getUuidWithWorkspace() {
        return this.uuidWithWorkspace;
    }

    public GetSetupModelResponse setBlockChange(Boolean blockChange) {
        this.blockChange = blockChange;
        return this;
    }
    public Boolean getBlockChange() {
        return this.blockChange;
    }

    public GetSetupModelResponse setBizEditors(java.util.List<String> bizEditors) {
        this.bizEditors = bizEditors;
        return this;
    }
    public java.util.List<String> getBizEditors() {
        return this.bizEditors;
    }

    public GetSetupModelResponse setUseFiberDataTenants(java.util.List<String> useFiberDataTenants) {
        this.useFiberDataTenants = useFiberDataTenants;
        return this;
    }
    public java.util.List<String> getUseFiberDataTenants() {
        return this.useFiberDataTenants;
    }

    public GetSetupModelResponse setPlatformMonitorStackNames(java.util.List<String> platformMonitorStackNames) {
        this.platformMonitorStackNames = platformMonitorStackNames;
        return this;
    }
    public java.util.List<String> getPlatformMonitorStackNames() {
        return this.platformMonitorStackNames;
    }

    public GetSetupModelResponse setMenuConfig(MenuConfig menuConfig) {
        this.menuConfig = menuConfig;
        return this;
    }
    public MenuConfig getMenuConfig() {
        return this.menuConfig;
    }

    public GetSetupModelResponse setSecondMonitorEnable(Boolean secondMonitorEnable) {
        this.secondMonitorEnable = secondMonitorEnable;
        return this;
    }
    public Boolean getSecondMonitorEnable() {
        return this.secondMonitorEnable;
    }

    public GetSetupModelResponse setShowAppGroup(Boolean showAppGroup) {
        this.showAppGroup = showAppGroup;
        return this;
    }
    public Boolean getShowAppGroup() {
        return this.showAppGroup;
    }

    public GetSetupModelResponse setDisableOldAlarm(Boolean disableOldAlarm) {
        this.disableOldAlarm = disableOldAlarm;
        return this;
    }
    public Boolean getDisableOldAlarm() {
        return this.disableOldAlarm;
    }

    public GetSetupModelResponse setFrontDatasource(String frontDatasource) {
        this.frontDatasource = frontDatasource;
        return this;
    }
    public String getFrontDatasource() {
        return this.frontDatasource;
    }

    public GetSetupModelResponse setFrontDashboard(String frontDashboard) {
        this.frontDashboard = frontDashboard;
        return this;
    }
    public String getFrontDashboard() {
        return this.frontDashboard;
    }

    public GetSetupModelResponse setShowAllChartType(String showAllChartType) {
        this.showAllChartType = showAllChartType;
        return this;
    }
    public String getShowAllChartType() {
        return this.showAllChartType;
    }

    public GetSetupModelResponse setShowImportReplace(String showImportReplace) {
        this.showImportReplace = showImportReplace;
        return this;
    }
    public String getShowImportReplace() {
        return this.showImportReplace;
    }

}
