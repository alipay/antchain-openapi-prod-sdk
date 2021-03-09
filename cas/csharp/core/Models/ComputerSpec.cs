// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 服务器规格
    public class ComputerSpec : TeaModel {
        // cpu个数
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public long? Cpu { get; set; }

        // 可以挂载的磁盘类型
        [NameInMap("disk_spec_ids")]
        [Validation(Required=false)]
        public List<string> DiskSpecIds { get; set; }

        // 服务器规格名称
        [NameInMap("group")]
        [Validation(Required=true)]
        public string Group { get; set; }

        // 是否有IO优化
        [NameInMap("io_optimized")]
        [Validation(Required=false)]
        public bool? IoOptimized { get; set; }

        // 内存大小
        [NameInMap("memory")]
        [Validation(Required=false)]
        public long? Memory { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // enable
        [NameInMap("enable")]
        [Validation(Required=false)]
        public bool? Enable { get; set; }

        // iaasId
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // COMPUTER_ECS
        [NameInMap("iaas_type")]
        [Validation(Required=false)]
        public string IaasType { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // providerId
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

    }

}
