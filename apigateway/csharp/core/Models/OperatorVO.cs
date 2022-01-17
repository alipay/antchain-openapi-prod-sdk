// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 操作人
    public class OperatorVO : TeaModel {
        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 企业的唯一标识
        [NameInMap("customer")]
        [Validation(Required=false)]
        public string Customer { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 操作员ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 昵称
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 真实姓名
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // 操作员状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 租户
        [NameInMap("tenants")]
        [Validation(Required=false)]
        public List<string> Tenants { get; set; }

        // 操作员最近一次修改时间，ISO8601格式
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

        // 操作员工号
        [NameInMap("work_no")]
        [Validation(Required=false)]
        public string WorkNo { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
