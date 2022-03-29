// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class UpdateMsgtypeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // description of message type
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // message type: eventcode
        [NameInMap("eventcode")]
        [Validation(Required=true)]
        public string Eventcode { get; set; }

        // middleware instance id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // tenant id
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // message type: topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // workspace id
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
