// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractTradedetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合同id
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // out_trade_no
        [NameInMap("out_trade_no")]
        [Validation(Required=true)]
        public string OutTradeNo { get; set; }

    }

}
