// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 授权信息
    public class SofaGwAuthenticationVO : TeaModel {
        // 		
        // access key
        // 
        // 
        [NameInMap("auth_access_key")]
        [Validation(Required=false)]
        public string AuthAccessKey { get; set; }

        // secret key
        [NameInMap("auth_secret_key")]
        [Validation(Required=false)]
        public string AuthSecretKey { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

    }

}
