// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class QueryDevelopTestUseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 入参1
        [NameInMap("stringparameter")]
        [Validation(Required=true)]
        public string Stringparameter { get; set; }

        // 数字入参
        [NameInMap("numberparameter")]
        [Validation(Required=true)]
        public long? Numberparameter { get; set; }

    }

}
