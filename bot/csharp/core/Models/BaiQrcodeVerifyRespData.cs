// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 溯源防伪码质检响应数据
    public class BaiQrcodeVerifyRespData : TeaModel {
        // 鉴定结果
        // REAL：通过
        // UNABLE_IDENTIFY：无法鉴定
        [NameInMap("identification_result")]
        [Validation(Required=true)]
        public string IdentificationResult { get; set; }

        // 辅助识别结果码
        [NameInMap("identification_code")]
        [Validation(Required=true)]
        public string IdentificationCode { get; set; }

        // 辅助识别信息
        [NameInMap("identification_message")]
        [Validation(Required=true)]
        public string IdentificationMessage { get; set; }

        // 无法鉴定时的解决方案
        [NameInMap("unable_identify_solution")]
        [Validation(Required=true)]
        public string UnableIdentifySolution { get; set; }

    }

}
