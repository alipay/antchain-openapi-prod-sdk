// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class ImportSgResourceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // guardian使用的参数
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 文件内容，json串
        [NameInMap("file_content")]
        [Validation(Required=false)]
        public string FileContent { get; set; }

        // 文件名
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 表明是DRM还是guardian
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 上传类型。 data 表示上传带有推送值，空表示只传元数据
        [NameInMap("upload_type")]
        [Validation(Required=false)]
        public string UploadType { get; set; }

    }

}
