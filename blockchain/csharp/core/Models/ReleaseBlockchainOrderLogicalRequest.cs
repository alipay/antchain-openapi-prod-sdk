// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ReleaseBlockchainOrderLogicalRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // bid
        [NameInMap("bid")]
        [Validation(Required=true)]
        public string Bid { get; set; }

        // country
        [NameInMap("country")]
        [Validation(Required=false)]
        public string Country { get; set; }

        // gmt_wakeup
        [NameInMap("gmt_wakeup")]
        [Validation(Required=false)]
        public string GmtWakeup { get; set; }

        // hid
        [NameInMap("hid")]
        [Validation(Required=true)]
        public long? Hid { get; set; }

        // 中断标识
        [NameInMap("interrupt")]
        [Validation(Required=false)]
        public bool? Interrupt { get; set; }

        // pk
        [NameInMap("pk")]
        [Validation(Required=true)]
        public string Pk { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // request_id
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // task_extra_data
        [NameInMap("task_extra_data")]
        [Validation(Required=false)]
        public string TaskExtraData { get; set; }

        // task_identifier
        [NameInMap("task_identifier")]
        [Validation(Required=false)]
        public string TaskIdentifier { get; set; }

    }

}
