// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACS_USER.Models
{
    public class JudgeAuthorityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户id，和参数token二者必须有一个不能为空
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户登录token，和user_id二者必须有一个不能为空，当token不为空时，会先判断token 是否有效，然后进行权限判断
        [NameInMap("token")]
        [Validation(Required=false)]
        public string Token { get; set; }

        // 产品编码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 对应的权限码或者是角色编码
        [NameInMap("action_code")]
        [Validation(Required=true)]
        public string ActionCode { get; set; }

        // 鉴权类型，ROLE：角色鉴权；ACTION：权限点鉴权
        [NameInMap("action_type")]
        [Validation(Required=true)]
        public string ActionType { get; set; }

    }

}
