// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class InitGatewayRoadRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求时间
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 请求编号
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // 请求描述
        [NameInMap("desc")]
        [Validation(Required=false, MaxLength=15)]
        public string Desc { get; set; }

    }

}
