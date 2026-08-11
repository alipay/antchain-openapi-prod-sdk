// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class CreateOperatorRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 企业唯一标识
        [NameInMap("customer")]
        [Validation(Required=false)]
        public string Customer { get; set; }

        // 外部对接系统操作员ID
        [NameInMap("external_id")]
        [Validation(Required=false)]
        public string ExternalId { get; set; }

        // 外部对接系统类型
        [NameInMap("external_system")]
        [Validation(Required=false)]
        public string ExternalSystem { get; set; }

        // 操作员唯一登录名
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 操作员昵称
        [NameInMap("nickname")]
        [Validation(Required=false)]
        public string Nickname { get; set; }

        // 操作员真实姓名
        [NameInMap("real_name")]
        [Validation(Required=true)]
        public string RealName { get; set; }

        // 租户唯一标识
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 工号
        [NameInMap("work_no")]
        [Validation(Required=false)]
        public string WorkNo { get; set; }

        // 业务场景码
        [NameInMap("bussiness_code")]
        [Validation(Required=false)]
        public string BussinessCode { get; set; }

        // 加密密码
        [NameInMap("encrypted_password")]
        [Validation(Required=false)]
        public string EncryptedPassword { get; set; }

        // 首次登录是否需要重置密码，取值范围：true, false，默认为 false
        [NameInMap("reset_password_when_first_login")]
        [Validation(Required=false)]
        public bool? ResetPasswordWhenFirstLogin { get; set; }

    }

}
