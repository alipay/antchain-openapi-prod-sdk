// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.UNICONTACT.Models
{
    public class ImportInitUploadRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要刷新的key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 需要刷新的value，可能是json格式
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
