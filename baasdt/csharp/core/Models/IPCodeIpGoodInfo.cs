// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // Ip正版码信息中Ip相关信息
    public class IPCodeIpGoodInfo : TeaModel {
        // IP名称
        [NameInMap("ip_name")]
        [Validation(Required=true)]
        public string IpName { get; set; }

        // IP描述
        [NameInMap("ip_description")]
        [Validation(Required=true)]
        public string IpDescription { get; set; }

        // IP主图oss地址
        [NameInMap("ip_img_url")]
        [Validation(Required=true)]
        public string IpImgUrl { get; set; }

        // IP主图，非oss地址，可直接访问的图片地址
        [NameInMap("ip_img_url_tmp")]
        [Validation(Required=false)]
        public string IpImgUrlTmp { get; set; }

    }

}
