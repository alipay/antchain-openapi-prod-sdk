// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UpdateIpCodebaseinfoRequest : TeaModel {
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

        // phone_number、user_id 必填一个
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // phone_number、user_id 必填一个
        [NameInMap("phone_number")]
        [Validation(Required=false)]
        public string PhoneNumber { get; set; }

        // 用户头像地址，传空则查询shareInfo并更新
        [NameInMap("avatar")]
        [Validation(Required=false)]
        public string Avatar { get; set; }

        // 用户昵称，传空则查询shareInfo并更新
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

    }

}
