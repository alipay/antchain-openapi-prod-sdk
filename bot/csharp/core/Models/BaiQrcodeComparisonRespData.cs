// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 二维码验真接口返回值
    public class BaiQrcodeComparisonRespData : TeaModel {
        // 识别结果（REAL：真   FAKE：假   UNABLE_IDENTIFY：无法识别）
        [NameInMap("identification_result")]
        [Validation(Required=true)]
        public string IdentificationResult { get; set; }

        // 辅助识别结果码
        [NameInMap("identification_code")]
        [Validation(Required=false)]
        public string IdentificationCode { get; set; }

        // 辅助识别信息
        [NameInMap("identification_message")]
        [Validation(Required=false)]
        public string IdentificationMessage { get; set; }

        // 无法识别时提示的解决方案
        [NameInMap("unable_identify_solution")]
        [Validation(Required=false)]
        public string UnableIdentifySolution { get; set; }

    }

}
