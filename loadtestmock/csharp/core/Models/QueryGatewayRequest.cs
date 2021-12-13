// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.LOADTESTMOCK.Models
{
    public class QueryGatewayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 接口返回耗时，单位是ms
        [NameInMap("time_limit")]
        [Validation(Required=true)]
        public long? TimeLimit { get; set; }

    }

}
