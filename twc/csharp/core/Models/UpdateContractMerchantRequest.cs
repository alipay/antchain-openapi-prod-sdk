// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UpdateContractMerchantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 内容和商户进件信息类似，唯一区别在于此接口biz_content不要传external_id，改为传之前进件获取到的商户id信息smid，具体可见示例。
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public string BizContent { get; set; }

    }

}
