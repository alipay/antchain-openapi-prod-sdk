// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACS_USER.Models
{
    public class ListPolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户id，和token二者其中一个必须输入
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户登录token，和user_id二者其中一个必须，如果token不为空，则会先进行登录态的检查，没有查到，则返回失败，否则返回用户的权限信息
        [NameInMap("token")]
        [Validation(Required=false)]
        public string Token { get; set; }

        // 产品编码，不传入，返回用户拥有的所有权限，传入则返回用户当前产品的权限信息
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

    }

}
