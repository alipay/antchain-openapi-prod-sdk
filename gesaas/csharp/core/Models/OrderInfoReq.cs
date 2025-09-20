// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 主订单信息
    public class OrderInfoReq : TeaModel {
        // 订单创建时间
        [NameInMap("order_create_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OrderCreateTime { get; set; }

        // 订单付款主题
        [NameInMap("order_pay_subject")]
        [Validation(Required=false)]
        public string OrderPaySubject { get; set; }

        // 总租期
        // 总租期最小值为1
        // 总租期最大值为60
        [NameInMap("rent_term")]
        [Validation(Required=true)]
        public long? RentTerm { get; set; }

        // 租期单位
        // MONTH : 月 
        // DAY : 天
        [NameInMap("rent_unit")]
        [Validation(Required=true)]
        public string RentUnit { get; set; }

        // 租金总额 单位/分
        // 最小值为1
        [NameInMap("total_rent_money")]
        [Validation(Required=true)]
        public long? TotalRentMoney { get; set; }

    }

}
