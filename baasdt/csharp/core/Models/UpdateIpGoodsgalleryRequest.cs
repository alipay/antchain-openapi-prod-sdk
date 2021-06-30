// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UpdateIpGoodsgalleryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 版权方链上账户ID
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // ip链上id
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // IP图库链接，一个压缩包
        [NameInMap("ip_gallery_url")]
        [Validation(Required=true)]
        public string IpGalleryUrl { get; set; }

    }

}
