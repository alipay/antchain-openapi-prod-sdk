// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // AuthenticationConfigVO
    public class AuthenticationConfigVO : TeaModel {
        // access_key
        [NameInMap("access_key")]
        [Validation(Required=false)]
        public string AccessKey { get; set; }

        // secret_key
        [NameInMap("secret_key")]
        [Validation(Required=false)]
        public string SecretKey { get; set; }

    }

}
