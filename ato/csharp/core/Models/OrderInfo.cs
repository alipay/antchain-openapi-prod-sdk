// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 主订单信息
    public class OrderInfo : TeaModel {
        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 订单创建时间
        [NameInMap("order_create_time")]
        [Validation(Required=false)]
        public string OrderCreateTime { get; set; }

        // 订单支付时间
        [NameInMap("order_pay_time")]
        [Validation(Required=false)]
        public string OrderPayTime { get; set; }

        // 租金总额(分)
        [NameInMap("total_rent_money")]
        [Validation(Required=false)]
        public long? TotalRentMoney { get; set; }

        // 租期
        [NameInMap("rent_term")]
        [Validation(Required=false)]
        public long? RentTerm { get; set; }

        // 租期单位
        [NameInMap("rent_unit")]
        [Validation(Required=false)]
        public string RentUnit { get; set; }

        // 订单状态
        [NameInMap("order_status")]
        [Validation(Required=false)]
        public string OrderStatus { get; set; }

        // 订单子状态
        [NameInMap("order_sub_status")]
        [Validation(Required=false)]
        public string OrderSubStatus { get; set; }

        // 免押金额（分）
        [NameInMap("deposit_price")]
        [Validation(Required=false)]
        public long? DepositPrice { get; set; }

        // 到期买断价(分)
        [NameInMap("buy_out_price")]
        [Validation(Required=false)]
        public long? BuyOutPrice { get; set; }

        // 物流方案
        [NameInMap("logistic_type")]
        [Validation(Required=false)]
        public string LogisticType { get; set; }

        // 到期形式
        // NA(0, "无意义"),
        // BUYOUT(1, "到期买断或归还"),
        // FREE_ON_RENT(2, "租满即送"),
        // RENEW_LEASE(3, "续租"),;
        [NameInMap("due_mode")]
        [Validation(Required=false)]
        public long? DueMode { get; set; }

        // 首付款金额(分)
        [NameInMap("down_payment")]
        [Validation(Required=false)]
        public long? DownPayment { get; set; }

    }

}
