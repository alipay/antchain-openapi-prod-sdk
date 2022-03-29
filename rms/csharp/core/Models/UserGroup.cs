// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 用户组
    public class UserGroup : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 通知组名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 最后修改人
        [NameInMap("modifier")]
        [Validation(Required=true)]
        public string Modifier { get; set; }

        // 最后修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 用户组关联关系
        [NameInMap("relations")]
        [Validation(Required=true)]
        public List<UserGroupRelation> Relations { get; set; }

        // 全局订阅
        [NameInMap("scope_global")]
        [Validation(Required=false)]
        public bool? ScopeGlobal { get; set; }

        // 0、当前workspace有效；
        // 1、租户有效；
        [NameInMap("valid_scope")]
        [Validation(Required=false)]
        public long? ValidScope { get; set; }

        // 当前用户组的告警规则定阅数量
        [NameInMap("subscribe_count")]
        [Validation(Required=false)]
        public long? SubscribeCount { get; set; }

    }

}
