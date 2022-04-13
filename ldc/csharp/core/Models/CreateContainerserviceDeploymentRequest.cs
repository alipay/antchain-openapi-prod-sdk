// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateContainerserviceDeploymentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 容器服务列表。
        [NameInMap("container_services")]
        [Validation(Required=true)]
        public SontainerServicesList ContainerServices { get; set; }

        // 是否自动执行，默认false
        [NameInMap("is_auto_execute")]
        [Validation(Required=false)]
        public bool? IsAutoExecute { get; set; }

        // 所属命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 默认CLOUD_NATIVE_GROUP_RELEASE
        [NameInMap("ops_type")]
        [Validation(Required=false)]
        public string OpsType { get; set; }

        // operator调用专用字段，ReleasePlan唯一标识
        [NameInMap("release_plan_unique_id")]
        [Validation(Required=false)]
        public string ReleasePlanUniqueId { get; set; }

        // tenant 名字，operator调用专用字段
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 发布单名称。
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 所属工作空间组名称。
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 审批人账号id
        [NameInMap("assignee_ids")]
        [Validation(Required=false)]
        public List<string> AssigneeIds { get; set; }

        // 操作人账号，lks1.23.0才支持
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 灰度发布的参数，仅当ops_type为GRAY_RELEASE时生效
        [NameInMap("gray_release_config")]
        [Validation(Required=false)]
        public GrayReleaseConfig GrayReleaseConfig { get; set; }

    }

}
