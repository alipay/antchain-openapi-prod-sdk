// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢系统专用CreditAmount结构体
    public class CreditAmount : TeaModel {
        // 授信额度
        [NameInMap("credit_amount")]
        [Validation(Required=true)]
        public long? CreditAmount_ { get; set; }

        // 授信余额
        [NameInMap("rest_amount")]
        [Validation(Required=true)]
        public long? RestAmount { get; set; }

        // 发放日期
        [NameInMap("pay_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PayDate { get; set; }

        // 到期日期
        [NameInMap("expire_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpireDate { get; set; }

        // 利率单位(1:年，2：月，3：日)
        [NameInMap("rate_unit")]
        [Validation(Required=true)]
        public string RateUnit { get; set; }

        // 执行利率,利率值，单位%
        // 年化5%，rateValue=5
        // 
        [NameInMap("rate_value")]
        [Validation(Required=true)]
        public long? RateValue { get; set; }

        // 还款方式1等额本息2等额本金3先息后本4一次性利随本清5只还本金6等本等息
        [NameInMap("repay_way")]
        [Validation(Required=true)]
        public string RepayWay { get; set; }

        // 状态0-正常 1-冻结 2-终止
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 发放日期（兼容字段）
        [NameInMap("pay_date_sup")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PayDateSup { get; set; }

        // 到期日期（兼容字段）
        [NameInMap("expire_date_sup")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpireDateSup { get; set; }

    }

}
