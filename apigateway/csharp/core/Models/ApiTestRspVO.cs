// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiTestRspVO
    public class ApiTestRspVO : TeaModel {
        // code
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // cost
        [NameInMap("cost")]
        [Validation(Required=false)]
        public long? Cost { get; set; }

        // size
        [NameInMap("size")]
        [Validation(Required=false)]
        public long? Size { get; set; }

        // payload
        [NameInMap("payload")]
        [Validation(Required=false)]
        public string Payload { get; set; }

        // headers
        [NameInMap("headers")]
        [Validation(Required=false)]
        public List<ApiTestParamVO> Headers { get; set; }

    }

}
