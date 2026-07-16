// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerFundmngloanapplyResponse : TeaModel {
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

        // 融资放款申请状态
        [NameInMap("finance_loan_apply_status")]
        [Validation(Required=false)]
        public string FinanceLoanApplyStatus { get; set; }

        // 商户还款方式
        // 每期全额还款，FULL_REPAYMENT_PER_INSTALLMENT
        [NameInMap("merchant_pay_type")]
        [Validation(Required=false)]
        public string MerchantPayType { get; set; }

        // 商户代偿开始天数
        [NameInMap("merchant_compensate_start_day")]
        [Validation(Required=false)]
        public long? MerchantCompensateStartDay { get; set; }

        // 商户还款开始期数
        [NameInMap("pay_start_term_index")]
        [Validation(Required=false)]
        public long? PayStartTermIndex { get; set; }

        // 商户付款项目，多个逗号分隔
        [NameInMap("payment_item")]
        [Validation(Required=false)]
        public string PaymentItem { get; set; }

        // 分账支付宝账号uid
        [NameInMap("divide_alipay_user_id")]
        [Validation(Required=false)]
        public string DivideAlipayUserId { get; set; }

        // 分账支付宝账号登录号
        [NameInMap("divide_alipay_login_id")]
        [Validation(Required=false)]
        public string DivideAlipayLoginId { get; set; }

        // 代偿支付宝账号uid
        [NameInMap("compensate_alipay_user_id")]
        [Validation(Required=false)]
        public string CompensateAlipayUserId { get; set; }

        // 代偿支付宝账号登录号
        [NameInMap("compensate_alipay_login_id")]
        [Validation(Required=false)]
        public string CompensateAlipayLoginId { get; set; }

        // 商户履约承诺，MerchantPromiseInfo
        [NameInMap("merchant_promise_info")]
        [Validation(Required=false)]
        public string MerchantPromiseInfo { get; set; }

        // 放款结果，FinanceLoanResults
        [NameInMap("finance_loan_results")]
        [Validation(Required=false)]
        public string FinanceLoanResults { get; set; }

        // 融资放款结果同步失败原因
        [NameInMap("finance_loan_result_sync_fail_reason")]
        [Validation(Required=false)]
        public string FinanceLoanResultSyncFailReason { get; set; }

    }

}
