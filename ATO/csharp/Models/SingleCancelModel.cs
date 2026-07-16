// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 单期取消模型
    public class SingleCancelModel : TeaModel {
        // 第几期
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("period_num")]
        [Validation(Required=true)]
        public long? PeriodNum { get; set; }

        // 其他方式还款的时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_pay")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtPay { get; set; }

        // 取消订单某一期代扣计划中以其他方式还款金额，单位为分
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("pay_off_amount")]
        [Validation(Required=true)]
        public long? PayOffAmount { get; set; }

        // 变更其他方式还款WECHAT:微信; BANK:银行
        // ALIPAY:支付宝
        // CASH:现金
        /// <summary>
        /// <b>Example:</b>
        /// <para>WECHAT</para>
        /// </summary>
        [NameInMap("pay_off_type")]
        [Validation(Required=false, MaxLength=64)]
        public string PayOffType { get; set; }

        // 通过其他方式还款单号;例如银行流水号或微信流水号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1234</para>
        /// </summary>
        [NameInMap("pay_off_no")]
        [Validation(Required=false, MaxLength=64)]
        public string PayOffNo { get; set; }

        // 其他方式还款银行名称，还款方式为银行时必填
        /// <summary>
        /// <b>Example:</b>
        /// <para>中国银行</para>
        /// </summary>
        [NameInMap("pay_off_bank_name")]
        [Validation(Required=false, MaxLength=64)]
        public string PayOffBankName { get; set; }

    }

}
