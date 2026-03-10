// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class NotifyDubbridgeRepaymentplanLxRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 支用申请编号
        [NameInMap("apply_id")]
        [Validation(Required=true)]
        public string ApplyId { get; set; }

        // 合作方代码
        [NameInMap("partner_code")]
        [Validation(Required=false)]
        public string PartnerCode { get; set; }

        // 放款编号
        [NameInMap("capital_loan_no")]
        [Validation(Required=true)]
        public string CapitalLoanNo { get; set; }

        // 借款总期数
        [NameInMap("total_term")]
        [Validation(Required=true)]
        public long? TotalTerm { get; set; }

        // 借据总金额(元)
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

        // 放款成功日期，yyyy_MM-dd HH:mm:ss
        [NameInMap("payment_time")]
        [Validation(Required=true)]
        public string PaymentTime { get; set; }

        // 还款计划列表
        [NameInMap("repay_plans")]
        [Validation(Required=true)]
        public List<RepayPlanNotifyItem> RepayPlans { get; set; }

    }

}
