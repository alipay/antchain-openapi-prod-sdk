// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateFedloadbalancerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 联邦负载均衡实例名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 联邦负载均衡实例所在命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 地址类型，例如公网、内网
        [NameInMap("addr_type")]
        [Validation(Required=true)]
        public string AddrType { get; set; }

        // 指定负载均衡规格
        [NameInMap("spec")]
        [Validation(Required=false)]
        public string Spec { get; set; }

        // 联邦负载均衡实例对应的部署单元列表
        [NameInMap("cells")]
        [Validation(Required=true)]
        public List<string> Cells { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
