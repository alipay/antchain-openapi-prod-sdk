// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 授权策略
    public class AuthPolicy : TeaModel {
        // 授权能力Id
        [NameInMap("ability_id")]
        [Validation(Required=false)]
        public string AbilityId { get; set; }

        // 授权能力类型（ROLE：角色，ACTION：操作）
        [NameInMap("ability_type")]
        [Validation(Required=false)]
        public string AbilityType { get; set; }

        // 授权条件
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public List<Condition> Conditions { get; set; }

        // 创建时间，ISO8601格式
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 权限策略描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 授权策略ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 授权策略名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 授权条件
        [NameInMap("scope_entities")]
        [Validation(Required=false)]
        public List<ScopeEntity> ScopeEntities { get; set; }

        // 授权策略归属租户
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 授权策略类型（CUSTOM：自定义授权策略）
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 更新时间，ISO8601格式
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

    }

}
