// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class QueryApplicationIpeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据集id，开发者提供
        [NameInMap("data_set_id")]
        [Validation(Required=true)]
        public string DataSetId { get; set; }

        // 企业信息
        [NameInMap("index")]
        [Validation(Required=true)]
        public string Index { get; set; }

    }

}
