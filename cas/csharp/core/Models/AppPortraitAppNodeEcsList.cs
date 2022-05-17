// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用画像应用ECS节点列表
    public class AppPortraitAppNodeEcsList : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // zone_id
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

        // ip
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // load_balancer_spec
        [NameInMap("load_balancer_spec")]
        [Validation(Required=false)]
        public string LoadBalancerSpec { get; set; }

        // cpu
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public string Cpu { get; set; }

        // memory
        [NameInMap("memory")]
        [Validation(Required=false)]
        public string Memory { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
