// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 公积金月数接口签名信息
    public class CpfDataUseReqSign : TeaModel {
        // 机构签名ID
        [NameInMap("m_sy_app_id")]
        [Validation(Required=true)]
        public string MSyAppId { get; set; }

        // 签名service, 需要颁发
        [NameInMap("m_sy_service")]
        [Validation(Required=true)]
        public string MSyService { get; set; }

        // 签名信息
        [NameInMap("m_sy_sign")]
        [Validation(Required=true)]
        public string MSySign { get; set; }

    }

}
