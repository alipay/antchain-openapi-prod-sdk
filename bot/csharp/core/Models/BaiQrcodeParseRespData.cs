// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 二维码识别响应结构体
    public class BaiQrcodeParseRespData : TeaModel {
        // 二维码内容
        [NameInMap("code_value")]
        [Validation(Required=true)]
        public List<string> CodeValue { get; set; }

    }

}
