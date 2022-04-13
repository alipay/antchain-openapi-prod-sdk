// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ListSidecaropsTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // sidecar类型
        [NameInMap("sidecar_name")]
        [Validation(Required=true)]
        public string SidecarName { get; set; }

        // sidecar版本
        [NameInMap("sidecar_version")]
        [Validation(Required=false)]
        public string SidecarVersion { get; set; }

        // 工作空间组
        [NameInMap("workspace_group_id")]
        [Validation(Required=false)]
        public string WorkspaceGroupId { get; set; }

        // 工作空间组名
        [NameInMap("workspace_group_label")]
        [Validation(Required=true)]
        public string WorkspaceGroupLabel { get; set; }

        // 工作空间
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 镜像地址
        [NameInMap("image")]
        [Validation(Required=false)]
        public string Image { get; set; }

        // 可以根据租户名称筛选应用于该租户的基线模板
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

    }

}
