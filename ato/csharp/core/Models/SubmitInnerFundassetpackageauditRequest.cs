// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SubmitInnerFundassetpackageauditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资产包id
        [NameInMap("asset_package_id")]
        [Validation(Required=true)]
        public string AssetPackageId { get; set; }

        // AGREE 同意
        // SUPPLEMENT_MATERIAL 补充材料
        // REJECT 拒绝
        [NameInMap("audit_type")]
        [Validation(Required=true)]
        public string AuditType { get; set; }

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

        // 备注（小于200字符）
        // 审核通过不用填、
        // 审核不通过/补充材料必填，不允许传入特殊字符
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

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
