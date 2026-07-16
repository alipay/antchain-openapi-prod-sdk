// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 站点信息
    public class SiteInfo : TeaModel {
        // 小程序id
        /// <summary>
        /// <b>Example:</b>
        /// <para>123456789</para>
        /// </summary>
        [NameInMap("tiny_app_id")]
        [Validation(Required=false)]
        public string TinyAppId { get; set; }

        // 站点名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>站点名称</para>
        /// </summary>
        [NameInMap("site_name")]
        [Validation(Required=false)]
        public string SiteName { get; set; }

        // 
        // 截图照片
        /// <summary>
        /// <b>Example:</b>
        /// <para>c6c0c7a1-b9d5-4e5d-b9d4-9eed39f00e65.jpg</para>
        /// </summary>
        [NameInMap("screenshot_file")]
        [Validation(Required=false)]
        public FileInfo ScreenshotFile { get; set; }

        // 站点地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://open.alipay.com">https://open.alipay.com</a></para>
        /// </summary>
        [NameInMap("site_url")]
        [Validation(Required=false)]
        public string SiteUrl { get; set; }

        // 站点类型
        // 网站: 01
        // APP: 02
        // 服务窗: 03
        // 公众号: 04
        // 其他: 05
        // 支付宝小程序: 06
        // 手机网站/H5: 07
        /// <summary>
        /// <b>Example:</b>
        /// <para>02</para>
        /// </summary>
        [NameInMap("site_type")]
        [Validation(Required=false)]
        public string SiteType { get; set; }

    }

}
