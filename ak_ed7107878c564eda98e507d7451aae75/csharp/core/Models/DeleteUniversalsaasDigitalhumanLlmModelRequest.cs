// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    public class DeleteUniversalsaasDigitalhumanLlmModelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 模型编码
        [NameInMap("tenant_code")]
        [Validation(Required=true)]
        public string TenantCode { get; set; }

        // 模型id
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

    }

}
