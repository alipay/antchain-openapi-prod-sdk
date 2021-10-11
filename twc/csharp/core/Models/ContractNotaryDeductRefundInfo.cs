// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 电子合同存证代扣计划退款信息
    public class ContractNotaryDeductRefundInfo : TeaModel {
        // PAYERIDNUMBER
        [NameInMap("payer_id")]
        [Validation(Required=true)]
        public string PayerId { get; set; }

        // 退款金额，单位分
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 代扣计划ID
        [NameInMap("order")]
        [Validation(Required=true)]
        public string Order { get; set; }

        // 退款操作发起时间
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public string Timestamp { get; set; }

    }

}
