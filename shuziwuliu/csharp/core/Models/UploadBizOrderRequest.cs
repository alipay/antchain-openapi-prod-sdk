// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UploadBizOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 船公司did
        [NameInMap("carrier_did")]
        [Validation(Required=true)]
        public string CarrierDid { get; set; }

        // 尾款金额
        [NameInMap("deadline_amount")]
        [Validation(Required=true)]
        public string DeadlineAmount { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 订单总额
        [NameInMap("order_amounts")]
        [Validation(Required=true)]
        public List<UploadOrderAmount> OrderAmounts { get; set; }

        // 订单booking信息
        [NameInMap("order_bookings")]
        [Validation(Required=true)]
        public List<UploadOrderBooking> OrderBookings { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 结算did
        [NameInMap("settle_did")]
        [Validation(Required=true)]
        public string SettleDid { get; set; }

    }

}
