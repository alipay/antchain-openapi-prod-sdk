// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_6f8b0e7502ec49d28cd8ad0e5807bbf9.Models
{
    public class QueryDemoAasSaSaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // aa
        [NameInMap("not_blank_verify")]
        [Validation(Required=true)]
        public string NotBlankVerify { get; set; }

    }

}
