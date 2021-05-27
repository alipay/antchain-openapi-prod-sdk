// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 操作信息
    public class FlowNode : TeaModel {
        // 序号
        [NameInMap("index")]
        [Validation(Required=false)]
        public long? Index { get; set; }

        // 操作类型【CREATE：创建入库申请，AUDIT：保管人审核，ALLOCATE：审核拒绝，STORAGE：入库，COMPLETE：完成】
        //  
        //    
        //     
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 流程节点状态【 PASS：成功，FAIL：失败，ACTIVE：激活，INACTIVE：未激活】
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 操作时间，单位：ms
        [NameInMap("operate_time")]
        [Validation(Required=false)]
        public long? OperateTime { get; set; }

        // 备注
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

    }

}
