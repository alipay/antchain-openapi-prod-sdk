// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class CreateSpProductLogicinstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_access_code")]
        [Validation(Required=false)]
        public string ProductAccessCode { get; set; }

        // 主产品实例唯一id
        [NameInMap("product_instance_unique_id")]
        [Validation(Required=true)]
        public string ProductInstanceUniqueId { get; set; }

        // 逻辑实例唯一id
        [NameInMap("unique_id")]
        [Validation(Required=true)]
        public string UniqueId { get; set; }

        // 幂等号
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 账号Id
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

        // ACTIVE
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 逻辑实例描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=true)]
        public string Properties { get; set; }

    }

}
