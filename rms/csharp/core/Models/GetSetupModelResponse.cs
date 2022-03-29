// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class GetSetupModelResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 主站试点的产品是否打开
        [NameInMap("beta_plugin")]
        [Validation(Required=false)]
        public bool? BetaPlugin { get; set; }

        // showBizDomain
        [NameInMap("show_biz_domain")]
        [Validation(Required=false)]
        public bool? ShowBizDomain { get; set; }

        // drm 推送的地址列表, 如果为空，前端默认主站，如果不为空，按照配置来渲染
        [NameInMap("site_drms")]
        [Validation(Required=false)]
        public List<SiteWithDrm> SiteDrms { get; set; }

        // 是不是租户总览用空间总览
        [NameInMap("tenant_use_ws_overview")]
        [Validation(Required=false)]
        public bool? TenantUseWsOverview { get; set; }

        // iaas监控开关
        [NameInMap("iaas_monitor")]
        [Validation(Required=false)]
        public bool? IaasMonitor { get; set; }

        // 应用监控的技术栈
        [NameInMap("app_stack")]
        [Validation(Required=false)]
        public string AppStack { get; set; }

        // 应用监控的技术栈实体
        [NameInMap("app_stack_entity")]
        [Validation(Required=false)]
        public string AppStackEntity { get; set; }

        // 站点
        [NameInMap("site_env")]
        [Validation(Required=false)]
        public string SiteEnv { get; set; }

        // useNewAlarmConfig
        [NameInMap("use_new_alarm_config")]
        [Validation(Required=false)]
        public bool? UseNewAlarmConfig { get; set; }

        // goc推送开关
        [NameInMap("goc_push_open")]
        [Validation(Required=false)]
        public bool? GocPushOpen { get; set; }

        // 是否打开高级产品配置，脚本、联合计算等
        [NameInMap("adv_custom_pluin_open")]
        [Validation(Required=false)]
        public bool? AdvCustomPluinOpen { get; set; }

        // 导航是否鉴权
        [NameInMap("nav_auth")]
        [Validation(Required=false)]
        public bool? NavAuth { get; set; }

        // unFocusPageShutFresh
        [NameInMap("un_focus_page_shut_fresh")]
        [Validation(Required=false)]
        public bool? UnFocusPageShutFresh { get; set; }

        // lineChartIncreFresh
        [NameInMap("line_chart_incre_fresh")]
        [Validation(Required=false)]
        public bool? LineChartIncreFresh { get; set; }

        // ws开关
        [NameInMap("show_ws")]
        [Validation(Required=false)]
        public bool? ShowWs { get; set; }

        // Tenant开关
        [NameInMap("show_tenant")]
        [Validation(Required=false)]
        public bool? ShowTenant { get; set; }

        // searchEagleEye
        [NameInMap("search_eagle_eye")]
        [Validation(Required=false)]
        public bool? SearchEagleEye { get; set; }

        // 系统指标默认显示的周期
        [NameInMap("sys_metric_interval")]
        [Validation(Required=false)]
        public string SysMetricInterval { get; set; }

        // uuidWithWorkspace
        [NameInMap("uuid_with_workspace")]
        [Validation(Required=false)]
        public bool? UuidWithWorkspace { get; set; }

        // 封网变更标志
        [NameInMap("block_change")]
        [Validation(Required=false)]
        public bool? BlockChange { get; set; }

        // bizEditors
        [NameInMap("biz_editors")]
        [Validation(Required=false)]
        public List<string> BizEditors { get; set; }

        // 数据接口还使用fiber接口的租户
        [NameInMap("use_fiber_data_tenants")]
        [Validation(Required=false)]
        public List<string> UseFiberDataTenants { get; set; }

        // 平台运维技术栈（前端利用这个值来判断将哪些技术栈展示在平台运维版块）
        [NameInMap("platform_monitor_stack_names")]
        [Validation(Required=false)]
        public List<string> PlatformMonitorStackNames { get; set; }

        // 菜单配置
        [NameInMap("menu_config")]
        [Validation(Required=false)]
        public MenuConfig MenuConfig { get; set; }

        // 是否开启秒级监控配置，默认关闭
        [NameInMap("second_monitor_enable")]
        [Validation(Required=false)]
        public bool? SecondMonitorEnable { get; set; }

        // 是否允许前端显示应用分组
        [NameInMap("show_app_group")]
        [Validation(Required=false)]
        public bool? ShowAppGroup { get; set; }

        // 是否禁用老版告警
        [NameInMap("disable_old_alarm")]
        [Validation(Required=false)]
        public bool? DisableOldAlarm { get; set; }

        // frontDatasource
        [NameInMap("front_datasource")]
        [Validation(Required=false)]
        public string FrontDatasource { get; set; }

        // frontDashboard
        [NameInMap("front_dashboard")]
        [Validation(Required=false)]
        public string FrontDashboard { get; set; }

        // showAllChartType
        [NameInMap("show_all_chart_type")]
        [Validation(Required=false)]
        public string ShowAllChartType { get; set; }

        // showImportReplace
        [NameInMap("show_import_replace")]
        [Validation(Required=false)]
        public string ShowImportReplace { get; set; }

    }

}
