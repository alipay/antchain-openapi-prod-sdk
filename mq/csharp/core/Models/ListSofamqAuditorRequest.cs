// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ListSofamqAuditorRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 起始时间
        [NameInMap("closed_start")]
        [Validation(Required=false)]
        public long? ClosedStart { get; set; }

        // 结束时间戳
        [NameInMap("open_end")]
        [Validation(Required=false)]
        public long? OpenEnd { get; set; }

        // 模糊资源名
        [NameInMap("resource")]
        [Validation(Required=false)]
        public string Resource { get; set; }

    }

}
