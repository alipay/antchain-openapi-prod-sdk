// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerFundassetpackagerepaymentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方租户ID
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

        // 资产包ID
        [NameInMap("asset_package_id")]
        [Validation(Required=false)]
        public string AssetPackageId { get; set; }

        // 商户名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 放款起始时间
        [NameInMap("loan_time_start")]
        [Validation(Required=false)]
        public string LoanTimeStart { get; set; }

        // 放款结束时间
        [NameInMap("loan_time_end")]
        [Validation(Required=false)]
        public string LoanTimeEnd { get; set; }

        // 还款状态
        [NameInMap("repayment_status")]
        [Validation(Required=false)]
        public string RepaymentStatus { get; set; }

        // 分页信息
        [NameInMap("page_info")]
        [Validation(Required=true)]
        public PageQuery PageInfo { get; set; }

        // traceId
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

    }

}
