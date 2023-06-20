// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryCctPictureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // InfoSecAnalyzeSyncContent json
        [NameInMap("request")]
        [Validation(Required=true)]
        public string Request { get; set; }

        // RaaS产品码
        [NameInMap("raas_products")]
        [Validation(Required=true)]
        public string RaasProducts { get; set; }

    }

}
