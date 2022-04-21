// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 地区请求
    public class DistrictExtRequest : TeaModel {
        // 地区编码
        [NameInMap("city_code")]
        [Validation(Required=true)]
        public string CityCode { get; set; }

    }

}
