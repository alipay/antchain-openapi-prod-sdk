// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class CreateBlockchainBotIotsuccessProductMcpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // JSON对象字符串
        [NameInMap("headers")]
        [Validation(Required=false)]
        public string Headers { get; set; }

        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        [NameInMap("purpose")]
        [Validation(Required=true)]
        public string Purpose { get; set; }

    }

}
