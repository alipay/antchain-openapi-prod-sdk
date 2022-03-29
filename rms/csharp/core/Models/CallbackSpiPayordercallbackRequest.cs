// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class CallbackSpiPayordercallbackRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 南天门支付后回调请求, 见 http://help.aliyun-inc.com/internaldoc/detail/134798.html?spm=ntm.workbench-devPlatform-extendPoint.0.0.42a919afQhBhEB.
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
