// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    public class VerifyApiListRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 3000
        [NameInMap("timeout")]
        [Validation(Required=true)]
        public string Timeout { get; set; }

        // 请求编号
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

        // 请求时间
        [NameInMap("time")]
        [Validation(Required=false)]
        public string Time { get; set; }

        // 请求描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

    }

}
