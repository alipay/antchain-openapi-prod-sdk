// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 应用信息
    public class ApplicationInfo : TeaModel {
        // 应用场景（payChannel =JDPAY仅支持MINI_APP）
        // MINI_APP 小程序
        // APP 自有app
        // ALL 两种都有
        [NameInMap("application_scene")]
        [Validation(Required=true)]
        public string ApplicationScene { get; set; }

        // 小程序id
        [NameInMap("tiny_app_id")]
        [Validation(Required=true)]
        public string TinyAppId { get; set; }

        // 小程序名称
        [NameInMap("site_name")]
        [Validation(Required=true)]
        public string SiteName { get; set; }

        // 网站地址（pay_channel=ALIPAY必填）
        [NameInMap("sit_url")]
        [Validation(Required=false)]
        public string SitUrl { get; set; }

        // 商户名称。（pay_channel=ALIPAY必填）
        // 修改后的商户名称，将同步支付宝代扣签约页面字段展示
        // 
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 商户服务名称。（pay_channel=ALIPAY必填）
        // 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
        [NameInMap("merchant_service_name")]
        [Validation(Required=false)]
        public string MerchantServiceName { get; set; }

        // 商户服务描述。（pay_channel=ALIPAY必填）
        // 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
        [NameInMap("merchant_service_desc")]
        [Validation(Required=false)]
        public string MerchantServiceDesc { get; set; }

        // 站点信息
        [NameInMap("site_info")]
        [Validation(Required=false)]
        public List<SiteInfo> SiteInfo { get; set; }

    }

}
