// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class SyncEcpCloudRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // api_code
        [NameInMap("api_code")]
        [Validation(Required=true)]
        public string ApiCode { get; set; }

        // param_map_json
        [NameInMap("param_map_json")]
        [Validation(Required=true)]
        public string ParamMapJson { get; set; }

    }

}
