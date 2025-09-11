// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    public class ListAntdigitalWebtrwatradeDistributorOperationlogRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 开始时间 (时间戳)
        [NameInMap("start_time_mills")]
        [Validation(Required=true)]
        public long? StartTimeMills { get; set; }

        // 结束时间 (时间戳)
        [NameInMap("end_time_mills")]
        [Validation(Required=true)]
        public long? EndTimeMills { get; set; }

    }

}
