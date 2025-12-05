// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class CallbackAuthDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权token
        [NameInMap("authorized_token")]
        [Validation(Required=true)]
        public string AuthorizedToken { get; set; }

        // 数据详情 JSONObject
        [NameInMap("data_detail")]
        [Validation(Required=true)]
        public string DataDetail { get; set; }

        // 授权内容/数据类型
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

    }

}
