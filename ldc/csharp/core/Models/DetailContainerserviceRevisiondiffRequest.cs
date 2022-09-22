// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class DetailContainerserviceRevisiondiffRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 租户名
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 应用服务名称
        [NameInMap("container_service_name")]
        [Validation(Required=true)]
        public string ContainerServiceName { get; set; }

        // 源版本号，不传取应用服务当前发布成功的版本
        [NameInMap("source_revision")]
        [Validation(Required=false)]
        public string SourceRevision { get; set; }

        // 目标版本号，当前需要对比的版本号
        [NameInMap("target_revision")]
        [Validation(Required=true)]
        public string TargetRevision { get; set; }

        // 是否只显示摘要信息
        [NameInMap("only_summary")]
        [Validation(Required=false)]
        public bool? OnlySummary { get; set; }

    }

}
