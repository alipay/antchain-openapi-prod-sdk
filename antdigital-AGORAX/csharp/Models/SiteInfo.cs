// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 商户站点信息（网站/APP/小程序）
    public class SiteInfo : TeaModel {
        // 网站类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>06</para>
        /// </summary>
        [NameInMap("site_type")]
        [Validation(Required=true)]
        public string SiteType { get; set; }

        // 站点地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://open.alipay.com">https://open.alipay.com</a></para>
        /// </summary>
        [NameInMap("site_url")]
        [Validation(Required=true)]
        public string SiteUrl { get; set; }

        // 站点名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX网站</para>
        /// </summary>
        [NameInMap("site_name")]
        [Validation(Required=true)]
        public string SiteName { get; set; }

        // 小程序 appId
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021004105652035</para>
        /// </summary>
        [NameInMap("tiny_app_id")]
        [Validation(Required=true)]
        public string TinyAppId { get; set; }

    }

}
