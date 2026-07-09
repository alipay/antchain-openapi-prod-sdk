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
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 产线场景码	
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>MAYI-0001 </para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 压测的目标设备可信信根设备的唯一标识，JSONArray字符串	
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>[ {&quot;componentId&quot;: &quot;864964060327592&quot;} {&quot;componentId&quot;: &quot;864964060327592&quot;} ]</para>
        /// </summary>
        [NameInMap("component_id_list")]
        [Validation(Required=true)]
        public string ComponentIdList { get; set; }

        // 客户侧的压测报告	
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>[ { &quot;name&quot;:&quot;流量消耗&quot;, &quot;consumption&quot;:&quot;100KB&quot;, &quot;asExpected&quot;:true }, { &quot;name&quot;:&quot;功耗&quot;, &quot;consumption&quot;:&quot;25mA&quot;, &quot;asExpected&quot;:true }, { &quot;name&quot;:&quot;OTA升级&quot; &quot;asExpected&quot;:true } ] } </para>
        /// </summary>
        [NameInMap("customer_pt_report")]
        [Validation(Required=false)]
        public string CustomerPtReport { get; set; }

        // 压测开始时间	
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("pt_start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PtStartTime { get; set; }

        // 压测结束时间	
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("pt_end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PtEndTime { get; set; }

        // RUNNING: 正在执行 SUCCESS : 测试通过 FAILED : 测试不通过	
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>RUNNING</para>
        /// </summary>
        [NameInMap("pt_status")]
        [Validation(Required=true)]
        public string PtStatus { get; set; }

        // 关联SIT环境的工单ID	
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1122</para>
        /// </summary>
        [NameInMap("work_order_id")]
        [Validation(Required=false)]
        public string WorkOrderId { get; set; }

        // 关联SIT环境的项目ID	
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>11223344</para>
        /// </summary>
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 产线压测任务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>11223344566</para>
        /// </summary>
        [NameInMap("pt_task_id")]
        [Validation(Required=true)]
        public string PtTaskId { get; set; }

        // 压测不通过的原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>数据验签失败</para>
        /// </summary>
        [NameInMap("failure_reason")]
        [Validation(Required=true)]
        public string FailureReason { get; set; }

        // 拓展信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>{...}</para>
        /// </summary>
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
