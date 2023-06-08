// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_429c38c9f7374a5f9ad9e5401325ebb0.Models
{
    public class RunAntsecuritytechGatewayXhunterSpiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // json
        [NameInMap("request")]
        [Validation(Required=true)]
        public string Request { get; set; }

        // XHUNTER_ISV_STANDARD
        [NameInMap("service_name")]
        [Validation(Required=true)]
        public string ServiceName { get; set; }

        // json
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
