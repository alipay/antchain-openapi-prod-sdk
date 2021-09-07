// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 电子合同存证代扣计划执行操作信息
    public class ContractNotaryDeductExecutionInfo : TeaModel {
        // 付款方的区块链合同签署账号
        [NameInMap("payer_id")]
        [Validation(Required=true)]
        public string PayerId { get; set; }

        // 扣款金额，单位分
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 扣款渠道
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 扣款操作是否成功
        [NameInMap("result")]
        [Validation(Required=true)]
        public bool? Result { get; set; }

        // 扣款操作发起时间
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public string Timestamp { get; set; }

        // 代扣订单号
        [NameInMap("order")]
        [Validation(Required=true)]
        public string Order { get; set; }

    }

}
