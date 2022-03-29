// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 告警日志
    public class WarnLogDTO : TeaModel {
        // 单元名称
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // Group ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 报警 ID
        [NameInMap("warn_id")]
        [Validation(Required=true)]
        public long? WarnId { get; set; }

        // 报警信息
        [NameInMap("warn_info")]
        [Validation(Required=true)]
        public string WarnInfo { get; set; }

    }

}
