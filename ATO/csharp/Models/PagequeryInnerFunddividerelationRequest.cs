// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class PagequeryInnerFunddividerelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户8位id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 分页查询对象
        [NameInMap("page_info")]
        [Validation(Required=true)]
        public PageQuery PageInfo { get; set; }

        // 被分账方商户公司社会统一信用代码
        [NameInMap("subject_merchant_id")]
        [Validation(Required=false)]
        public string SubjectMerchantId { get; set; }

        // 被分账方商户公司名称
        [NameInMap("subject_company_name")]
        [Validation(Required=false)]
        public string SubjectCompanyName { get; set; }

        // 状态
        // NIT:待提交 
        // AUDIT:审批中 AUDIT_PASSED:审批通过
        // AUDIT_NOT_PASSED:审批不通过
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 支付渠道
        // ALIPAY
        // JDPAY
        [NameInMap("pay_channel")]
        [Validation(Required=false)]
        public string PayChannel { get; set; }

        // traceid
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

        // 分账方公司名称
        [NameInMap("company_name")]
        [Validation(Required=false)]
        public string CompanyName { get; set; }

        // 分账方公司社会统一代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

    }

}
