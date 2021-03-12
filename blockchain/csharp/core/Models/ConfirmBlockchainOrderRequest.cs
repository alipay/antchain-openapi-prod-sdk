// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ConfirmBlockchainOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // data
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // user_request_id
        [NameInMap("user_request_id")]
        [Validation(Required=false)]
        public string UserRequestId { get; set; }

    }

}
