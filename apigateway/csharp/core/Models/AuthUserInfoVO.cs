// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // AuthUserInfoVO
    public class AuthUserInfoVO : TeaModel {
        // api分组标识符
        [NameInMap("api_group_id")]
        [Validation(Required=false)]
        public string ApiGroupId { get; set; }

        // api标识符
        [NameInMap("api_id")]
        [Validation(Required=false)]
        public string ApiId { get; set; }

        // 授权状态
        [NameInMap("auth_status")]
        [Validation(Required=false)]
        public string AuthStatus { get; set; }

        // 授权用户唯一标识
        [NameInMap("auth_user_id")]
        [Validation(Required=false)]
        public string AuthUserId { get; set; }

        // 企业的唯一标识
        [NameInMap("customer")]
        [Validation(Required=false)]
        public string Customer { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 创建日期
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

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

        // operator
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 真实性名
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // 操作员状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 用户标识
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // workspace id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 工号
        [NameInMap("work_no")]
        [Validation(Required=false)]
        public string WorkNo { get; set; }

        // 能否操作授权
        [NameInMap("can_auth")]
        [Validation(Required=false)]
        public bool? CanAuth { get; set; }

    }

}
