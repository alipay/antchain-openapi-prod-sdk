// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PushRentBillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业主房屋账单ID(
        [NameInMap("lease_bill_id")]
        [Validation(Required=true)]
        public string LeaseBillId { get; set; }

        // 房源ID
        [NameInMap("house_id")]
        [Validation(Required=true)]
        public string HouseId { get; set; }

        // 总账单开始日期
        [NameInMap("bill_begin_date")]
        [Validation(Required=true)]
        public string BillBeginDate { get; set; }

        // 总账单结束日期
        [NameInMap("bill_end_date")]
        [Validation(Required=true)]
        public string BillEndDate { get; set; }

        // 总账单金额
        [NameInMap("bill_money")]
        [Validation(Required=true)]
        public string BillMoney { get; set; }

        // 提醒缴租日期范围(天数)
        [NameInMap("remind_range")]
        [Validation(Required=true)]
        public string RemindRange { get; set; }

        // 逾期未缴租警告日期范围(天数)
        [NameInMap("warn_range")]
        [Validation(Required=true)]
        public string WarnRange { get; set; }

        // 风险干预日期天数
        [NameInMap("risk_range")]
        [Validation(Required=true)]
        public string RiskRange { get; set; }

        // 账单租期集合
        [NameInMap("bill_item_list")]
        [Validation(Required=true)]
        public RentBillItem BillItemList { get; set; }

    }

}
