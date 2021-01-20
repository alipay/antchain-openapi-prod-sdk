// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // NotificationReceiver
    public class NotificationReceiver : TeaModel {
        // config id
        [NameInMap("config_id")]
        [Validation(Required=false)]
        public string ConfigId { get; set; }

        // receiver
        [NameInMap("receiver")]
        [Validation(Required=false)]
        public string Receiver { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
