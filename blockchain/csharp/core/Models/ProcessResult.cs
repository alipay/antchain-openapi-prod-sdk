// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 授权流程操作结果
    public class ProcessResult : TeaModel {
        // 申请权限的扩展参数
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 申请权限原因
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 下一个处理节点ID
        [NameInMap("next")]
        [Validation(Required=false)]
        public string Next { get; set; }

        // 流程ID
        [NameInMap("process_id")]
        [Validation(Required=true)]
        public string ProcessId { get; set; }

        // 流程状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 数据对象ID
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

    }

}
