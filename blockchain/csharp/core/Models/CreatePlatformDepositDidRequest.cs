// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreatePlatformDepositDidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户身份证号
        [NameInMap("id_card_number")]
        [Validation(Required=true)]
        public string IdCardNumber { get; set; }

        // 手机号
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 用户姓名
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

    }

}
