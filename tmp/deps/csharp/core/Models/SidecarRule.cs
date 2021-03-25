// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // sidecar规则
    public class SidecarRule : TeaModel {
        // sidecar规则描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 创建时间
        [NameInMap("gmt_created")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtCreated { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtModified { get; set; }

        // 版本实例名称
        [NameInMap("instance_name")]
        [Validation(Required=false)]
        public string InstanceName { get; set; }

        // 规则优先级
        [NameInMap("level")]
        [Validation(Required=false)]
        public long? Level { get; set; }

        // scope生效范围详情
        [NameInMap("scope_detail")]
        [Validation(Required=false)]
        public SidecarScopeDetail ScopeDetail { get; set; }

        // sidecar版本实例id
        [NameInMap("sidecar_version_instance_id")]
        [Validation(Required=false)]
        public string SidecarVersionInstanceId { get; set; }

        // 规则状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 发布、下线、废弃原因
        // 
        [NameInMap("status_reason")]
        [Validation(Required=false)]
        public string StatusReason { get; set; }

    }

}
