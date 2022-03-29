// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class AddDmsMsgtypeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // eventcode
        [NameInMap("eventcode")]
        [Validation(Required=true)]
        public string Eventcode { get; set; }

        // desc
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

    }

}
