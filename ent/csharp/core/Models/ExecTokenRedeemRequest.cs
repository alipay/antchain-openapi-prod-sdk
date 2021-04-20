// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class ExecTokenRedeemRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务单号
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 链 ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 合约 ID
        [NameInMap("contract_id")]
        [Validation(Required=true)]
        public string ContractId { get; set; }

        // 币种，目前仅支持 CNY
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 调用方
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 要兑现的用户VID
        [NameInMap("target_user")]
        [Validation(Required=true)]
        public string TargetUser { get; set; }

        // Token总金额，token_price*token_number 的结果，单位为分
        [NameInMap("token_amount")]
        [Validation(Required=true)]
        public long? TokenAmount { get; set; }

        // 兑现的Token数目
        [NameInMap("token_number")]
        [Validation(Required=true)]
        public long? TokenNumber { get; set; }

        // 兑现的Token单价，单位为分
        [NameInMap("token_price")]
        [Validation(Required=true)]
        public long? TokenPrice { get; set; }

    }

}
