// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDigitalassetExchangeEptradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 交易数量
        [NameInMap("ep_amount")]
        [Validation(Required=true)]
        public long? EpAmount { get; set; }

        // 版通代码
        [NameInMap("ep_code")]
        [Validation(Required=true)]
        public string EpCode { get; set; }

        // 交易所代码
        [NameInMap("exchange_code")]
        [Validation(Required=true)]
        public string ExchangeCode { get; set; }

        // 卖方账户
        [NameInMap("from_account")]
        [Validation(Required=true)]
        public string FromAccount { get; set; }

        // 买方账户
        [NameInMap("to_account")]
        [Validation(Required=true)]
        public string ToAccount { get; set; }

    }

}
