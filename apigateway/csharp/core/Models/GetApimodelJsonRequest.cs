// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    public class GetApimodelJsonRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // api_model_id
        [NameInMap("api_model_id")]
        [Validation(Required=true)]
        public string ApiModelId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // model_type
        [NameInMap("model_type")]
        [Validation(Required=false)]
        public string ModelType { get; set; }

        // 是否使用默认值
        [NameInMap("use_default")]
        [Validation(Required=false)]
        public bool? UseDefault { get; set; }

    }

}
