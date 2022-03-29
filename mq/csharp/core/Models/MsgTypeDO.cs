// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // msgtype
    public class MsgTypeDO : TeaModel {
        // desc
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // eventcode
        [NameInMap("eventcode")]
        [Validation(Required=true)]
        public string Eventcode { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

    }

}
