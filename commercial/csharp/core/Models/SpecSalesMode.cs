// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 规格售卖模式
    public class SpecSalesMode : TeaModel {
        // 规格售卖模式
        [NameInMap("sales_mode_code")]
        [Validation(Required=true)]
        public string SalesModeCode { get; set; }

        // 售卖模式
        [NameInMap("sales_mode_name")]
        [Validation(Required=true)]
        public string SalesModeName { get; set; }

    }

}
