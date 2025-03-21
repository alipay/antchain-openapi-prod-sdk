// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class QueryModelFusionmodelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 融合模型编码
        [NameInMap("fusion_model_code")]
        [Validation(Required=true)]
        public string FusionModelCode { get; set; }

        // 模型调用的id，一般是用户id 可能是用户手机号或者身份照号码的md5
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

    }

}
