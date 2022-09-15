// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 溯源二维码生成请求的请求数据
    public class BaiQrcodeGenerateReqData : TeaModel {
        // 二维码的码值
        [NameInMap("qrcode_content")]
        [Validation(Required=true)]
        public string QrcodeContent { get; set; }

    }

}
