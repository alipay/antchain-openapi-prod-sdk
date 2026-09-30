// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class CreateAntcloudGatewayxFileUploadRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 上传文件作用的openapi method
        [NameInMap("api_code")]
        [Validation(Required=true)]
        public string ApiCode { get; set; }

        // 文件标签，多个标签;分割
        [NameInMap("file_label")]
        [Validation(Required=false, MaxLength=100)]
        public string FileLabel { get; set; }

        // 自定义的文件元数据
        [NameInMap("file_metadata")]
        [Validation(Required=false, MaxLength=1000)]
        public string FileMetadata { get; set; }

        // 文件名，不传则随机生成文件名
        [NameInMap("file_name")]
        [Validation(Required=false, MaxLength=100)]
        public string FileName { get; set; }

        // 文件的多媒体类型
        [NameInMap("mime_type")]
        [Validation(Required=false)]
        public string MimeType { get; set; }

        // 产品方的api归属集群，即productInstanceId
        [NameInMap("api_cluster")]
        [Validation(Required=false)]
        public string ApiCluster { get; set; }

    }

}
