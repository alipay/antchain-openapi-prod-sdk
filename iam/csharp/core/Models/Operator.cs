// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 操作员
    public class Operator : TeaModel {
        // 操作员创建时间，ISO8601格式
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 操作员所在的企业
        [NameInMap("customer")]
        [Validation(Required=false)]
        public string Customer { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 外部对接系统操作员id
        [NameInMap("external_id")]
        [Validation(Required=false)]
        public string ExternalId { get; set; }

        // 外部对接系统类型
        [NameInMap("external_system")]
        [Validation(Required=false)]
        public string ExternalSystem { get; set; }

        // 操作员ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 是否是主账号
        [NameInMap("is_master")]
        [Validation(Required=false)]
        public bool? IsMaster { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 昵称
        [NameInMap("nickname")]
        [Validation(Required=false)]
        public string Nickname { get; set; }

        // 真实姓名
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 操作员加入的租户列表
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

        // 部门唯一码
        [NameInMap("department_code")]
        [Validation(Required=false)]
        public string DepartmentCode { get; set; }

        // 最近一次登录时间，为空则代表没有登录过，ISO8601格式，
        [NameInMap("last_login_time")]
        [Validation(Required=false)]
        public string LastLoginTime { get; set; }

    }

}
