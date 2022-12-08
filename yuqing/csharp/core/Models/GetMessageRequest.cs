// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    public class GetMessageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // team_hash_id
        [NameInMap("team_hash_id")]
        [Validation(Required=false)]
        public string TeamHashId { get; set; }

        // 文档唯一ID
        [NameInMap("doc_id")]
        [Validation(Required=true)]
        public string DocId { get; set; }

    }

}
