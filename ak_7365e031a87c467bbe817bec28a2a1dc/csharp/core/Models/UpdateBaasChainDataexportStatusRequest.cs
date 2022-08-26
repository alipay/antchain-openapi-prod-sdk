// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_7365e031a87c467bbe817bec28a2a1dc.Models
{
    public class UpdateBaasChainDataexportStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链id
        [NameInMap("ant_chain_id")]
        [Validation(Required=true)]
        public string AntChainId { get; set; }

        // 联盟id
        [NameInMap("consortium_id")]
        [Validation(Required=true)]
        public string ConsortiumId { get; set; }

        // "9481b612d6ca4cfdbecc5c5d395eda423f007745-233d-4860-8fd4-a107233ace6c"
        [NameInMap("trigger_name")]
        [Validation(Required=true)]
        public string TriggerName { get; set; }

        //  "Enabled/Disabled/DELETE"
        [NameInMap("status_action")]
        [Validation(Required=true)]
        public string StatusAction { get; set; }

    }

}
