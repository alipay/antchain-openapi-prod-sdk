// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class CreateCustompluginRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=false)]
        public string WorkspaceName { get; set; }

        // 监控产品类型
        [NameInMap("plugin_type")]
        [Validation(Required=false)]
        public string PluginType { get; set; }

        // 监控配置名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 父级文件夹 ID
        [NameInMap("parent_folder_id")]
        [Validation(Required=false)]
        public long? ParentFolderId { get; set; }

        // 是否生效
        [NameInMap("is_open")]
        [Validation(Required=false)]
        public bool? IsOpen { get; set; }

        // 告警套餐
        [NameInMap("alarm_pkgs")]
        [Validation(Required=false)]
        public AlarmPkgDO AlarmPkgs { get; set; }

    }

}
