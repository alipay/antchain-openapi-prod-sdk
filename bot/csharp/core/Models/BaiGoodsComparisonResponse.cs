// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 商品鉴定返回结果
    public class BaiGoodsComparisonResponse : TeaModel {
        // 鉴定结果（REAL：为真   FAKE：为假   UNABLE_IDENTIFY：无法鉴定）
        [NameInMap("identification_result")]
        [Validation(Required=true)]
        public string IdentificationResult { get; set; }

        // 鉴定补充信息
        [NameInMap("identification_message")]
        [Validation(Required=false)]
        public string IdentificationMessage { get; set; }

        // 鉴定信息code
        [NameInMap("identification_code")]
        [Validation(Required=false)]
        public string IdentificationCode { get; set; }

    }

}
