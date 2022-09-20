// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class DeletePersonRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 机构ID(第三方指定ID 50字符)
        [NameInMap("org_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrgId { get; set; }

        // 项目角色ID(1项目管理员、2项目执行人、3项目财务)
        [NameInMap("role_id")]
        [Validation(Required=true)]
        public long? RoleId { get; set; }

        // 项目ID(第三方指定ID 50字符)
        [NameInMap("pj_id")]
        [Validation(Required=true, MaxLength=50)]
        public string PjId { get; set; }

        // 被授权人支付宝用户标识（16字符）
        [NameInMap("alipay_user_id")]
        [Validation(Required=true)]
        public string AlipayUserId { get; set; }

    }

}
