// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 箱子信息
    public class VehicleContainerParam : TeaModel {
        // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 集装箱ID
        [NameInMap("container_id")]
        [Validation(Required=true)]
        public string ContainerId { get; set; }

        // 箱号
        [NameInMap("container_no")]
        [Validation(Required=false)]
        public string ContainerNo { get; set; }

        // 封号
        [NameInMap("seal_no")]
        [Validation(Required=false)]
        public string SealNo { get; set; }

    }

}
