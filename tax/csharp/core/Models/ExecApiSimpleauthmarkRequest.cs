// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class ExecApiSimpleauthmarkRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 税号清单
        [NameInMap("identity_id_list")]
        [Validation(Required=true)]
        public List<IdentityInfo> IdentityIdList { get; set; }

        // 租户号
        [NameInMap("inst_code")]
        [Validation(Required=true)]
        public string InstCode { get; set; }

        // 请求id
        [NameInMap("biz_unique_id")]
        [Validation(Required=true)]
        public string BizUniqueId { get; set; }

        // 产品类型
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

    }

}
