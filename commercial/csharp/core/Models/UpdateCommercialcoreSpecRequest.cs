// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    public class UpdateCommercialcoreSpecRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 规格code
        [NameInMap("spec_code")]
        [Validation(Required=true)]
        public string SpecCode { get; set; }

        // 规格名称
        [NameInMap("spec_name")]
        [Validation(Required=true)]
        public string SpecName { get; set; }

        // 主要付款方式
        [NameInMap("main_pay_method")]
        [Validation(Required=false)]
        public string MainPayMethod { get; set; }

        // 售卖模式
        [NameInMap("sales_mode")]
        [Validation(Required=false)]
        public string SalesMode { get; set; }

        // 规格描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

    }

}
