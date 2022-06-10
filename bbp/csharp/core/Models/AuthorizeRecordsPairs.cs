// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    // 授权列表键值对
    public class AuthorizeRecordsPairs : TeaModel {
        // 授权业务
        [NameInMap("auth_business_code")]
        [Validation(Required=true)]
        public string AuthBusinessCode { get; set; }

        // 授权密钥
        [NameInMap("auth_business_secret")]
        [Validation(Required=true)]
        public string AuthBusinessSecret { get; set; }

    }

}
