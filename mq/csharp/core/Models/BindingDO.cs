// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // bind
    public class BindingDO : TeaModel {
        // app_name
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

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

        // group
        [NameInMap("group")]
        [Validation(Required=true)]
        public string Group { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

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
