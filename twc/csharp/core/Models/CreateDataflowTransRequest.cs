// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateDataflowTransRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 存证主体信息，使用存证公钥加密
        [NameInMap("customer")]
        [Validation(Required=true)]
        public string Customer { get; set; }

        // 子业务ID，选填
        [NameInMap("sub_biz_id")]
        [Validation(Required=false)]
        public string SubBizId { get; set; }

        // 扩展属性信息，使用存证公钥加密，选填
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

    }

}
