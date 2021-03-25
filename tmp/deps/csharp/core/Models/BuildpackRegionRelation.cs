// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 技术栈版本和地域之间的关联
    public class BuildpackRegionRelation : TeaModel {
        // 技术栈版本的id
        [NameInMap("buildpack_id")]
        [Validation(Required=false)]
        public string BuildpackId { get; set; }

        // 技术栈租户ID
        [NameInMap("buildpack_tenant_id")]
        [Validation(Required=false)]
        public string BuildpackTenantId { get; set; }

        // 文件的checksum
        [NameInMap("file_checksum")]
        [Validation(Required=false)]
        public string FileChecksum { get; set; }

        // 文件存储地址
        [NameInMap("file_location")]
        [Validation(Required=false)]
        public string FileLocation { get; set; }

        // 文件大小，类似1100
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public long? FileSize { get; set; }

        // 文件状态
        [NameInMap("file_status")]
        [Validation(Required=false)]
        public string FileStatus { get; set; }

        // 文件的初始名称
        [NameInMap("original_file_name")]
        [Validation(Required=false)]
        public string OriginalFileName { get; set; }

        // 文件可读的大小，类似1.1MB
        [NameInMap("readable_file_size")]
        [Validation(Required=false)]
        public string ReadableFileSize { get; set; }

        // region的ID
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // region的标识符
        [NameInMap("region_identity")]
        [Validation(Required=false)]
        public string RegionIdentity { get; set; }

        // region的名称
        [NameInMap("region_name")]
        [Validation(Required=false)]
        public string RegionName { get; set; }

        // 存储类型，取值如下： SYSTEM_AFS表示AFS存储，SYSTEM_OSS表示OSS存储
        [NameInMap("storage_type")]
        [Validation(Required=false)]
        public string StorageType { get; set; }

    }

}
