// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 地区
    public class RiskEvaluationDistrictExtRequest : TeaModel {
        // 地区编码
        [NameInMap("city_code")]
        [Validation(Required=true)]
        public string CityCode { get; set; }

        // 省级编码
        [NameInMap("prov_code")]
        [Validation(Required=true)]
        public string ProvCode { get; set; }

    }

}
