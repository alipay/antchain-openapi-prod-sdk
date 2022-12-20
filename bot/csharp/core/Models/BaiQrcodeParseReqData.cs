// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 二维码识别请求
    public class BaiQrcodeParseReqData : TeaModel {
        // 待识别图片的url
        [NameInMap("image_url")]
        [Validation(Required=true)]
        public string ImageUrl { get; set; }

    }

}
