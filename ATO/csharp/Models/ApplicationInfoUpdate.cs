// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 应用信息修改
    public class ApplicationInfoUpdate : TeaModel {
        // 应用场景 MINI_APP 小程序 APP 自有app ALL 两种都有
        /// <summary>
        /// <b>Example:</b>
        /// <para>ALL</para>
        /// </summary>
        [NameInMap("application_scene")]
        [Validation(Required=false)]
        public string ApplicationScene { get; set; }

        // 小程序id
        /// <summary>
        /// <b>Example:</b>
        /// <para>小程序id</para>
        /// </summary>
        [NameInMap("tiny_app_id")]
        [Validation(Required=false)]
        public string TinyAppId { get; set; }

        // 小程序名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx小程序</para>
        /// </summary>
        [NameInMap("site_name")]
        [Validation(Required=false)]
        public string SiteName { get; set; }

        // http://asdasas.com
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://asdasas.com">http://asdasas.com</a></para>
        /// </summary>
        [NameInMap("sit_url")]
        [Validation(Required=false)]
        public string SitUrl { get; set; }

        // 商户名称。 修改后的商户名称，将同步支付宝代扣签约页面字段展示
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx商户</para>
        /// </summary>
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 商户服务名称。 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx商户服务</para>
        /// </summary>
        [NameInMap("merchant_service_name")]
        [Validation(Required=false)]
        public string MerchantServiceName { get; set; }

        // 商户服务描述。 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx服务描述</para>
        /// </summary>
        [NameInMap("merchant_service_desc")]
        [Validation(Required=false)]
        public string MerchantServiceDesc { get; set; }

        // 站点信息
        [NameInMap("site_info")]
        [Validation(Required=false)]
        public List<SiteInfo> SiteInfo { get; set; }

    }

}
