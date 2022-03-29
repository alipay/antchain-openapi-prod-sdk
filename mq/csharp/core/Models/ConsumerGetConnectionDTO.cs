// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 指定 Group ID 的连接信息
    public class ConsumerGetConnectionDTO : TeaModel {
        // 指定 Group ID 的连接信息
        // 
        // 
        [NameInMap("connection_list")]
        [Validation(Required=true)]
        public List<ConnectionDTO> ConnectionList { get; set; }

    }

}
