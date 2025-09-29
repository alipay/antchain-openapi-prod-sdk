// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BXPT_NEW.Models
{
    public class NotifyMultimodalDataprodRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 通知具体json内容
        [NameInMap("biz_content")]
        [Validation(Required=false)]
        public string BizContent { get; set; }

        // 唯一请求id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 业务标识
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

    }

}
