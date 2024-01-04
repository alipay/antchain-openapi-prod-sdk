// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class RepayAntchainAtoWithholdPlanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 第几期
        [NameInMap("period_num")]
        [Validation(Required=true)]
        public long? PeriodNum { get; set; }

        // 扣款时间
        [NameInMap("gmt_pay")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtPay { get; set; }

        // 清偿清欠金额，单位为分
        [NameInMap("pay_off_amount")]
        [Validation(Required=true)]
        public long? PayOffAmount { get; set; }

        // 清偿清欠方式
        // WECHAT:微信;
        // BANK:银行
        // ALIPAY:支付宝
        [NameInMap("pay_off_type")]
        [Validation(Required=true, MaxLength=64)]
        public string PayOffType { get; set; }

        // 清偿清欠单号,通过其他方式清偿的第三方单号;例如银行流水号或微信流水号
        [NameInMap("pay_off_no")]
        [Validation(Required=true, MaxLength=64)]
        public string PayOffNo { get; set; }

        // 清偿清欠银行名称,方式为银行时必填
        [NameInMap("pay_off_bank_name")]
        [Validation(Required=false, MaxLength=64)]
        public string PayOffBankName { get; set; }

    }

}
