// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class InitAntiImagesyncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 防伪码类型标识,由蚂蚁侧分配
        [NameInMap("code_type")]
        [Validation(Required=true)]
        public string CodeType { get; set; }

        // 防伪码批次号
        [NameInMap("batch_no")]
        [Validation(Required=true)]
        public string BatchNo { get; set; }

        // 批次下要上传的防伪码总数
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

    }

}
