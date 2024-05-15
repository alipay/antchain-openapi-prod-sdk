// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class AddAuthAdminRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权策略ID
        [NameInMap("policy_id")]
        [Validation(Required=true)]
        public string PolicyId { get; set; }

        // 授权策略描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 授权策略配置
        [NameInMap("authorize_config")]
        [Validation(Required=true)]
        public string AuthorizeConfig { get; set; }

    }

}
