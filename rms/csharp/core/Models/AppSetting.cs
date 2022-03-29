// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // APP配置
    public class AppSetting : TeaModel {
        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public long? TenantId { get; set; }

        // 工作空间ID
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public long? WorkspaceId { get; set; }

        // 配置信息
        [NameInMap("setting")]
        [Validation(Required=false)]
        public string Setting { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 应用监控是否开启采集
        [NameInMap("collect_enable")]
        [Validation(Required=true)]
        public bool? CollectEnable { get; set; }

    }

}
