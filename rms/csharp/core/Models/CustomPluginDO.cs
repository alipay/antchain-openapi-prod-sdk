// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 自定义监控指标DO
    public class CustomPluginDO : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 自定义监控名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 监控类型id
        [NameInMap("plugin_id")]
        [Validation(Required=true)]
        public long? PluginId { get; set; }

        // 监控类型
        [NameInMap("plugin_type")]
        [Validation(Required=true)]
        public string PluginType { get; set; }

        // 父级文件夹 ID
        [NameInMap("parent_folder_id")]
        [Validation(Required=true)]
        public long? ParentFolderId { get; set; }

        // 创建者
        [NameInMap("creater")]
        [Validation(Required=false)]
        public string Creater { get; set; }

        // 最后修改者
        [NameInMap("modifier")]
        [Validation(Required=false)]
        public string Modifier { get; set; }

        // 创建时间 - 时间戳
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public long? GmtCreate { get; set; }

        // 最后修改时间 - 时间戳
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

        // 是否有报警
        [NameInMap("alarmed")]
        [Validation(Required=false)]
        public bool? Alarmed { get; set; }

        // 日志
        [NameInMap("log")]
        [Validation(Required=false)]
        public Log Log { get; set; }

        // 存储信息
        [NameInMap("save_schema")]
        [Validation(Required=false)]
        public SaveSchema SaveSchema { get; set; }

        // 采集元数据过滤项
        [NameInMap("opsmeta_schema")]
        [Validation(Required=false)]
        public OpsmetaSchema OpsmetaSchema { get; set; }

        // 属性扩展包
        [NameInMap("spm")]
        [Validation(Required=false)]
        public Spm Spm { get; set; }

        // 告警套餐列表
        [NameInMap("alarm_pkgs")]
        [Validation(Required=false)]
        public List<AlarmPkgDO> AlarmPkgs { get; set; }

        // 日志筛选黑名单
        [NameInMap("black_filters")]
        [Validation(Required=false)]
        public List<Filter> BlackFilters { get; set; }

        // 日志筛选白名单
        [NameInMap("white_filters")]
        [Validation(Required=false)]
        public List<Filter> WhiteFilters { get; set; }

        // OPS分组方式
        [NameInMap("ops_group_by")]
        [Validation(Required=false)]
        public OpsGroupBy OpsGroupBy { get; set; }

        // 统计方式
        [NameInMap("cal")]
        [Validation(Required=false)]
        public Cal Cal { get; set; }

        // 配置状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public StatusDO Status { get; set; }

        // top预警
        [NameInMap("top_alarm")]
        [Validation(Required=false)]
        public TopAlarmDO TopAlarm { get; set; }

        // 分组规则
        [NameInMap("group_by")]
        [Validation(Required=false)]
        public List<Filter> GroupBy { get; set; }

        // 状态描述信息
        [NameInMap("status_desc")]
        [Validation(Required=false)]
        public string StatusDesc { get; set; }

        // 是否需要动态key
        [NameInMap("dk_need")]
        [Validation(Required=false)]
        public bool? DkNeed { get; set; }

        // 推荐的动态key列表, 分号间隔
        [NameInMap("dks")]
        [Validation(Required=false)]
        public string Dks { get; set; }

        // 是否需要大盘显示基线
        [NameInMap("baseline_need")]
        [Validation(Required=false)]
        public bool? BaselineNeed { get; set; }

        // 是否需要快速刷入实时缓存
        [NameInMap("flush_basin")]
        [Validation(Required=false)]
        public bool? FlushBasin { get; set; }

        // 所属应用
        [NameInMap("xflush_apps")]
        [Validation(Required=false)]
        public string XflushApps { get; set; }

        // script (JSON String格式)
        [NameInMap("script_new")]
        [Validation(Required=false)]
        public string ScriptNew { get; set; }

        // 是否开启
        [NameInMap("is_open")]
        [Validation(Required=false)]
        public bool? IsOpen { get; set; }

        // 插件类型别名
        [NameInMap("plugin_type_alias")]
        [Validation(Required=true)]
        public string PluginTypeAlias { get; set; }

    }

}
