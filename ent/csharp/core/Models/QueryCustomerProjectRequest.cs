// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class QueryCustomerProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 登录支付宝账号，手机号或者邮箱地址
        [NameInMap("logon_id")]
        [Validation(Required=true)]
        public string LogonId { get; set; }

        // 登录账号类型，PHONE 为手机号，EMAIL 为邮箱地址。
        [NameInMap("logon_id_type")]
        [Validation(Required=true)]
        public string LogonIdType { get; set; }

    }

}
