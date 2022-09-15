// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 商品鉴定点鉴定响应体
    public class BaiGoodsPointQueryRespData : TeaModel {
        // 识别结果
        // true：识别到鉴定点
        // false：未识别到鉴定点
        [NameInMap("detection")]
        [Validation(Required=true)]
        public bool? Detection { get; set; }

        // 鉴定结果
        // REAL：鉴定为真
        // FAKE：鉴定为假
        // UNABLE_IDENTIFY：无法鉴定
        [NameInMap("identification_result")]
        [Validation(Required=true)]
        public string IdentificationResult { get; set; }

    }

}
