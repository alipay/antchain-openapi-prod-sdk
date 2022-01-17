// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // MonitoryRequest
    public class MonitoryRequest : TeaModel {
        // API标识
        [NameInMap("api_id")]
        [Validation(Required=false)]
        public string ApiId { get; set; }

        // App标识
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // code
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // end_time
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

    }

}
