// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeAgreementPreviewRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授信：apply
        // 借款：loan
        // 绑卡：bind
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 资金方编号
        [NameInMap("fund_code")]
        [Validation(Required=true)]
        public string FundCode { get; set; }

        // 客户号
        [NameInMap("customer_no")]
        [Validation(Required=true)]
        public string CustomerNo { get; set; }

        // 借款金额
        [NameInMap("loan_amount")]
        [Validation(Required=false)]
        public long? LoanAmount { get; set; }

        // 分期期数
        [NameInMap("period")]
        [Validation(Required=false)]
        public long? Period { get; set; }

        // 银行编码
        [NameInMap("bank_code")]
        [Validation(Required=false)]
        public string BankCode { get; set; }

        // 还款方式
        [NameInMap("repay_type")]
        [Validation(Required=false)]
        public string RepayType { get; set; }

        // 银行名称
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 银行卡号
        [NameInMap("bank_card_no")]
        [Validation(Required=false)]
        public string BankCardNo { get; set; }

        // 借据截至日期yyyy-MM-dd
        [NameInMap("receipt_end_date")]
        [Validation(Required=false)]
        public string ReceiptEndDate { get; set; }

        // 借款用途
        [NameInMap("loan_way")]
        [Validation(Required=false)]
        public string LoanWay { get; set; }

        // lpr
        [NameInMap("lpr")]
        [Validation(Required=false)]
        public long? Lpr { get; set; }

        // LPR加点值
        [NameInMap("lpr_point")]
        [Validation(Required=false)]
        public long? LprPoint { get; set; }

        // LPR发布日期
        [NameInMap("lpr_effect_date")]
        [Validation(Required=false)]
        public string LprEffectDate { get; set; }

    }

}
