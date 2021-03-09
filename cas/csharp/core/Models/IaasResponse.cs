// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // IaasResponse
    public class IaasResponse : TeaModel {
        // response_body
        [NameInMap("response_body")]
        [Validation(Required=false)]
        public string ResponseBody { get; set; }

        // response_headers
        [NameInMap("response_headers")]
        [Validation(Required=false)]
        public List<MapStringToStringEntity> ResponseHeaders { get; set; }

    }

}
