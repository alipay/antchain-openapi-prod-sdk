// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class UpdateBindingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // application name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // message type: eventcode
        [NameInMap("eventcode")]
        [Validation(Required=true)]
        public string Eventcode { get; set; }

        // binding: exchangeType, "DIRECT" or "HEADER"
        [NameInMap("exchange_type")]
        [Validation(Required=true)]
        public string ExchangeType { get; set; }

        // binding: expression
        [NameInMap("expression")]
        [Validation(Required=false)]
        public string Expression { get; set; }

        // group of subscriber
        [NameInMap("group")]
        [Validation(Required=true)]
        public string Group { get; set; }

        // middleware instance id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // binding: expression
        [NameInMap("persistence")]
        [Validation(Required=true)]
        public bool? Persistence { get; set; }

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

        // zone info
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

        // zone mode
        [NameInMap("zone_mode")]
        [Validation(Required=false)]
        public string ZoneMode { get; set; }

    }

}
