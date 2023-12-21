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
        [Validation(Required=false)]
        public string CityCode { get; set; }

        // 省或者直辖市代码
        [NameInMap("prov_code")]
        [Validation(Required=false)]
        public string ProvCode { get; set; }

    }

}
