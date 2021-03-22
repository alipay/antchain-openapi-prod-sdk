// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 代理授权关系信息
    public class DelegateRelationInfo : TeaModel {
        // 被授权的租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 被代理的租户ID
        [NameInMap("delegated_tenant_id")]
        [Validation(Required=true)]
        public string DelegatedTenantId { get; set; }

        // 更新时间
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public string UpdateTime { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public bool? Status { get; set; }

        // 扩展字段
        [NameInMap("extension")]
        [Validation(Required=true)]
        public string Extension { get; set; }

    }

}
