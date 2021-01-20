// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 技术栈包上传地址信息
    public class UploadEndpoint : TeaModel {
        // 对象存储的access_key_id
        [NameInMap("access_key_id")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        // 上传的目标bucket名称
        [NameInMap("bucket")]
        [Validation(Required=false)]
        public string Bucket { get; set; }

        // 加密策略，仅storage_type为SYSTEM_OSS时有效
        [NameInMap("encoded_policy")]
        [Validation(Required=false)]
        public string EncodedPolicy { get; set; }

        // 文件失效的日期时间
        [NameInMap("expiration")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string Expiration { get; set; }

        // 对象存储的上传目标文件路径
        [NameInMap("file_path")]
        [Validation(Required=false)]
        public string FilePath { get; set; }

        // 上传的目标主机名，仅storage_type为SYSTEM_OSS时有效
        [NameInMap("host")]
        [Validation(Required=false)]
        public string Host { get; set; }

        // 地域ID
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // 签名，仅storage_type为SYSTEM_OSS时有效
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 存储类型，取值如下： SYSTEM_AFS表示AFS存储，SYSTEM_OSS表示OSS存储
        [NameInMap("storage_type")]
        [Validation(Required=false)]
        public string StorageType { get; set; }

        // 上传的目标URL
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
