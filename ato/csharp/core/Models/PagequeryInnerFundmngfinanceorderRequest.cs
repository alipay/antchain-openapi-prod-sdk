// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class PagequeryInnerFundmngfinanceorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方租户id
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 资产包id
        [NameInMap("asset_package_id")]
        [Validation(Required=false)]
        public string AssetPackageId { get; set; }

        // 合同id
        [NameInMap("sign_no")]
        [Validation(Required=false)]
        public string SignNo { get; set; }

        // 商家公司名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 商家社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 融资申请开始时间
        [NameInMap("finance_apply_time_start")]
        [Validation(Required=false)]
        public string FinanceApplyTimeStart { get; set; }

        // 融资申请结束时间
        [NameInMap("finance_apply_time_end")]
        [Validation(Required=false)]
        public string FinanceApplyTimeEnd { get; set; }

        // 放款状态
        [NameInMap("loan_status")]
        [Validation(Required=false)]
        public string LoanStatus { get; set; }

        // 资方公司名称
        [NameInMap("fund_name")]
        [Validation(Required=false)]
        public string FundName { get; set; }

        // 是否查询资方放款申请失败订单
        [NameInMap("is_loan_apply_fail")]
        [Validation(Required=false)]
        public bool? IsLoanApplyFail { get; set; }

        // 融资模式
        // 供应链金融:
        // SUPPLY_CHAIN_FINANCE
        // 自定义还款:
        // DEFAULT
        [NameInMap("fund_mode")]
        [Validation(Required=false)]
        public string FundMode { get; set; }

        // 页面调用traceid
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        //  分页
        [NameInMap("page_info")]
        [Validation(Required=true)]
        public PageQuery PageInfo { get; set; }

    }

}
