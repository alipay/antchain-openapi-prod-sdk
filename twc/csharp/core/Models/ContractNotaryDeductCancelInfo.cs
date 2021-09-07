// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 电子合同代扣计划取消操作信息
    public class ContractNotaryDeductCancelInfo : TeaModel {
        // 付款方的区块链合同签署账号
        [NameInMap("payer_id")]
        [Validation(Required=true)]
        public string PayerId { get; set; }

        // 是否取消成功
        [NameInMap("cancel_status")]
        [Validation(Required=true)]
        public bool? CancelStatus { get; set; }

        // 取消操作发起时间
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public string Timestamp { get; set; }

        // 代扣订单号，多个订单号之间以‘,’隔开
        [NameInMap("orders")]
        [Validation(Required=true)]
        public string Orders { get; set; }

    }

}
