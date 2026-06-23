// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
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
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:zhangsan@alipay.com">zhangsan@alipay.com</a></para>
        /// </summary>
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 外部对接系统操作员id
        /// <summary>
        /// <b>Example:</b>
        /// <para>ding0000001</para>
        /// </summary>
        [NameInMap("external_id")]
        [Validation(Required=false)]
        public string ExternalId { get; set; }

        // 外部对接系统类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>DING_TALK</para>
        /// </summary>
        [NameInMap("external_system")]
        [Validation(Required=false)]
        public string ExternalSystem { get; set; }

        // 操作员ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>0000000001</para>
        /// </summary>
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
        [NameInMap("nickname")]
        [Validation(Required=false)]
        public string Nickname { get; set; }

        // 真实姓名
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // 部门唯一码
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("department_code")]
        [Validation(Required=false)]
        public string DepartmentCode { get; set; }

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

    }

}
