// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 托管数据库ManagedMQDTO结构体
    public class ManagedMQDTOStructBody : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 实例
        [NameInMap("instance")]
        [Validation(Required=false)]
        public string Instance { get; set; }

        // 主题
        [NameInMap("topic")]
        [Validation(Required=false)]
        public string Topic { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
