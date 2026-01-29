// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 商户进件记录分页对象
    public class MerchantExpandSummaryPage : TeaModel {
        // 进件id
        [NameInMap("pay_expand_id")]
        [Validation(Required=true)]
        public string PayExpandId { get; set; }

        // 支付渠道
        // JDPAY
        // ALIPAY
        [NameInMap("pay_channel")]
        [Validation(Required=true)]
        public string PayChannel { get; set; }

        // 进件审核状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public string CreateTime { get; set; }

        // 最后修改时间
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public string UpdateTime { get; set; }

    }

}
