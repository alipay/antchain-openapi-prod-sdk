// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 疫苗接种信息
    public class VaccinationInfo : TeaModel {
        // 疫苗接种信息：
        // 0:查询失败 
        // 1:未接种
        // 2:已接种一针
        // 3:完成接种
        [NameInMap("vaccination_code")]
        [Validation(Required=false)]
        public string VaccinationCode { get; set; }

        // 疫苗接种信息
        [NameInMap("vaccination_desc")]
        [Validation(Required=false)]
        public string VaccinationDesc { get; set; }

        // 疫苗接种时间戳（单位：ms）
        [NameInMap("vaccination_timestamp")]
        [Validation(Required=false)]
        public long? VaccinationTimestamp { get; set; }

    }

}
