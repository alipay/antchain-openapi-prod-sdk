// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class RegisterEcarEnterprisememberRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 注册会员在蚂蚁DIS服务的DID账号
        [NameInMap("account_did")]
        [Validation(Required=false)]
        public string AccountDid { get; set; }

        // 注册会员姓名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 注册会员身份证号码
        [NameInMap("identity_card_code")]
        [Validation(Required=false)]
        public string IdentityCardCode { get; set; }

    }

}
