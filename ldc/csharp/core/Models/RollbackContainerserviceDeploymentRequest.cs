// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class RollbackContainerserviceDeploymentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 所属工作空间组名称
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 容器服务名字
        [NameInMap("container_service_name")]
        [Validation(Required=true)]
        public string ContainerServiceName { get; set; }

        // 所属命名空间名称
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 回滚的版本
        [NameInMap("revision")]
        [Validation(Required=true)]
        public string Revision { get; set; }

        // 部署单ID
        [NameInMap("operation_id")]
        [Validation(Required=true)]
        public string OperationId { get; set; }

        // 操作人账号
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 分组数，默认为3
        [NameInMap("group_count")]
        [Validation(Required=false)]
        public long? GroupCount { get; set; }

        // 回滚时的分组策略，取值为： QUICK：快速分组； EACH_ONE：每台一组； UNIT：按逻辑单元分组； CELL：按部署单元分组； 默认为CELL
        [NameInMap("group_strategy")]
        [Validation(Required=false)]
        public string GroupStrategy { get; set; }

        // 回滚原因
        [NameInMap("reason")]
        [Validation(Required=true)]
        public string Reason { get; set; }

    }

}
