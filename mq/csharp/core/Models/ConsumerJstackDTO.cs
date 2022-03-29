// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 消费端堆栈信息
    public class ConsumerJstackDTO : TeaModel {
        // 消费端 Client ID
        [NameInMap("client_id")]
        [Validation(Required=true)]
        public string ClientId { get; set; }

        // Jstack 堆栈信息
        [NameInMap("jstack")]
        [Validation(Required=true)]
        public List<ThreadTrackDTO> Jstack { get; set; }

    }

}
