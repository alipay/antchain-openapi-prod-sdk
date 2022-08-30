// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2fdfc04b2afb4da9ac403531af8942a9.Models
{
    public class QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 123
        [NameInMap("security_uniform_request")]
        [Validation(Required=true)]
        public SecurityUniformRequest SecurityUniformRequest { get; set; }

        // 123
        [NameInMap("service_version")]
        [Validation(Required=true)]
        public string ServiceVersion { get; set; }

    }

}
