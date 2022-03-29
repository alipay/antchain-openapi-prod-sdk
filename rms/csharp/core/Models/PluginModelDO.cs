// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // PluginModelDO
    public class PluginModelDO : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // parent_folder_id
        [NameInMap("parent_folder_id")]
        [Validation(Required=true)]
        public long? ParentFolderId { get; set; }

        // plugin_id
        [NameInMap("plugin_id")]
        [Validation(Required=true)]
        public long? PluginId { get; set; }

        // plugin_type
        [NameInMap("plugin_type")]
        [Validation(Required=true)]
        public string PluginType { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // xflush_apps
        [NameInMap("xflush_apps")]
        [Validation(Required=true)]
        public string XflushApps { get; set; }

        // stack_expression
        [NameInMap("stack_expression")]
        [Validation(Required=true)]
        public StackExpression StackExpression { get; set; }

        // cal_conf
        [NameInMap("cal_conf")]
        [Validation(Required=true)]
        public string CalConf { get; set; }

        // opsmeta_schema
        [NameInMap("opsmeta_schema")]
        [Validation(Required=true)]
        public OpsmetaSchema OpsmetaSchema { get; set; }

        // save_schema
        [NameInMap("save_schema")]
        [Validation(Required=true)]
        public SaveSchema SaveSchema { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public StatusDO Status { get; set; }

        // outside_domain_id
        [NameInMap("outside_domain_id")]
        [Validation(Required=true)]
        public long? OutsideDomainId { get; set; }

        // old_folder_id
        [NameInMap("old_folder_id")]
        [Validation(Required=true)]
        public long? OldFolderId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public long? TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public long? WorkspaceId { get; set; }

        // biz_domain_id
        [NameInMap("biz_domain_id")]
        [Validation(Required=true)]
        public long? BizDomainId { get; set; }

        // creater
        [NameInMap("creater")]
        [Validation(Required=true)]
        public string Creater { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // modifier
        [NameInMap("modifier")]
        [Validation(Required=true)]
        public string Modifier { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // alarm_pkgs
        [NameInMap("alarm_pkgs")]
        [Validation(Required=true)]
        public List<AlarmPkgDO> AlarmPkgs { get; set; }

        // noc
        [NameInMap("noc")]
        [Validation(Required=true)]
        public string Noc { get; set; }

        // position
        [NameInMap("position")]
        [Validation(Required=true)]
        public string Position { get; set; }

        // alarmed
        [NameInMap("alarmed")]
        [Validation(Required=true)]
        public bool? Alarmed { get; set; }

        // recent_alarm_history_id
        [NameInMap("recent_alarm_history_id")]
        [Validation(Required=true)]
        public string RecentAlarmHistoryId { get; set; }

        // recent_alarm
        [NameInMap("recent_alarm")]
        [Validation(Required=true)]
        public long? RecentAlarm { get; set; }

        // key_cms
        [NameInMap("key_cms")]
        [Validation(Required=true)]
        public bool? KeyCms { get; set; }

        // key_cms_sort
        [NameInMap("key_cms_sort")]
        [Validation(Required=true)]
        public long? KeyCmsSort { get; set; }

        // status_desc
        [NameInMap("status_desc")]
        [Validation(Required=true)]
        public string StatusDesc { get; set; }

        // data_from
        [NameInMap("data_from")]
        [Validation(Required=true)]
        public long? DataFrom { get; set; }

        // data_to
        [NameInMap("data_to")]
        [Validation(Required=true)]
        public long? DataTo { get; set; }

        // from_source
        [NameInMap("from_source")]
        [Validation(Required=true)]
        public string FromSource { get; set; }

    }

}
