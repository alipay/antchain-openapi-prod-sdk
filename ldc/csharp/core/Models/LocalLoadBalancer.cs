// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 联邦负载均衡实例对应的local lb实例信息（per cell)
    public class LocalLoadBalancer : TeaModel {
        // local lb所在部署单元
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // local lb实例对应的iaas id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // local lb实例对应的vip
        [NameInMap("vip")]
        [Validation(Required=false)]
        public string Vip { get; set; }

        // 当前cell lb的phase
        [NameInMap("phase")]
        [Validation(Required=false)]
        public string Phase { get; set; }

        // 空代表无错误信息，非空时即报错信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
