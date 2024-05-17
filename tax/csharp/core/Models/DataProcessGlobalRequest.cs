// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 数据流转统一入参
    public class DataProcessGlobalRequest : TeaModel {
        // 产品码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 租户类型
        [NameInMap("inst_code")]
        [Validation(Required=true)]
        public string InstCode { get; set; }

        // 参数
        [NameInMap("param")]
        [Validation(Required=true)]
        public string Param { get; set; }

    }

}
