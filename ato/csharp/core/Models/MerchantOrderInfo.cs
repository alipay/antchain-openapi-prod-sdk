// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单信息
    public class MerchantOrderInfo : TeaModel {
        // 支付宝代扣协议号
        [NameInMap("agreement_no")]
        [Validation(Required=false)]
        public string AgreementNo { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 订单创建时间
        [NameInMap("order_create_time")]
        [Validation(Required=false)]
        public string OrderCreateTime { get; set; }

        // 租金总额（单位分）
        [NameInMap("total_rent_money")]
        [Validation(Required=false)]
        public long? TotalRentMoney { get; set; }

        // 租期
        [NameInMap("rent_rerm")]
        [Validation(Required=false)]
        public long? RentRerm { get; set; }

        // 订单状态
        [NameInMap("order_status")]
        [Validation(Required=false)]
        public string OrderStatus { get; set; }

        // 承租人名称
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 承租人手机号
        [NameInMap("user_phone_number")]
        [Validation(Required=false)]
        public string UserPhoneNumber { get; set; }

    }

}
