// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // MsgTypeDTO
    public class MsgTypeDTO : TeaModel {
        // topic name
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
