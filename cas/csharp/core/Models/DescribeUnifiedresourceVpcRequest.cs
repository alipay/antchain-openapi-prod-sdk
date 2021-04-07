// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class DescribeUnifiedresourceVpcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 提供商类型
        [NameInMap("provider_type")]
        [Validation(Required=true)]
        public string ProviderType { get; set; }

        // region
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 工作空间
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
