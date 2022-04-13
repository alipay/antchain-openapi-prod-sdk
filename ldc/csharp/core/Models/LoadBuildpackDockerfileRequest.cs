// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class LoadBuildpackDockerfileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 技术栈大版本
        [NameInMap("tech_stack")]
        [Validation(Required=true)]
        public string TechStack { get; set; }

        // 云原生技术栈版本
        [NameInMap("tech_stack_version")]
        [Validation(Required=true)]
        public string TechStackVersion { get; set; }

        // 应用包地址，可以为相对目录，或者远程可访问存储地址. 用于组装Dockerfile模板中对应的应用包获取地址
        [NameInMap("package_url")]
        [Validation(Required=true)]
        public string PackageUrl { get; set; }

    }

}
