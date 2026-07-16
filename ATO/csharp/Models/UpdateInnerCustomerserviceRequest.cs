// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class UpdateInnerCustomerserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商家社会统一信用代码，间联模式必传
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 公司名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 处理类型:
        // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
        // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
        [NameInMap("process_type")]
        [Validation(Required=true)]
        public string ProcessType { get; set; }

        // 服务商名称（已废弃）
        [NameInMap("service_provider_name")]
        [Validation(Required=false)]
        public string ServiceProviderName { get; set; }

        // 客诉处理员支付宝绑定手机号（已废弃）
        [NameInMap("alipay_bind_mobile")]
        [Validation(Required=false)]
        public string AlipayBindMobile { get; set; }

        // 客诉处理员支付宝账号（已废弃）
        [NameInMap("alipay_logon_id")]
        [Validation(Required=false)]
        public string AlipayLogonId { get; set; }

        // 客服电话
        [NameInMap("customer_service_phone")]
        [Validation(Required=true)]
        public string CustomerServicePhone { get; set; }

        // 客服人员名称（已废弃）
        [NameInMap("customer_service_name")]
        [Validation(Required=false)]
        public string CustomerServiceName { get; set; }

        // 在线客服网址
        [NameInMap("online_support_site_url")]
        [Validation(Required=false)]
        public string OnlineSupportSiteUrl { get; set; }

        // 投诉问题
        [NameInMap("customer_complaint_issues")]
        [Validation(Required=false)]
        public string CustomerComplaintIssues { get; set; }

        // 客诉处理人员信息
        [NameInMap("customer_person_info_list")]
        [Validation(Required=false)]
        public List<CustomerPersonInfo> CustomerPersonInfoList { get; set; }

        // 进件类型 
        // DIRECT("DIRECT", "直连进件模式"), AGENT("AGENT", "代理商进件模式"),
        [NameInMap("expand_mode")]
        [Validation(Required=true)]
        public string ExpandMode { get; set; }

    }

}
