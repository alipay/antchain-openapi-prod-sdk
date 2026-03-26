// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 汽车之家城市信息
    public class CityResult : TeaModel {
        // 城市Id
        [NameInMap("city_id")]
        [Validation(Required=true)]
        public string CityId { get; set; }

        // 城市名称
        [NameInMap("city_name")]
        [Validation(Required=true)]
        public string CityName { get; set; }

    }

}
