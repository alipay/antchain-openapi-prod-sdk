// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiTestParamVO
    public class ApiTestParamVO : TeaModel {
        // location
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // key
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
