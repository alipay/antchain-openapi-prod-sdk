// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class GetSofamqSchemaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // instance id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // sofamq的topic名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // schema的版本号
        [NameInMap("schema_version")]
        [Validation(Required=true)]
        public long? SchemaVersion { get; set; }

    }

}
