// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class CreateOperatorRequest : TeaModel {
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

        // 业务场景码
        [NameInMap("bussiness_code")]
        [Validation(Required=false)]
        public string BussinessCode { get; set; }

    }

}
