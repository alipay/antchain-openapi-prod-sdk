// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    public class AddUniversalsaasDigitalhumanLlmModelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户编码
        [NameInMap("tenant_code")]
        [Validation(Required=true)]
        public string TenantCode { get; set; }

        // 模型名称
        [NameInMap("model_name")]
        [Validation(Required=true)]
        public string ModelName { get; set; }

        // 模型编码
        [NameInMap("model_code")]
        [Validation(Required=true)]
        public string ModelCode { get; set; }

        // 模型图片url
        [NameInMap("image_url")]
        [Validation(Required=false)]
        public string ImageUrl { get; set; }

        // 模型描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
