// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 营销盾圈投任务信息
    public class UmktCampaignTaskInfo : TeaModel {
        // 任务唯一id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx-xxx-xxx</para>
        /// </summary>
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 圈投任务执行日期，yyyy-MM-dd格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025-12-25</para>
        /// </summary>
        [NameInMap("exec_date")]
        [Validation(Required=true)]
        public string ExecDate { get; set; }

        // 圈投任务执行批次
        /// <summary>
        /// <b>Example:</b>
        /// <para>202512250020</para>
        /// </summary>
        [NameInMap("exec_batch")]
        [Validation(Required=true)]
        public string ExecBatch { get; set; }

        // 圈投任务状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>D</para>
        /// </summary>
        [NameInMap("campaign_task_status")]
        [Validation(Required=true)]
        public string CampaignTaskStatus { get; set; }

        // 节点任务列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;nodeId&quot;:&quot;35d2171b68fd472c8f4cc5c293985d37&quot;,&quot;execDate&quot;:&quot;&quot;,&quot;nodeTaskStatus&quot;:&quot;F&quot;,&quot;relTaskList&quot;:[{&quot;resourceId&quot;:&quot;1007&quot;, &quot;taskStatus&quot;:&quot;F&quot;,&quot;errMsg&quot;:&quot;上游节点执行失败&quot;}]}</para>
        /// </summary>
        [NameInMap("node_task_list")]
        [Validation(Required=true)]
        public List<UmktCampaignNodeTaskInfo> NodeTaskList { get; set; }

    }

}
