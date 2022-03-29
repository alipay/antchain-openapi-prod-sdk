// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // dms
    public class MsgQueryDO : TeaModel {
        // delivery_count
        [NameInMap("delivery_count")]
        [Validation(Required=false)]
        public long? DeliveryCount { get; set; }

        // eventcode
        [NameInMap("eventcode")]
        [Validation(Required=true)]
        public string Eventcode { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // gmt_last_delivery
        [NameInMap("gmt_last_delivery")]
        [Validation(Required=true)]
        public string GmtLastDelivery { get; set; }

        // gmt_next_delivery
        [NameInMap("gmt_next_delivery")]
        [Validation(Required=true)]
        public string GmtNextDelivery { get; set; }

        // message_id
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // publisher_group
        [NameInMap("publisher_group")]
        [Validation(Required=true)]
        public string PublisherGroup { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // transaction
        [NameInMap("transaction")]
        [Validation(Required=false)]
        public bool? Transaction { get; set; }

        // subscriber_group_delivery
        [NameInMap("subscriber_group_delivery")]
        [Validation(Required=false)]
        public string SubscriberGroupDelivery { get; set; }

        // subscriber_group_undelivery
        [NameInMap("subscriber_group_undelivery")]
        [Validation(Required=false)]
        public string SubscriberGroupUndelivery { get; set; }

    }

}
