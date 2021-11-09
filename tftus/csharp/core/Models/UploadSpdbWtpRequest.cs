// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TFTUS.Models
{
    public class UploadSpdbWtpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求幂等字段
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 上传对象名称
        [NameInMap("upload_name")]
        [Validation(Required=true)]
        public string UploadName { get; set; }

        // 上传信息内容
        [NameInMap("upload_msg")]
        [Validation(Required=true)]
        public string UploadMsg { get; set; }

    }

}
