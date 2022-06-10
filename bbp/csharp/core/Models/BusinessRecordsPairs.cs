// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    // 业务授权列表键值对
    public class BusinessRecordsPairs : TeaModel {
        // 业务编码
        [NameInMap("business_code")]
        [Validation(Required=true)]
        public string BusinessCode { get; set; }

        // 业务公钥
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

    }

}
