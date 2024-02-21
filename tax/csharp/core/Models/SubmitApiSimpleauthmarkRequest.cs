// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class SubmitApiSimpleauthmarkRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 打标之后的结果
        [NameInMap("identity_group_list")]
        [Validation(Required=true)]
        public List<IdentityIdGroup> IdentityGroupList { get; set; }

        // 产品类型
        [NameInMap("auth_type")]
        [Validation(Required=false)]
        public string AuthType { get; set; }

        // 租户信息
        [NameInMap("inst_code")]
        [Validation(Required=true)]
        public string InstCode { get; set; }

    }

}
