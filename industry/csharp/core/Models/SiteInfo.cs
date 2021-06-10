// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    // 站点信息
    public class SiteInfo : TeaModel {
        // 站点类型 网站-01 APP-02 服务窗-03 公众号-04 其他-05 支付宝小程序-06
        [NameInMap("site_type")]
        [Validation(Required=true)]
        public string SiteType { get; set; }

        // 站点名称
        [NameInMap("site_name")]
        [Validation(Required=false)]
        public string SiteName { get; set; }

        // 站点地址
        [NameInMap("site_url")]
        [Validation(Required=true)]
        public string SiteUrl { get; set; }

    }

}
