// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 保单信息
    public class InsureOrderInfo : TeaModel {
        // 商家订单ID
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 投保编号（承保id）
        [NameInMap("insure_id")]
        [Validation(Required=false)]
        public string InsureId { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 保险开始时间
        [NameInMap("insure_start_time")]
        [Validation(Required=false)]
        public string InsureStartTime { get; set; }

        // 保险终止时间
        [NameInMap("insure_end_time")]
        [Validation(Required=false)]
        public string InsureEndTime { get; set; }

        // 投保金额（保额），单位分 100代表1元
        [NameInMap("insure_amount")]
        [Validation(Required=false)]
        public long? InsureAmount { get; set; }

        // 投保费用（保费），单位分 100代表1元
        [NameInMap("insure_premium")]
        [Validation(Required=false)]
        public long? InsurePremium { get; set; }

        // 投保状态枚举
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
