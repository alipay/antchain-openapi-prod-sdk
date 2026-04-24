// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class UpdateInnerFundassetpackagefinanceplanRequest : TeaModel {
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

        // 资产包id
        [NameInMap("asset_package_id")]
        [Validation(Required=true)]
        public string AssetPackageId { get; set; }

        // 资方社会统一信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商户社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 资金方案版本号
        [NameInMap("finance_plan_version")]
        [Validation(Required=true)]
        public long? FinancePlanVersion { get; set; }

        // 用户输入内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // traceId
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 资金方案内容
        [NameInMap("asset_package_finance_plan")]
        [Validation(Required=true)]
        public AssetPackageFinancePlan AssetPackageFinancePlan { get; set; }

    }

}
