// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class DeleteResourceVpcRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要删除的VPC所在的地域identity
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 要删除的VPC ID
        [NameInMap("vpc_id")]
        [Validation(Required=true)]
        public string VpcId { get; set; }

        // workspace id
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
