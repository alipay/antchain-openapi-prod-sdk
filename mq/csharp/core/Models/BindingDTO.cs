// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 订阅关系DTO
    public class BindingDTO : TeaModel {
        // app_name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // group
        [NameInMap("group")]
        [Validation(Required=true)]
        public string Group { get; set; }

        // topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

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

        // persistence
        [NameInMap("persistence")]
        [Validation(Required=true)]
        public bool? Persistence { get; set; }

    }

}
