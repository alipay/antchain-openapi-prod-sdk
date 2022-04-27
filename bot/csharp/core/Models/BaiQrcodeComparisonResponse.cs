// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 二维码验真接口返回值
    public class BaiQrcodeComparisonResponse : TeaModel {
        // 返回的结果
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
