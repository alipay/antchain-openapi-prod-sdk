// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ABC.Models
{
    public class QueryGongxiangTesttestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 验证
        [NameInMap("character1")]
        [Validation(Required=true)]
        public string Character1 { get; set; }

        // 用于验证
        [NameInMap("character2")]
        [Validation(Required=true)]
        public long? Character2 { get; set; }

    }

}
