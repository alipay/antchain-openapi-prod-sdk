// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListAvailableDiskRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // region name
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 磁盘类型：
        // SystemDisk;
        // DataDisk
        [NameInMap("disk_type")]
        [Validation(Required=true)]
        public string DiskType { get; set; }

        // 实例规格
        [NameInMap("instance_type")]
        [Validation(Required=true)]
        public string InstanceType { get; set; }

    }

}
