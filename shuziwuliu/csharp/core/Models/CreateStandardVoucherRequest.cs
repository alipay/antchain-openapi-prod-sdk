// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateStandardVoucherRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据标识
        [NameInMap("business_code")]
        [Validation(Required=true)]
        public string BusinessCode { get; set; }

        // 资产类型
        [NameInMap("asset_type")]
        [Validation(Required=true)]
        public string AssetType { get; set; }

        // 发行金额
        [NameInMap("amount_proof")]
        [Validation(Required=true)]
        public string AmountProof { get; set; }

        // 发行金额
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 余额
        [NameInMap("balance_proof")]
        [Validation(Required=true)]
        public string BalanceProof { get; set; }

        // 余额
        [NameInMap("balance")]
        [Validation(Required=true)]
        public string Balance { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 发行时间
        [NameInMap("issue_time")]
        [Validation(Required=true)]
        public long? IssueTime { get; set; }

        // 到期时间
        [NameInMap("expire_time")]
        [Validation(Required=true)]
        public long? ExpireTime { get; set; }

        // 清分时间
        [NameInMap("clearing_time")]
        [Validation(Required=true)]
        public long? ClearingTime { get; set; }

        // 发布者
        [NameInMap("issuer")]
        [Validation(Required=true)]
        public string Issuer { get; set; }

        // 资本者
        [NameInMap("capital")]
        [Validation(Required=true)]
        public string Capital { get; set; }

        // 所属账户
        [NameInMap("voucher_owner")]
        [Validation(Required=true)]
        public string VoucherOwner { get; set; }

    }

}
