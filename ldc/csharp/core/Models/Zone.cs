// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 可用区
    public class Zone : TeaModel {
        // 数据中心名
        [NameInMap("data_center")]
        [Validation(Required=true)]
        public string DataCenter { get; set; }

        // 可用区展示名
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 可用区名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 所属地域
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 可用区id
        [NameInMap("zone_id")]
        [Validation(Required=true)]
        public string ZoneId { get; set; }

        // 地域id
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

    }

}
