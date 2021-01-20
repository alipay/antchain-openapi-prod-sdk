// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class ReleaseComputerRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 计算资源id，可以指定多个
        [NameInMap("computer_ids")]
        [Validation(Required=false)]
        public List<string> ComputerIds { get; set; }

        // 请求业务id，用于幂等性控制等，需要客户端提供并保证唯一。最大64位单字节字符
        [NameInMap("req_biz_id")]
        [Validation(Required=false)]
        public string ReqBizId { get; set; }

    }

}
