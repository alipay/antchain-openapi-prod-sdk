// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 营销盾实时圈客结果返回model
    public class CustomerUmktInfoModel : TeaModel {
        // 基本圈客结果信息
        [NameInMap("base_info")]
        [Validation(Required=true)]
        public BaseCustomerUmktInfoModel BaseInfo { get; set; }

        // 额外的营销分结果
        [NameInMap("umkt_out_put_info")]
        [Validation(Required=false)]
        public string UmktOutPutInfo { get; set; }

    }

}
