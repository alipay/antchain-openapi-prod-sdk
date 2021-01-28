// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class AuthContractSignRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权人ID，即个人账号ID或机构账号ID
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 授权截止时间, 格式为yyyy-MM-dd HH:mm:ss，默认无限期
        [NameInMap("deadline")]
        [Validation(Required=false)]
        public string Deadline { get; set; }

    }

}
