// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 创建订单返回结果
    public class CreateTradeOrderResult : TeaModel {
        // 订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 下单时的订单号
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 实例ID列表
        [NameInMap("instance_ids")]
        [Validation(Required=false)]
        public List<string> InstanceIds { get; set; }

        // 订单状态
        [NameInMap("pay_status")]
        [Validation(Required=true)]
        public string PayStatus { get; set; }

        // 订购错误码
        [NameInMap("order_error_code")]
        [Validation(Required=false)]
        public string OrderErrorCode { get; set; }

        // 订购错误描述	
        [NameInMap("order_error_description")]
        [Validation(Required=false)]
        public string OrderErrorDescription { get; set; }

    }

}
