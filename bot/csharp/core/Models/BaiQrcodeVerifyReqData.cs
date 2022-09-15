// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 溯源防伪码质检请求的请求数据
    public class BaiQrcodeVerifyReqData : TeaModel {
        // 二维码图片url
        [NameInMap("query_image_url")]
        [Validation(Required=true)]
        public string QueryImageUrl { get; set; }

    }

}
