// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5bb1b66c4aab4cc998c05a36078e45c1.Models
{
    public class QuerySaasSecurityTscenterUmidqueryserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户token id
        [NameInMap("token_id")]
        [Validation(Required=true)]
        public string TokenId { get; set; }

        // 服务版本
        [NameInMap("service_version")]
        [Validation(Required=true)]
        public string ServiceVersion { get; set; }

        // 返回的umid
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
