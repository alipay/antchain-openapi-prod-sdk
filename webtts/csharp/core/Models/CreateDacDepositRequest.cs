// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    public class CreateDacDepositRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 白名单地址为交易from的地址，用于发起转账操作
        [NameInMap("whitelist_address")]
        [Validation(Required=true)]
        public string WhitelistAddress { get; set; }

        // 存入的金额，可以为整数，或者携带小数位，除以精度之后的值
        [NameInMap("deposit_amount")]
        [Validation(Required=true)]
        public string DepositAmount { get; set; }

        // 区块链名称
        [NameInMap("blockchain")]
        [Validation(Required=true)]
        public string Blockchain { get; set; }

        // token名称
        [NameInMap("token_symbol")]
        [Validation(Required=true)]
        public string TokenSymbol { get; set; }

        // 外部客户唯一id
        [NameInMap("external_customer_id")]
        [Validation(Required=true)]
        public string ExternalCustomerId { get; set; }

    }

}
