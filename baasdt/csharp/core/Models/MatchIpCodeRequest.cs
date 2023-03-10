// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class MatchIpCodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 用户ID，logon_id、user_id必填一个
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 支付宝登录ID，logon_id、user_id必填一个
        [NameInMap("logon_id")]
        [Validation(Required=false)]
        public string LogonId { get; set; }

        // uni码，支持unicode、原始码、加密码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

    }

}
