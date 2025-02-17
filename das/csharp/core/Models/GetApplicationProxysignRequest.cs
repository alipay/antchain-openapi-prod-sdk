// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class GetApplicationProxysignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 代签名相关参数
        [NameInMap("sign_params")]
        [Validation(Required=true)]
        public string SignParams { get; set; }

        // 对应的服务id
        [NameInMap("data_set_id")]
        [Validation(Required=false)]
        public string DataSetId { get; set; }

    }

}
