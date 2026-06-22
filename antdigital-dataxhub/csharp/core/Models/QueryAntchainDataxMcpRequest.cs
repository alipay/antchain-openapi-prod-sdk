// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DATAXHUB.Models
{
    public class QueryAntchainDataxMcpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // toolId
        [NameInMap("tool_id")]
        [Validation(Required=true)]
        public string ToolId { get; set; }

        // 统一入参
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

    }

}
