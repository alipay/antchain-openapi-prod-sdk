// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class AuthUserRefRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作员id，一般是C类用户
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public long? OperatorId { get; set; }

        // 待登录的B类账号id
        [NameInMap("ref_user_id")]
        [Validation(Required=true)]
        public long? RefUserId { get; set; }

        // operatorId 用户登录时对应的accessToken
        // 
        // 
        [NameInMap("access_token")]
        [Validation(Required=true)]
        public string AccessToken { get; set; }

        // 是否设为默认企业(1 设置默认企业 0 切换临时企业)
        // 
        // 
        [NameInMap("set_default")]
        [Validation(Required=true)]
        public long? SetDefault { get; set; }

    }

}
