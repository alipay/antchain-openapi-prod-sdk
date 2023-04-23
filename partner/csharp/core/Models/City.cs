// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 城市信息
    public class City : TeaModel {
        // 城市名称
        [NameInMap("city_name")]
        [Validation(Required=true)]
        public string CityName { get; set; }

    }

}
