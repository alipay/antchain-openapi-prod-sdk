// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateAuthCorporateDidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 对企业描述的扩展字段，用于传递更多企业信息，支持业务。
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 企业名称，通常为法定的公司实体名称
        [NameInMap("owner_name")]
        [Validation(Required=true)]
        public string OwnerName { get; set; }

        // 调用方体系内企业的唯一ID，作为创建DID的绑定目标，调用者需要保证其唯一性。
        [NameInMap("owner_uid")]
        [Validation(Required=true)]
        public string OwnerUid { get; set; }

    }

}
