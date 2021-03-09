// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // IaasRequest
    public class IaasRequest : TeaModel {
        // requestMethod
        [NameInMap("request_method")]
        [Validation(Required=false)]
        public string RequestMethod { get; set; }

        // requestUrl
        [NameInMap("request_url")]
        [Validation(Required=false)]
        public string RequestUrl { get; set; }

        // requestBody
        [NameInMap("request_body")]
        [Validation(Required=false)]
        public string RequestBody { get; set; }

        // request_headers
        [NameInMap("request_headers")]
        [Validation(Required=false)]
        public List<MapStringToStringEntity> RequestHeaders { get; set; }

    }

}
