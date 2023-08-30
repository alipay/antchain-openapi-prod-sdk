// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class QueryCjtestCjResRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 1
        [NameInMap("test1")]
        [Validation(Required=true)]
        public long? Test1 { get; set; }

        // 2
        [NameInMap("test2")]
        [Validation(Required=true)]
        public long? Test2 { get; set; }

        // test
        [NameInMap("test3")]
        [Validation(Required=true)]
        public List<long?> Test3 { get; set; }

        // testclass
        [NameInMap("testclass")]
        [Validation(Required=true)]
        public Host Testclass { get; set; }

    }

}
