// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // BAI提供的OCR接口返回值
    public class BaiOcrResponse : TeaModel {
        // 返回的结果体
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
