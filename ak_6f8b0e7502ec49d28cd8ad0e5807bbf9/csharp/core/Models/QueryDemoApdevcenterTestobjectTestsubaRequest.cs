// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_6f8b0e7502ec49d28cd8ad0e5807bbf9.Models
{
    public class QueryDemoApdevcenterTestobjectTestsubaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 主键
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=521)]
        public string Name { get; set; }

        // test
        [NameInMap("test")]
        [Validation(Required=true)]
        public string Test { get; set; }

    }

}
