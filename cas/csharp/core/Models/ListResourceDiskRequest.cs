// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListResourceDiskRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要查询的云盘或本地盘类型。取值范围：
        // 
        // all：同时查询系统盘与数据盘
        // system：只查询系统盘
        // data：只查询数据盘
        // 默认值：all。
        [NameInMap("disk_type")]
        [Validation(Required=false)]
        public string DiskType { get; set; }

        // 实例规格
        [NameInMap("instance_type")]
        [Validation(Required=true)]
        public string InstanceType { get; set; }

        // region name
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

    }

}
