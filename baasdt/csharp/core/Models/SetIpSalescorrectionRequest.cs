// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class SetIpSalescorrectionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础请求信息
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=true)]
        public string IpOrderId { get; set; }

        // 订单的数据ID，订单中每个数据ID唯一
        [NameInMap("sales_biz_id")]
        [Validation(Required=true)]
        public string SalesBizId { get; set; }

        // 数量校正，负数表示减少本次销售数量，但减少后宗销售数量不能小于0。不校正数量则填0.
        [NameInMap("correct_amount")]
        [Validation(Required=true)]
        public long? CorrectAmount { get; set; }

        // 销售金额校正，单位元，负数表示减少本次销售金额，但减少后销售金额不能小于0。不校正数量则填0.00。
        [NameInMap("correct_sales")]
        [Validation(Required=true)]
        public string CorrectSales { get; set; }

    }

}
