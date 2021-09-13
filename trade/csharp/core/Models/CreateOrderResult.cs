// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 下单返回接口
    public class CreateOrderResult : TeaModel {
        // 下单时指定的业务流水号。二级订单号
        [NameInMap("bsn_no")]
        [Validation(Required=true)]
        public string BsnNo { get; set; }

        // 一级订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 二级订单号
        [NameInMap("normal_order_line_id")]
        [Validation(Required=true)]
        public string NormalOrderLineId { get; set; }

        // 订单状态
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // 实例列表
        [NameInMap("instance_ids")]
        [Validation(Required=true)]
        public string InstanceIds { get; set; }

        // 订购错误码
        [NameInMap("order_error_code")]
        [Validation(Required=true)]
        public string OrderErrorCode { get; set; }

        // 订购错误描述
        [NameInMap("order_error_description")]
        [Validation(Required=true)]
        public string OrderErrorDescription { get; set; }

    }

}
