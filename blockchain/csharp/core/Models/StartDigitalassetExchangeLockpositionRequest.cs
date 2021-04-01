// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDigitalassetExchangeLockpositionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 版通代码
        [NameInMap("ep_code")]
        [Validation(Required=false)]
        public string EpCode { get; set; }

        // 交易所代码
        [NameInMap("exchange_code")]
        [Validation(Required=true)]
        public string ExchangeCode { get; set; }

        // 锁定操作，0为解锁，1为锁定
        [NameInMap("operate")]
        [Validation(Required=true)]
        public long? Operate { get; set; }

        // 业务方账户
        [NameInMap("user_account")]
        [Validation(Required=false)]
        public string UserAccount { get; set; }

    }

}
