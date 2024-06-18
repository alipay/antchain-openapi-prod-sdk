// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class QueryGatewayMyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 字符串类型入参
        [NameInMap("test_1")]
        [Validation(Required=true)]
        public string Test1 { get; set; }

        // 数字入参
        [NameInMap("test_2")]
        [Validation(Required=true)]
        public long? Test2 { get; set; }

        // 布尔值入参
        [NameInMap("test_3")]
        [Validation(Required=true)]
        public bool? Test3 { get; set; }

    }

}
