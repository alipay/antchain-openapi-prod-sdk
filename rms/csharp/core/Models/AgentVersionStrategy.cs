// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // Agent版本策略
    public class AgentVersionStrategy : TeaModel {
        // agent 地址
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // agent 版本号
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 0 容器，1经典
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 0 生效，1失效
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // agent 版本内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 生效范围
        [NameInMap("scope")]
        [Validation(Required=true)]
        public string Scope { get; set; }

        // 生效范围的唯一标识
        [NameInMap("scope_identity")]
        [Validation(Required=true)]
        public string ScopeIdentity { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

    }

}
