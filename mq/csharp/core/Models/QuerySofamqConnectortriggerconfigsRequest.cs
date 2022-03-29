// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QuerySofamqConnectortriggerconfigsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // source类型
        [NameInMap("source_type")]
        [Validation(Required=true)]
        public string SourceType { get; set; }

        // sink类型
        [NameInMap("sink_type")]
        [Validation(Required=true)]
        public string SinkType { get; set; }

    }

}
