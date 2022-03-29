// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QueryBindingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // application name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // count value
        [NameInMap("count")]
        [Validation(Required=false)]
        public int? Count { get; set; }

        // message type: eventcode
        [NameInMap("eventcode")]
        [Validation(Required=false)]
        public string Eventcode { get; set; }

        // group of subscriber
        [NameInMap("group")]
        [Validation(Required=false)]
        public string Group { get; set; }

        // middleware instance id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // offset value
        [NameInMap("offset")]
        [Validation(Required=false)]
        public int? Offset { get; set; }

        // tenant id
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // message type: topic
        [NameInMap("topic")]
        [Validation(Required=false)]
        public string Topic { get; set; }

        // workspace id
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

        // zone info
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

    }

}
