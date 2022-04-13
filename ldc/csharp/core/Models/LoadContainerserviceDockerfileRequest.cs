// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class LoadContainerserviceDockerfileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用服务名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 应用包地址，可以为相对目录，或者远程可访问存储地址.
        // 用于组装Dockerfile模板中对应的应用包获取地址
        [NameInMap("package_url")]
        [Validation(Required=true)]
        public string PackageUrl { get; set; }

        // 环境名称
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 容器服务所在namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

    }

}
