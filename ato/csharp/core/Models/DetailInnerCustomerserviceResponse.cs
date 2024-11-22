// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class DetailInnerCustomerserviceResponse : TeaModel {
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

        // 公司社会统一信息代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 公司名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 处理类型: 商家处理;服务商代处理
        [NameInMap("process_type")]
        [Validation(Required=false)]
        public string ProcessType { get; set; }

        // 服务商名称
        [NameInMap("service_provider_name")]
        [Validation(Required=false)]
        public string ServiceProviderName { get; set; }

        // 客诉处理员支付宝绑定手机号
        [NameInMap("alipay_bind_mobile")]
        [Validation(Required=false)]
        public string AlipayBindMobile { get; set; }

        // 客诉处理员支付宝账号
        [NameInMap("alipay_logon_id")]
        [Validation(Required=false)]
        public string AlipayLogonId { get; set; }

        // 客服电话
        [NameInMap("customer_service_phone")]
        [Validation(Required=false)]
        public string CustomerServicePhone { get; set; }

        // 客服人员名称
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

    }

}
