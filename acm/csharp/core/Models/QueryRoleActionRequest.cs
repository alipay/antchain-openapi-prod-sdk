// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class QueryRoleActionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 系统来源
        [NameInMap("source_system")]
        [Validation(Required=true)]
        public string SourceSystem { get; set; }

        // 角色ID
        [NameInMap("role_id")]
        [Validation(Required=false)]
        public string RoleId { get; set; }

        // 角色名称，查询时和owner配套使用
        [NameInMap("role_name")]
        [Validation(Required=false)]
        public string RoleName { get; set; }

        // 角色所有者
        [NameInMap("role_owner")]
        [Validation(Required=false)]
        public string RoleOwner { get; set; }

    }

}
