// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateResourceVpcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // VPC的网段。您可以使用以下网段或其子集作为VPC的网段：
        // 
        // 172.16.0.0/12（默认值）。
        // 10.0.0.0/8。
        // 192.168.0.0/16。
        [NameInMap("cidr_block")]
        [Validation(Required=false)]
        public string CidrBlock { get; set; }

        // 描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // VPC的名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // VPC所在的地域
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 用户侧网络的网段
        [NameInMap("user_cidr")]
        [Validation(Required=false)]
        public string UserCidr { get; set; }

        // 所属工作空间 identity
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
