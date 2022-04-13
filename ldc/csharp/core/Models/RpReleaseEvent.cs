// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // ReleasePipeline ref event
    public class RpReleaseEvent : TeaModel {
        // 集群名
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 事件关联的对象类型
        // 
        [NameInMap("inv_obj_kind")]
        [Validation(Required=true)]
        public string InvObjKind { get; set; }

        // 事件关联对象名字
        // 
        [NameInMap("inv_obj_name")]
        [Validation(Required=true)]
        public string InvObjName { get; set; }

        // 事件关联对象的namespace
        // 
        [NameInMap("inv_obj_namespace")]
        [Validation(Required=true)]
        public string InvObjNamespace { get; set; }

        // 事件关联对象版本
        // 
        [NameInMap("inv_obj_version")]
        [Validation(Required=true)]
        public string InvObjVersion { get; set; }

        // 事件详情
        // 
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 事件原因
        // 
        [NameInMap("reason")]
        [Validation(Required=true)]
        public string Reason { get; set; }

        // 事件来源组件
        // 
        [NameInMap("source_comp")]
        [Validation(Required=true)]
        public string SourceComp { get; set; }

        // start_time
        [NameInMap("start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

    }

}
