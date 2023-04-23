// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 省份信息
    public class Province : TeaModel {
        // 省份名称
        [NameInMap("province_name")]
        [Validation(Required=true)]
        public string ProvinceName { get; set; }

    }

}
