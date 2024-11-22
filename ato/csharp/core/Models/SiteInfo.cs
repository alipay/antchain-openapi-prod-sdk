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
        [NameInMap("tiny_app_id")]
        [Validation(Required=false)]
        public string TinyAppId { get; set; }

        // 站点名称
        [NameInMap("site_name")]
        [Validation(Required=false)]
        public string SiteName { get; set; }

        // 
        // 截图照片
        [NameInMap("screenshot_file")]
        [Validation(Required=false)]
        public FileInfo ScreenshotFile { get; set; }

        // 站点地址
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
        [NameInMap("site_type")]
        [Validation(Required=false)]
        public string SiteType { get; set; }

    }

}
