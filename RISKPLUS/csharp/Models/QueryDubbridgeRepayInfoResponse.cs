// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeRepayInfoResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 还款编号
        [NameInMap("repay_no")]
        [Validation(Required=false)]
        public string RepayNo { get; set; }

        // 借据编码
        [NameInMap("receipt_no")]
        [Validation(Required=false)]
        public string ReceiptNo { get; set; }

        // 客户编号
        [NameInMap("custom_no")]
        [Validation(Required=false)]
        public string CustomNo { get; set; }

        // 客户名称
        [NameInMap("custom_name")]
        [Validation(Required=false)]
        public string CustomName { get; set; }

        // 还款类型1:提前还款，2：正常还款 3:批量还款 4：自由还款
        [NameInMap("repay_type")]
        [Validation(Required=false)]
        public string RepayType { get; set; }

        // repay_sign
        [NameInMap("repay_sign")]
        [Validation(Required=false)]
        public string RepaySign { get; set; }

        // 还款日期
        [NameInMap("repay_date")]
        [Validation(Required=false)]
        public string RepayDate { get; set; }

        // 实还总额
        [NameInMap("repay_amount")]
        [Validation(Required=false)]
        public long? RepayAmount { get; set; }

        // 实还本金
        [NameInMap("repay_principal")]
        [Validation(Required=false)]
        public long? RepayPrincipal { get; set; }

        // 实还利息
        [NameInMap("repay_interest")]
        [Validation(Required=false)]
        public long? RepayInterest { get; set; }

        // 实还通道手续费
        [NameInMap("channel_amt")]
        [Validation(Required=false)]
        public long? ChannelAmt { get; set; }

        // 实还手续费
        [NameInMap("repay_fee")]
        [Validation(Required=false)]
        public string RepayFee { get; set; }

        // 实收罚息
        [NameInMap("repay_punish")]
        [Validation(Required=false)]
        public long? RepayPunish { get; set; }

        // 还款账户
        [NameInMap("repay_account")]
        [Validation(Required=false)]
        public string RepayAccount { get; set; }

        // 还款账户名称
        [NameInMap("repay_account_name")]
        [Validation(Required=false)]
        public string RepayAccountName { get; set; }

        // 还款账户的手机号
        [NameInMap("repay_mobile")]
        [Validation(Required=false)]
        public string RepayMobile { get; set; }

        // 还款账户银行行号
        [NameInMap("repay_bank_no")]
        [Validation(Required=false)]
        public string RepayBankNo { get; set; }

        // 还款账户银行名称
        [NameInMap("repay_bank_name")]
        [Validation(Required=false)]
        public string RepayBankName { get; set; }

        // 还款状态0:失败 1成功 2-审批中 3-还款中
        [NameInMap("repay_status")]
        [Validation(Required=false)]
        public string RepayStatus { get; set; }

        // 失败原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

        // 授信申请编号
        [NameInMap("apply_no")]
        [Validation(Required=false)]
        public string ApplyNo { get; set; }

        // 担保费
        [NameInMap("guarantee_fee")]
        [Validation(Required=false)]
        public long? GuaranteeFee { get; set; }

        // 违约金
        [NameInMap("liquidated_damages")]
        [Validation(Required=false)]
        public long? LiquidatedDamages { get; set; }

    }

}
