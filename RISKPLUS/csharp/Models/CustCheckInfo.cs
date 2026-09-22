// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 借款确认页客户确认信息
    public class CustCheckInfo : TeaModel {
        // 签约结果,01 - 处理中，02 - 成功，03 失败（当超过链接有效期却还未收到前端给出的跳端成功结果后，会将此次跳端结果设置为失败）
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("sign_result")]
        [Validation(Required=true)]
        public string SignResult { get; set; }

    }

}
