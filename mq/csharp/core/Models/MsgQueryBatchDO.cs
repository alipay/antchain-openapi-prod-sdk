// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // msgbatch
    public class MsgQueryBatchDO : TeaModel {
        // eventcode
        [NameInMap("eventcode")]
        [Validation(Required=true)]
        public string Eventcode { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // message_id
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // subscriber_group_undelivery
        [NameInMap("subscriber_group_undelivery")]
        [Validation(Required=false)]
        public string SubscriberGroupUndelivery { get; set; }

    }

}
