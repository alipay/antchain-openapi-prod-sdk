// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateBuildpackResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 创建完成的技术栈ID
        [NameInMap("buildpack_id")]
        [Validation(Required=false)]
        public string BuildpackId { get; set; }

        // 技术栈包上传地址信息
        [NameInMap("upload_endpoints")]
        [Validation(Required=false)]
        public List<UploadEndpoint> UploadEndpoints { get; set; }

    }

}
