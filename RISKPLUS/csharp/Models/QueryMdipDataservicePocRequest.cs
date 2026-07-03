// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryMdipDataservicePocRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 服务编码
        // 
        [NameInMap("service_code")]
        [Validation(Required=true)]
        public string ServiceCode { get; set; }

        // 服务参数
        [NameInMap("service_param")]
        [Validation(Required=true)]
        public string ServiceParam { get; set; }

    }

}
