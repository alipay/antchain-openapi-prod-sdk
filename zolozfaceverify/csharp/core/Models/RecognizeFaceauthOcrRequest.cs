// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZOLOZFACEVERIFY.Models
{
    public class RecognizeFaceauthOcrRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据内容
        [NameInMap("data_context")]
        [Validation(Required=true)]
        public string DataContext { get; set; }

        // 数据类型：OSS_ADDR/BASE64_JPG
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 扩展字段
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

        // face: 身份证正面 back: 身份证反面 缺省值是：face
        // 
        [NameInMap("side")]
        [Validation(Required=true)]
        public string Side { get; set; }

        // zimid
        [NameInMap("zim_id")]
        [Validation(Required=true)]
        public string ZimId { get; set; }

    }

}
