// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ADOM.Models
{
    public class SubmitAppmarketPrivacymodelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 商品实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 文件名称
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 结构化入参
        [NameInMap("struct_input")]
        [Validation(Required=false)]
        public string StructInput { get; set; }

    }

}
