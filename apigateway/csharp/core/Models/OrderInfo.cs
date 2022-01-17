// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 排序信息
    public class OrderInfo : TeaModel {
        // 要排序的字段
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 升序or降序
        [NameInMap("order")]
        [Validation(Required=true)]
        public string Order { get; set; }

    }

}
