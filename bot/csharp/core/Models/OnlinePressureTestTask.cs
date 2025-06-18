// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 产线压测任务对象
    public class OnlinePressureTestTask : TeaModel {
        // DATE
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间	
        // 
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 产线场景码	
        // 
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 压测的目标设备可信信根设备的唯一标识，JSONArray字符串	
        // 
        [NameInMap("component_id_list")]
        [Validation(Required=true)]
        public string ComponentIdList { get; set; }

        // 客户侧的压测报告	
        // 
        [NameInMap("customer_pt_report")]
        [Validation(Required=false)]
        public string CustomerPtReport { get; set; }

        // 压测开始时间	
        // 
        [NameInMap("pt_start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PtStartTime { get; set; }

        // 压测结束时间	
        // 
        [NameInMap("pt_end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PtEndTime { get; set; }

        // RUNNING: 正在执行 SUCCESS : 测试通过 FAILED : 测试不通过	
        // 
        [NameInMap("pt_status")]
        [Validation(Required=true)]
        public string PtStatus { get; set; }

        // 关联SIT环境的工单ID	
        // 
        [NameInMap("work_order_id")]
        [Validation(Required=false)]
        public string WorkOrderId { get; set; }

        // 关联SIT环境的项目ID	
        // 
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 产线压测任务ID
        [NameInMap("pt_task_id")]
        [Validation(Required=true)]
        public string PtTaskId { get; set; }

        // 压测不通过的原因
        [NameInMap("failure_reason")]
        [Validation(Required=true)]
        public string FailureReason { get; set; }

        // 拓展信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
