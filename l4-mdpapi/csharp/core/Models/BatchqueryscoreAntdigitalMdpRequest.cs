// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MDPAPI.Models
{
    public class BatchqueryscoreAntdigitalMdpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 模型 id，和具体场景相关
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // 用户 id 的类型，比如 mobile 或者 device
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

    }

}
