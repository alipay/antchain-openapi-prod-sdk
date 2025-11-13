// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncInnerFundmngloanresultsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方的租户id
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

        // 商户的租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 商户的社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 资方的社会统一信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 同步类型
        // AGREE_RETRY（同意重试）
        // AGREE （同意）
        // REJECT（拒绝）
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 融资模式
        // 供应链金融：
        // SUPPLY_CHAIN_FINANCE
        // 自定义还款：
        // DEFAULT
        [NameInMap("fund_mode")]
        [Validation(Required=true)]
        public string FundMode { get; set; }

        // 融资放款结果，FinanceLoanResults
        [NameInMap("finance_loan_results")]
        [Validation(Required=false)]
        public string FinanceLoanResults { get; set; }

        // 商户履约承诺MerchantPromiseInfo
        [NameInMap("merchant_promise_info")]
        [Validation(Required=false)]
        public string MerchantPromiseInfo { get; set; }

        // 推广id
        [NameInMap("promotion_id")]
        [Validation(Required=false)]
        public string PromotionId { get; set; }

        // 商户起始还款期数
        [NameInMap("pay_start_term_index")]
        [Validation(Required=false)]
        public long? PayStartTermIndex { get; set; }

        // 分账支付宝账号uid
        [NameInMap("divide_alipay_user_id")]
        [Validation(Required=false)]
        public string DivideAlipayUserId { get; set; }

        // 分账支付宝登录账号
        [NameInMap("divide_alipay_login_id")]
        [Validation(Required=false)]
        public string DivideAlipayLoginId { get; set; }

        // 代偿支付宝账号uid
        [NameInMap("compensate_alipay_user_id")]
        [Validation(Required=false)]
        public string CompensateAlipayUserId { get; set; }

        // 代偿支付宝登录账号
        [NameInMap("compensate_alipay_login_id")]
        [Validation(Required=false)]
        public string CompensateAlipayLoginId { get; set; }

        // traceid
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

    }

}
