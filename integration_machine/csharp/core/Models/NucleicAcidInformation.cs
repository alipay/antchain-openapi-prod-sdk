// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 核酸信息
    public class NucleicAcidInformation : TeaModel {
        // 核酸结果
        [NameInMap("nucleic_acid_result")]
        [Validation(Required=true)]
        public string NucleicAcidResult { get; set; }

        // 核酸时间
        [NameInMap("nucleic_acid_time")]
        [Validation(Required=true)]
        public string NucleicAcidTime { get; set; }

    }

}
