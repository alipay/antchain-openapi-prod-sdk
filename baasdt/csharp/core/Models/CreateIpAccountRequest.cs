// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CreateIpAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 该用户的在外部系统的用户Id
        [NameInMap("external_user_id")]
        [Validation(Required=true)]
        public string ExternalUserId { get; set; }

        // 该用户的在外部系统的用户名称
        [NameInMap("external_user_name")]
        [Validation(Required=true)]
        public string ExternalUserName { get; set; }

        // 角色:  1:版权方 2: 版权采购商  
        [NameInMap("role")]
        [Validation(Required=true)]
        public long? Role { get; set; }

    }

}
