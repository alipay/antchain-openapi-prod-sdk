// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 文本同步审核结果
    public class TextSyncAuditResult : TeaModel {
        // 任务id
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 数据Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 业务Id - 调用方透传
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 风险等级，根据设置的高低风险分返回，返回值包括： - high：高风险（若命中自定义词库，风险等级默认为高风险） - medium：中风险 - low：低风险 - none：未检测到风险
        /// <summary>
        /// <b>Example:</b>
        /// <para>high</para>
        /// </summary>
        [NameInMap("risk_level")]
        [Validation(Required=true)]
        public string RiskLevel { get; set; }

        // 审核标签列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;label&quot;:&quot;sex&quot;, &quot;probability&quot;:66.5, &quot;description&quot;:&quot;疑似色情内容&quot;, &quot;riskWords&quot;:&quot;AA,BB,CC&quot;}]</para>
        /// </summary>
        [NameInMap("labels")]
        [Validation(Required=true)]
        public List<AuditSyncLabel> Labels { get; set; }

    }

}
