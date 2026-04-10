// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class CallbackCdsqScratchesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 交易流水号
        [NameInMap("transaction_no")]
        [Validation(Required=true)]
        public string TransactionNo { get; set; }

    }

}
