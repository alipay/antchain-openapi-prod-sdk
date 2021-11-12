// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 自动化测试的节点日志
    public class AutoTestLog : TeaModel {
        // 日志id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 日志内容
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 节点执行的动作
        [NameInMap("node_action")]
        [Validation(Required=true)]
        public string NodeAction { get; set; }

        // 节点id
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 节点所处的阶段
        [NameInMap("stage")]
        [Validation(Required=true)]
        public string Stage { get; set; }

        // 创建时间
        [NameInMap("utc_create")]
        [Validation(Required=true)]
        public string UtcCreate { get; set; }

        // 修改时间
        [NameInMap("utc_modified")]
        [Validation(Required=true)]
        public string UtcModified { get; set; }

    }

}
