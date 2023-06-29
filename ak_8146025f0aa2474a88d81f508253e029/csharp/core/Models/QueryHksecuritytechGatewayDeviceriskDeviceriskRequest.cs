// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_8146025f0aa2474a88d81f508253e029.Models
{
    public class QueryHksecuritytechGatewayDeviceriskDeviceriskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // apdid_token
        [NameInMap("apdid_token")]
        [Validation(Required=true)]
        public string ApdidToken { get; set; }

        // client_id
        [NameInMap("client_id")]
        [Validation(Required=false)]
        public string ClientId { get; set; }

        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // env_id
        [NameInMap("env_id")]
        [Validation(Required=false)]
        public string EnvId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // merchant_id
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

    }

}
