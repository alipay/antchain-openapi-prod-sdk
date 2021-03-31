// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryCreditDriverRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 申请id
        [NameInMap("apply_id")]
        [Validation(Required=false)]
        public string ApplyId { get; set; }

        // 司机分布式数字身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 集团平台方分布式数字身份
        [NameInMap("group_platform_did")]
        [Validation(Required=true)]
        public string GroupPlatformDid { get; set; }

        // 产品id  目前填写PRODUCT_MYBANK
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

    }

}
