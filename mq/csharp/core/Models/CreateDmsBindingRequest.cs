// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateDmsBindingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // appname
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // eventcode
        [NameInMap("eventcode")]
        [Validation(Required=true)]
        public string Eventcode { get; set; }

        // exchange_type
        [NameInMap("exchange_type")]
        [Validation(Required=true)]
        public string ExchangeType { get; set; }

        // expression
        [NameInMap("expression")]
        [Validation(Required=false)]
        public string Expression { get; set; }

        // groupid
        [NameInMap("group")]
        [Validation(Required=true)]
        public string Group { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // persistence
        [NameInMap("persistence")]
        [Validation(Required=true)]
        public bool? Persistence { get; set; }

        // topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

    }

}
