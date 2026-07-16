// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class PagequeryInnerFundassetpackageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资产包id
        [NameInMap("asset_package_id")]
        [Validation(Required=false)]
        public string AssetPackageId { get; set; }

        // 商家公司名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 融资申请时间开始
        [NameInMap("finance_apply_time_start")]
        [Validation(Required=false)]
        public string FinanceApplyTimeStart { get; set; }

        // 融资申请时间结束
        [NameInMap("finance_apply_time_end")]
        [Validation(Required=false)]
        public string FinanceApplyTimeEnd { get; set; }

        // 放款状态
        [NameInMap("finance_apply_status")]
        [Validation(Required=false)]
        public string FinanceApplyStatus { get; set; }

        // 分页信息
        [NameInMap("page_info")]
        [Validation(Required=true)]
        public PageQuery PageInfo { get; set; }

        // traceId
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 资方租户id
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

    }

}
