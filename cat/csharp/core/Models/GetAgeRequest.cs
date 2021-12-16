// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAT.Models
{
    public class GetAgeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 猫猫的id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

    }

}
