// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class AddContainerserviceMiddlewareconfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 应用服务名
        [NameInMap("container_service_name")]
        [Validation(Required=true)]
        public string ContainerServiceName { get; set; }

        // 应用服务版本
        [NameInMap("container_service_revision")]
        [Validation(Required=true)]
        public string ContainerServiceRevision { get; set; }

        // 操作人账号
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 中间件配置
        [NameInMap("middleware_configs")]
        [Validation(Required=true)]
        public List<string> MiddlewareConfigs { get; set; }

    }

}
