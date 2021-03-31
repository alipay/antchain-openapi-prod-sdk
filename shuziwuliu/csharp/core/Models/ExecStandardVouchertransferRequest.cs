// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ExecStandardVouchertransferRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 所属账户
        [NameInMap("voucher_owner")]
        [Validation(Required=true)]
        public string VoucherOwner { get; set; }

        // 数据标识
        [NameInMap("business_code")]
        [Validation(Required=true)]
        public string BusinessCode { get; set; }

        // 余额
        [NameInMap("balance_sender_transfer")]
        [Validation(Required=true)]
        public string BalanceSenderTransfer { get; set; }

        // 余额
        [NameInMap("balance_proof")]
        [Validation(Required=true)]
        public string BalanceProof { get; set; }

        // 余额
        [NameInMap("balance_receiver_account")]
        [Validation(Required=true)]
        public string BalanceReceiverAccount { get; set; }

        // 余额
        [NameInMap("balance_receiver_business_code")]
        [Validation(Required=true)]
        public string BalanceReceiverBusinessCode { get; set; }

        // 余额
        [NameInMap("balance_receiver_transfer")]
        [Validation(Required=true)]
        public string BalanceReceiverTransfer { get; set; }

    }

}
