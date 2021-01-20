// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 工作空间组详细信息。
    public class WorkspaceGroupInfo : TeaModel {
        // 创建时间。
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreatedTime { get; set; }

        // 工作空间组显示名称。
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 域名后缀。
        [NameInMap("domain_suffix")]
        [Validation(Required=false)]
        public string DomainSuffix { get; set; }

        // 工作空间组id。
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 主工作空间id。
        [NameInMap("master_workspace_id")]
        [Validation(Required=false)]
        public string MasterWorkspaceId { get; set; }

        // 主工作空间名称。
        [NameInMap("master_workspace_identity")]
        [Validation(Required=false)]
        public string MasterWorkspaceIdentity { get; set; }

        // 修改时间。
        [NameInMap("modified_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModifiedTime { get; set; }

        // 工作空间组唯一标识。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 发布模式。
        [NameInMap("release_mode")]
        [Validation(Required=false)]
        public string ReleaseMode { get; set; }

        // the belonging tenant name.
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 包含工作空间列表。
        [NameInMap("workspaces")]
        [Validation(Required=false)]
        public List<Workspace> Workspaces { get; set; }

        // workspace name
        [NameInMap("identity")]
        [Validation(Required=false)]
        public string Identity { get; set; }

    }

}
