// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class CreateDubbridgeAlipayTradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // request请求单号，每次请求唯一，如uuid
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 订单归属门店id
        [NameInMap("store_id")]
        [Validation(Required=true)]
        public string StoreId { get; set; }

        // 订单车辆信息
        [NameInMap("vehicle_info")]
        [Validation(Required=true)]
        public VehicleInfo VehicleInfo { get; set; }

        // 订单绝对超时时间 yyyy-MM-dd HH:mm:ss，支付宝结算生成订单二维码时传值（非必填，优先于 timeout_express)
        [NameInMap("time_expire")]
        [Validation(Required=false)]
        public string TimeExpire { get; set; }

        // 订单相对超时时间，从预下单请求时间开始计算，该笔订单允许的最晚付款时间，逾期将关闭交易（非必填）
        [NameInMap("timeout_express")]
        [Validation(Required=false)]
        public string TimeoutExpress { get; set; }

    }

}
