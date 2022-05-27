// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class FinishAntiImagesyncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 批次号
        [NameInMap("batch_no")]
        [Validation(Required=true)]
        public string BatchNo { get; set; }

        // 防伪码类型
        [NameInMap("code_type")]
        [Validation(Required=true)]
        public string CodeType { get; set; }

    }

}
