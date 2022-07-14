// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 疫苗信息
    public class VaccinationInformation : TeaModel {
        // 疫苗接种状态(0查询失败 1未接种 2已接种一针 3完成接种)
        [NameInMap("vaccination_status")]
        [Validation(Required=true)]
        public string VaccinationStatus { get; set; }

        // 疫苗接种时间
        [NameInMap("vaccination_time")]
        [Validation(Required=true)]
        public string VaccinationTime { get; set; }

    }

}
