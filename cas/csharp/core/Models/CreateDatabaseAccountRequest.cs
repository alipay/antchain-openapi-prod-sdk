// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateDatabaseAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // database 序列号
        [NameInMap("database_sequence")]
        [Validation(Required=true)]
        public string DatabaseSequence { get; set; }

        // 账户名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 账户密码
        [NameInMap("password")]
        [Validation(Required=true)]
        public string Password { get; set; }

    }

}
