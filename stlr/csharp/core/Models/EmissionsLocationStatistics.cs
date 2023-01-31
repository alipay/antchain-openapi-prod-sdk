// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 碳排放分单元统计总量
    public class EmissionsLocationStatistics : TeaModel {
        // 盘查单元编码
        [NameInMap("location_no")]
        [Validation(Required=true)]
        public string LocationNo { get; set; }

        // 盘查单元名称
        [NameInMap("location_name")]
        [Validation(Required=true)]
        public string LocationName { get; set; }

        // 盘查单元排放量
        [NameInMap("emission_amount")]
        [Validation(Required=true)]
        public string EmissionAmount { get; set; }

        // 排放量单位，默认为：tCO2e
        [NameInMap("data_unit")]
        [Validation(Required=true)]
        public string DataUnit { get; set; }

    }

}
