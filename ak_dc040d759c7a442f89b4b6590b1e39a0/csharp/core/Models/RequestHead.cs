// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_dc040d759c7a442f89b4b6590b1e39a0.Models
{
    // eKYT请求头
    public class RequestHead : TeaModel {
        // 请求唯一标识
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 客户身份标识ID
        [NameInMap("secret_id")]
        [Validation(Required=true)]
        public string SecretId { get; set; }

        // 客户签约产品code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

    }

}
