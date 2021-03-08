// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class CreateServiceaccountRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 服务账号描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 服务账号别名
        [NameInMap("alias")]
        [Validation(Required=true)]
        public string Alias { get; set; }

    }

}
