// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_8146025f0aa2474a88d81f508253e029.Models
{
    public class SubmitHksecuritytechGatewayDeviceriskReportRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // request_data
        [NameInMap("request_data")]
        [Validation(Required=true)]
        public string RequestData { get; set; }

        // result
        [NameInMap("result")]
        [Validation(Required=true)]
        public DeviceRiskReportResult Result { get; set; }

    }

}
