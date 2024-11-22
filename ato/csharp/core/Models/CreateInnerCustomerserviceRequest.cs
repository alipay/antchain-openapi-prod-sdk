// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateInnerCustomerserviceRequest : TeaModel {
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

        // 公司社会统一信息代码,间联模式必传
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 公司名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 处理类型:
        // 商家处理
        // 服务商代处理
        [NameInMap("process_type")]
        [Validation(Required=true)]
        public string ProcessType { get; set; }

        // 服务商名称
        [NameInMap("service_provider_name")]
        [Validation(Required=false)]
        public string ServiceProviderName { get; set; }

        // 客诉处理员支付宝绑定手机号
        [NameInMap("alipay_bind_mobile")]
        [Validation(Required=true)]
        public string AlipayBindMobile { get; set; }

        // 客诉处理员支付宝账号
        [NameInMap("alipay_logon_id")]
        [Validation(Required=true)]
        public string AlipayLogonId { get; set; }

        // 客服电话
        [NameInMap("customer_service_phone")]
        [Validation(Required=true)]
        public string CustomerServicePhone { get; set; }

        // 客服人员名称
        [NameInMap("customer_service_name")]
        [Validation(Required=true)]
        public string CustomerServiceName { get; set; }

        // 在线客服网址
        [NameInMap("online_support_site_url")]
        [Validation(Required=true)]
        public string OnlineSupportSiteUrl { get; set; }

        // 投诉问题
        [NameInMap("customer_complaint_issues")]
        [Validation(Required=true)]
        public string CustomerComplaintIssues { get; set; }

        // 进件类型
        // DIRECT("DIRECT", "直连进件模式"),
        // AGENT("AGENT", "代理商进件模式"),
        [NameInMap("expand_mode")]
        [Validation(Required=true)]
        public string ExpandMode { get; set; }

    }

}
