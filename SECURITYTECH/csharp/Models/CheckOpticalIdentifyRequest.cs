// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class CheckOpticalIdentifyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // json数据，包含tenantId,sceneId,outBizId,fakeType,certType
        [NameInMap("reserved_data")]
        [Validation(Required=true)]
        public string ReservedData { get; set; }

        // 图片链接,image_url和image_content 2选1优先选择image_content
        [NameInMap("image_url")]
        [Validation(Required=false)]
        public string ImageUrl { get; set; }

        // base64编码的图片,image_url和image_content 2选1，优先选择image_content
        [NameInMap("image_content")]
        [Validation(Required=false)]
        public string ImageContent { get; set; }

        // raas产品码
        [NameInMap("raas_products")]
        [Validation(Required=true)]
        public string RaasProducts { get; set; }

    }

}
