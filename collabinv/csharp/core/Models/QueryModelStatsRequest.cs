// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class QueryModelStatsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // yyyyMMdd
        [NameInMap("invoke_day")]
        [Validation(Required=true)]
        public string InvokeDay { get; set; }

        // 类型：TENANT  租户；AK key维度
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
