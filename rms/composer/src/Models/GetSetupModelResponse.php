<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class GetSetupModelResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 主站试点的产品是否打开
    /**
     * @var bool
     */
    public $betaPlugin;

    // showBizDomain
    /**
     * @var bool
     */
    public $showBizDomain;

    // drm 推送的地址列表, 如果为空，前端默认主站，如果不为空，按照配置来渲染
    /**
     * @var SiteWithDrm[]
     */
    public $siteDrms;

    // 是不是租户总览用空间总览
    /**
     * @var bool
     */
    public $tenantUseWsOverview;

    // iaas监控开关
    /**
     * @var bool
     */
    public $iaasMonitor;

    // 应用监控的技术栈
    /**
     * @var string
     */
    public $appStack;

    // 应用监控的技术栈实体
    /**
     * @var string
     */
    public $appStackEntity;

    // 站点
    /**
     * @var string
     */
    public $siteEnv;

    // useNewAlarmConfig
    /**
     * @var bool
     */
    public $useNewAlarmConfig;

    // goc推送开关
    /**
     * @var bool
     */
    public $gocPushOpen;

    // 是否打开高级产品配置，脚本、联合计算等
    /**
     * @var bool
     */
    public $advCustomPluinOpen;

    // 导航是否鉴权
    /**
     * @var bool
     */
    public $navAuth;

    // unFocusPageShutFresh
    /**
     * @var bool
     */
    public $unFocusPageShutFresh;

    // lineChartIncreFresh
    /**
     * @var bool
     */
    public $lineChartIncreFresh;

    // ws开关
    /**
     * @var bool
     */
    public $showWs;

    // Tenant开关
    /**
     * @var bool
     */
    public $showTenant;

    // searchEagleEye
    /**
     * @var bool
     */
    public $searchEagleEye;

    // 系统指标默认显示的周期
    /**
     * @var string
     */
    public $sysMetricInterval;

    // uuidWithWorkspace
    /**
     * @var bool
     */
    public $uuidWithWorkspace;

    // 封网变更标志
    /**
     * @var bool
     */
    public $blockChange;

    // bizEditors
    /**
     * @var string[]
     */
    public $bizEditors;

    // 数据接口还使用fiber接口的租户
    /**
     * @var string[]
     */
    public $useFiberDataTenants;

    // 平台运维技术栈（前端利用这个值来判断将哪些技术栈展示在平台运维版块）
    /**
     * @var string[]
     */
    public $platformMonitorStackNames;

    // 菜单配置
    /**
     * @var MenuConfig
     */
    public $menuConfig;

    // 是否开启秒级监控配置，默认关闭
    /**
     * @var bool
     */
    public $secondMonitorEnable;

    // 是否允许前端显示应用分组
    /**
     * @var bool
     */
    public $showAppGroup;

    // 是否禁用老版告警
    /**
     * @var bool
     */
    public $disableOldAlarm;

    // frontDatasource
    /**
     * @var string
     */
    public $frontDatasource;

    // frontDashboard
    /**
     * @var string
     */
    public $frontDashboard;

    // showAllChartType
    /**
     * @var string
     */
    public $showAllChartType;

    // showImportReplace
    /**
     * @var string
     */
    public $showImportReplace;
    protected $_name = [
        'reqMsgId'                  => 'req_msg_id',
        'resultCode'                => 'result_code',
        'resultMsg'                 => 'result_msg',
        'betaPlugin'                => 'beta_plugin',
        'showBizDomain'             => 'show_biz_domain',
        'siteDrms'                  => 'site_drms',
        'tenantUseWsOverview'       => 'tenant_use_ws_overview',
        'iaasMonitor'               => 'iaas_monitor',
        'appStack'                  => 'app_stack',
        'appStackEntity'            => 'app_stack_entity',
        'siteEnv'                   => 'site_env',
        'useNewAlarmConfig'         => 'use_new_alarm_config',
        'gocPushOpen'               => 'goc_push_open',
        'advCustomPluinOpen'        => 'adv_custom_pluin_open',
        'navAuth'                   => 'nav_auth',
        'unFocusPageShutFresh'      => 'un_focus_page_shut_fresh',
        'lineChartIncreFresh'       => 'line_chart_incre_fresh',
        'showWs'                    => 'show_ws',
        'showTenant'                => 'show_tenant',
        'searchEagleEye'            => 'search_eagle_eye',
        'sysMetricInterval'         => 'sys_metric_interval',
        'uuidWithWorkspace'         => 'uuid_with_workspace',
        'blockChange'               => 'block_change',
        'bizEditors'                => 'biz_editors',
        'useFiberDataTenants'       => 'use_fiber_data_tenants',
        'platformMonitorStackNames' => 'platform_monitor_stack_names',
        'menuConfig'                => 'menu_config',
        'secondMonitorEnable'       => 'second_monitor_enable',
        'showAppGroup'              => 'show_app_group',
        'disableOldAlarm'           => 'disable_old_alarm',
        'frontDatasource'           => 'front_datasource',
        'frontDashboard'            => 'front_dashboard',
        'showAllChartType'          => 'show_all_chart_type',
        'showImportReplace'         => 'show_import_replace',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->betaPlugin) {
            $res['beta_plugin'] = $this->betaPlugin;
        }
        if (null !== $this->showBizDomain) {
            $res['show_biz_domain'] = $this->showBizDomain;
        }
        if (null !== $this->siteDrms) {
            $res['site_drms'] = [];
            if (null !== $this->siteDrms && \is_array($this->siteDrms)) {
                $n = 0;
                foreach ($this->siteDrms as $item) {
                    $res['site_drms'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tenantUseWsOverview) {
            $res['tenant_use_ws_overview'] = $this->tenantUseWsOverview;
        }
        if (null !== $this->iaasMonitor) {
            $res['iaas_monitor'] = $this->iaasMonitor;
        }
        if (null !== $this->appStack) {
            $res['app_stack'] = $this->appStack;
        }
        if (null !== $this->appStackEntity) {
            $res['app_stack_entity'] = $this->appStackEntity;
        }
        if (null !== $this->siteEnv) {
            $res['site_env'] = $this->siteEnv;
        }
        if (null !== $this->useNewAlarmConfig) {
            $res['use_new_alarm_config'] = $this->useNewAlarmConfig;
        }
        if (null !== $this->gocPushOpen) {
            $res['goc_push_open'] = $this->gocPushOpen;
        }
        if (null !== $this->advCustomPluinOpen) {
            $res['adv_custom_pluin_open'] = $this->advCustomPluinOpen;
        }
        if (null !== $this->navAuth) {
            $res['nav_auth'] = $this->navAuth;
        }
        if (null !== $this->unFocusPageShutFresh) {
            $res['un_focus_page_shut_fresh'] = $this->unFocusPageShutFresh;
        }
        if (null !== $this->lineChartIncreFresh) {
            $res['line_chart_incre_fresh'] = $this->lineChartIncreFresh;
        }
        if (null !== $this->showWs) {
            $res['show_ws'] = $this->showWs;
        }
        if (null !== $this->showTenant) {
            $res['show_tenant'] = $this->showTenant;
        }
        if (null !== $this->searchEagleEye) {
            $res['search_eagle_eye'] = $this->searchEagleEye;
        }
        if (null !== $this->sysMetricInterval) {
            $res['sys_metric_interval'] = $this->sysMetricInterval;
        }
        if (null !== $this->uuidWithWorkspace) {
            $res['uuid_with_workspace'] = $this->uuidWithWorkspace;
        }
        if (null !== $this->blockChange) {
            $res['block_change'] = $this->blockChange;
        }
        if (null !== $this->bizEditors) {
            $res['biz_editors'] = $this->bizEditors;
        }
        if (null !== $this->useFiberDataTenants) {
            $res['use_fiber_data_tenants'] = $this->useFiberDataTenants;
        }
        if (null !== $this->platformMonitorStackNames) {
            $res['platform_monitor_stack_names'] = $this->platformMonitorStackNames;
        }
        if (null !== $this->menuConfig) {
            $res['menu_config'] = null !== $this->menuConfig ? $this->menuConfig->toMap() : null;
        }
        if (null !== $this->secondMonitorEnable) {
            $res['second_monitor_enable'] = $this->secondMonitorEnable;
        }
        if (null !== $this->showAppGroup) {
            $res['show_app_group'] = $this->showAppGroup;
        }
        if (null !== $this->disableOldAlarm) {
            $res['disable_old_alarm'] = $this->disableOldAlarm;
        }
        if (null !== $this->frontDatasource) {
            $res['front_datasource'] = $this->frontDatasource;
        }
        if (null !== $this->frontDashboard) {
            $res['front_dashboard'] = $this->frontDashboard;
        }
        if (null !== $this->showAllChartType) {
            $res['show_all_chart_type'] = $this->showAllChartType;
        }
        if (null !== $this->showImportReplace) {
            $res['show_import_replace'] = $this->showImportReplace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetSetupModelResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['beta_plugin'])) {
            $model->betaPlugin = $map['beta_plugin'];
        }
        if (isset($map['show_biz_domain'])) {
            $model->showBizDomain = $map['show_biz_domain'];
        }
        if (isset($map['site_drms'])) {
            if (!empty($map['site_drms'])) {
                $model->siteDrms = [];
                $n               = 0;
                foreach ($map['site_drms'] as $item) {
                    $model->siteDrms[$n++] = null !== $item ? SiteWithDrm::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tenant_use_ws_overview'])) {
            $model->tenantUseWsOverview = $map['tenant_use_ws_overview'];
        }
        if (isset($map['iaas_monitor'])) {
            $model->iaasMonitor = $map['iaas_monitor'];
        }
        if (isset($map['app_stack'])) {
            $model->appStack = $map['app_stack'];
        }
        if (isset($map['app_stack_entity'])) {
            $model->appStackEntity = $map['app_stack_entity'];
        }
        if (isset($map['site_env'])) {
            $model->siteEnv = $map['site_env'];
        }
        if (isset($map['use_new_alarm_config'])) {
            $model->useNewAlarmConfig = $map['use_new_alarm_config'];
        }
        if (isset($map['goc_push_open'])) {
            $model->gocPushOpen = $map['goc_push_open'];
        }
        if (isset($map['adv_custom_pluin_open'])) {
            $model->advCustomPluinOpen = $map['adv_custom_pluin_open'];
        }
        if (isset($map['nav_auth'])) {
            $model->navAuth = $map['nav_auth'];
        }
        if (isset($map['un_focus_page_shut_fresh'])) {
            $model->unFocusPageShutFresh = $map['un_focus_page_shut_fresh'];
        }
        if (isset($map['line_chart_incre_fresh'])) {
            $model->lineChartIncreFresh = $map['line_chart_incre_fresh'];
        }
        if (isset($map['show_ws'])) {
            $model->showWs = $map['show_ws'];
        }
        if (isset($map['show_tenant'])) {
            $model->showTenant = $map['show_tenant'];
        }
        if (isset($map['search_eagle_eye'])) {
            $model->searchEagleEye = $map['search_eagle_eye'];
        }
        if (isset($map['sys_metric_interval'])) {
            $model->sysMetricInterval = $map['sys_metric_interval'];
        }
        if (isset($map['uuid_with_workspace'])) {
            $model->uuidWithWorkspace = $map['uuid_with_workspace'];
        }
        if (isset($map['block_change'])) {
            $model->blockChange = $map['block_change'];
        }
        if (isset($map['biz_editors'])) {
            if (!empty($map['biz_editors'])) {
                $model->bizEditors = $map['biz_editors'];
            }
        }
        if (isset($map['use_fiber_data_tenants'])) {
            if (!empty($map['use_fiber_data_tenants'])) {
                $model->useFiberDataTenants = $map['use_fiber_data_tenants'];
            }
        }
        if (isset($map['platform_monitor_stack_names'])) {
            if (!empty($map['platform_monitor_stack_names'])) {
                $model->platformMonitorStackNames = $map['platform_monitor_stack_names'];
            }
        }
        if (isset($map['menu_config'])) {
            $model->menuConfig = MenuConfig::fromMap($map['menu_config']);
        }
        if (isset($map['second_monitor_enable'])) {
            $model->secondMonitorEnable = $map['second_monitor_enable'];
        }
        if (isset($map['show_app_group'])) {
            $model->showAppGroup = $map['show_app_group'];
        }
        if (isset($map['disable_old_alarm'])) {
            $model->disableOldAlarm = $map['disable_old_alarm'];
        }
        if (isset($map['front_datasource'])) {
            $model->frontDatasource = $map['front_datasource'];
        }
        if (isset($map['front_dashboard'])) {
            $model->frontDashboard = $map['front_dashboard'];
        }
        if (isset($map['show_all_chart_type'])) {
            $model->showAllChartType = $map['show_all_chart_type'];
        }
        if (isset($map['show_import_replace'])) {
            $model->showImportReplace = $map['show_import_replace'];
        }

        return $model;
    }
}
