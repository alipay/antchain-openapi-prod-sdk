// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // groupA分组结构体
    public class GroupAClass : TeaModel {
        // -
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 防伪码类型
        [NameInMap("code_type")]
        [Validation(Required=true)]
        public string CodeType { get; set; }

        // 防伪码码值
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

    }

}
