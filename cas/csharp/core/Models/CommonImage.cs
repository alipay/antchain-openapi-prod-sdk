// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // computer common image
    public class CommonImage : TeaModel {
        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // is enable
        [NameInMap("enable")]
        [Validation(Required=false)]
        public bool? Enable { get; set; }

        // iaas id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // iaas type
        [NameInMap("iaas_type")]
        [Validation(Required=false)]
        public string IaasType { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 是否仅杭州金区 vpc 可用镜像
        [NameInMap("only_hz_fin_vpc_supported")]
        [Validation(Required=false)]
        public bool? OnlyHzFinVpcSupported { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // os
        [NameInMap("os")]
        [Validation(Required=false)]
        public string Os { get; set; }

        // os bit取值：32，64
        [NameInMap("os_bit")]
        [Validation(Required=false)]
        public long? OsBit { get; set; }

        // os version
        [NameInMap("os_version")]
        [Validation(Required=false)]
        public string OsVersion { get; set; }

        // provider id
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

        // region id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // system disk size(GB)
        [NameInMap("system_disk_size")]
        [Validation(Required=false)]
        public long? SystemDiskSize { get; set; }

    }

}
