// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 日志存储类型
    public class TriggerLogDTOStructBody : TeaModel {
        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 修改时间
        [NameInMap("modify_time")]
        [Validation(Required=false)]
        public string ModifyTime { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // uuid
        [NameInMap("uuid")]
        [Validation(Required=false)]
        public string Uuid { get; set; }

        // 位置
        [NameInMap("position")]
        [Validation(Required=false)]
        public PositionStructBody Position { get; set; }

    }

}
