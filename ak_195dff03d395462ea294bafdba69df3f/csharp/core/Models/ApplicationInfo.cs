// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    // 应用信息
    public class ApplicationInfo : TeaModel {
        // 应用场景
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

        // 网站地址
        [NameInMap("sit_url")]
        [Validation(Required=true)]
        public string SitUrl { get; set; }

        // 商户名称
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // 商户服务名称
        [NameInMap("merchant_service_name")]
        [Validation(Required=true)]
        public string MerchantServiceName { get; set; }

        // 商户服务描述
        [NameInMap("merchant_service_desc")]
        [Validation(Required=true)]
        public string MerchantServiceDesc { get; set; }

    }

}
