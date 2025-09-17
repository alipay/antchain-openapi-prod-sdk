// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class RepayDubbridgeRepayWithholdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 授信申请订单号
        [NameInMap("original_order_no")]
        [Validation(Required=true)]
        public string OriginalOrderNo { get; set; }

        // 还款类型1:当期结清，2：正常还款3：全部结清
        [NameInMap("repay_type")]
        [Validation(Required=true)]
        public string RepayType { get; set; }

        // 逾期期次列表（担保渠道）
        [NameInMap("period_list")]
        [Validation(Required=false)]
        public List<long?> PeriodList { get; set; }

        // 校验还款金额
        [NameInMap("valid_repay_amount")]
        [Validation(Required=false)]
        public string ValidRepayAmount { get; set; }

        // 银行卡号
        [NameInMap("bank_card_no")]
        [Validation(Required=false)]
        public string BankCardNo { get; set; }

        // 是否支付代扣，Y是N否（Y：支付代扣，N：无需走支付通道，直接信息流入账--线下还款模式）；（担保渠道）
        [NameInMap("payment_flag")]
        [Validation(Required=false)]
        public string PaymentFlag { get; set; }

        // 账号开户名，payment_flag=Y时，必填；（担保渠道）
        [NameInMap("account_name")]
        [Validation(Required=false)]
        public string AccountName { get; set; }

        // 银行预留手机号，payment_flag=Y时，必填；（担保渠道）
        [NameInMap("reserved_mobile")]
        [Validation(Required=false)]
        public string ReservedMobile { get; set; }

        // 账号开户行编码（担保渠道）
        [NameInMap("account_open_bank")]
        [Validation(Required=false)]
        public string AccountOpenBank { get; set; }

        // 扣款渠道代码（担保渠道）
        [NameInMap("deduction_code")]
        [Validation(Required=false)]
        public string DeductionCode { get; set; }

        // 通道签约协议号（担保渠道）
        [NameInMap("signing_agreement_num")]
        [Validation(Required=false)]
        public string SigningAgreementNum { get; set; }

    }

}
