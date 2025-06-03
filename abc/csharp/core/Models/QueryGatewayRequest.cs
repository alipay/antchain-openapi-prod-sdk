// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ABC.Models
{
    public class QueryGatewayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询输入
        // 
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 结构体参数
        [NameInMap("param")]
        [Validation(Required=true)]
        public AbcDemoStruct Param { get; set; }

    }

}
