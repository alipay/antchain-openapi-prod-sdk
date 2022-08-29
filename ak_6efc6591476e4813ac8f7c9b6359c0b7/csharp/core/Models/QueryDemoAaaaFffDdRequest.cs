// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_6efc6591476e4813ac8f7c9b6359c0b7.Models
{
    public class QueryDemoAaaaFffDdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // xxx
        [NameInMap("xxx")]
        [Validation(Required=true)]
        public string Xxx { get; set; }

        // yyy
        [NameInMap("yyy")]
        [Validation(Required=true)]
        public string Yyy { get; set; }

    }

}
