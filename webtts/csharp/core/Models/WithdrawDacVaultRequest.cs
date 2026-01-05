// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    public class WithdrawDacVaultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // customerId of The DAC System
        [NameInMap("external_customer_id")]
        [Validation(Required=true)]
        public string ExternalCustomerId { get; set; }

        // blockchain:Ethereum Ploygen
        [NameInMap("blockchain")]
        [Validation(Required=true)]
        public string Blockchain { get; set; }

        // Token Token Token identification
        [NameInMap("token_symbol")]
        [Validation(Required=true)]
        public string TokenSymbol { get; set; }

        // withdrawal token amount
        [NameInMap("withdrawal_amount")]
        [Validation(Required=true)]
        public string WithdrawalAmount { get; set; }

        // description of requisition and withdrawal application
        [NameInMap("withdraw_token_desc")]
        [Validation(Required=false)]
        public string WithdrawTokenDesc { get; set; }

        // the address on the wallet chain of the user_s money withdrawal.
        [NameInMap("withdrawal_whitelist_address")]
        [Validation(Required=true)]
        public string WithdrawalWhitelistAddress { get; set; }

    }

}
