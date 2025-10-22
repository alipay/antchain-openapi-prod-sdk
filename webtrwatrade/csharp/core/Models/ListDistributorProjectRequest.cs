// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class ListDistributorProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 开始时间 (时间戳)（毫秒）
        [NameInMap("start_time_mills")]
        [Validation(Required=false)]
        public long? StartTimeMills { get; set; }

        // 结束时间 (时间戳)（毫秒）
        [NameInMap("end_time_mills")]
        [Validation(Required=false)]
        public long? EndTimeMills { get; set; }

    }

}
