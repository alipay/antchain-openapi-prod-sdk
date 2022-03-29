// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // topic
    public class Binding : TeaModel {
        // appName
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // creation_time
        [NameInMap("creation_time")]
        [Validation(Required=false)]
        public string CreationTime { get; set; }

        // eventcode
        [NameInMap("eventcode")]
        [Validation(Required=false)]
        public string Eventcode { get; set; }

        // exchangeType
        [NameInMap("exchange_type")]
        [Validation(Required=false)]
        public string ExchangeType { get; set; }

        // expression
        [NameInMap("expression")]
        [Validation(Required=false)]
        public string Expression { get; set; }

        // group
        [NameInMap("group")]
        [Validation(Required=false)]
        public string Group { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // persistence
        [NameInMap("persistence")]
        [Validation(Required=false)]
        public bool? Persistence { get; set; }

        // topic
        [NameInMap("topic")]
        [Validation(Required=false)]
        public string Topic { get; set; }

        // update_time
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

    }

}
