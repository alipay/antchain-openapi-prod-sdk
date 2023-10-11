// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    // 订单还款计划
    public class PromiseInfo : TeaModel {
        // 订单 id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 宽限期，精确到 毫秒，产生罚息的延迟时间范围。
        [NameInMap("date_limit")]
        [Validation(Required=true)]
        public long? DateLimit { get; set; }

        // 应付租金时间，格式为 2019-08-31 12:00:00
        // yyyy-MM-dd HH:mm:ss
        [NameInMap("pay_date_list")]
        [Validation(Required=true)]
        public List<string> PayDateList { get; set; }

        // 租期
        [NameInMap("pay_period")]
        [Validation(Required=true)]
        public long? PayPeriod { get; set; }

        // 应付租金，精确到分，即 1234 表示 12.34 元
        [NameInMap("pay_money_list")]
        [Validation(Required=true)]
        public List<long?> PayMoneyList { get; set; }

        // 租赁公司支付宝 UID
        [NameInMap("lease_alipay_uid")]
        [Validation(Required=true, MaxLength=50)]
        public string LeaseAlipayUid { get; set; }

    }

}
