// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // agent实例信息
    public class AgentInstance : TeaModel {
        // agent版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // agent 采集对象的唯一标识符
        [NameInMap("collect_id")]
        [Validation(Required=true)]
        public string CollectId { get; set; }

        // app 名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // IP 地址
        [NameInMap("ip")]
        [Validation(Required=true)]
        public string Ip { get; set; }

        // hostname 名称
        [NameInMap("hostname")]
        [Validation(Required=false)]
        public string Hostname { get; set; }

        // 租户 ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public long? TenantId { get; set; }

        // 工作空间 ID
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public long? WorkspaceId { get; set; }

        // agent 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 容器/ECS
        [NameInMap("deploy_type")]
        [Validation(Required=true)]
        public string DeployType { get; set; }

        // agent 附加信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

        // 是否开启告警标志
        [NameInMap("label")]
        [Validation(Required=true)]
        public long? Label { get; set; }

    }

}
