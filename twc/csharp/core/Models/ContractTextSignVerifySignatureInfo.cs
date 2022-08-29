// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 文本签签名信息
    public class ContractTextSignVerifySignatureInfo : TeaModel {
        // 是否被篡改
        [NameInMap("is_modify")]
        [Validation(Required=false)]
        public bool? IsModify { get; set; }

    }

}
