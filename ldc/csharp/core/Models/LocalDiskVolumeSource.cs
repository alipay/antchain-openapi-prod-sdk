// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 本地磁盘volume。
    public class LocalDiskVolumeSource : TeaModel {
        // 主机路径。
        [NameInMap("host_directory_path")]
        [Validation(Required=true)]
        public string HostDirectoryPath { get; set; }

        // 是否允许创建。
        [NameInMap("create_if_not_present")]
        [Validation(Required=true)]
        public bool? CreateIfNotPresent { get; set; }

    }

}
