// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UploadApplicationPackageResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 上传oss的bucket名称
        [NameInMap("bucket_name")]
        [Validation(Required=false)]
        public string BucketName { get; set; }

        // 上传应用发布包的授权签名上传地址
        [NameInMap("signed_upload_url")]
        [Validation(Required=false)]
        public string SignedUploadUrl { get; set; }

    }

}
