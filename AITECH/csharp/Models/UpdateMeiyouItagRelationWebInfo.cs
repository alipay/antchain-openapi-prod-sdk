// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 更新美柚itag关系信息
    public class UpdateMeiyouItagRelationWebInfo : TeaModel {
        // 主键id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 审核记录ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("audit_id")]
        [Validation(Required=false)]
        public string AuditId { get; set; }

        // itag数据ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("itag_data_id")]
        [Validation(Required=false)]
        public long? ItagDataId { get; set; }

        // 美柚任务审核结果推送状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>INIT</para>
        /// </summary>
        [NameInMap("meiyou_audit_state")]
        [Validation(Required=false)]
        public string MeiyouAuditState { get; set; }

        // 审核不通过原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>34</para>
        /// </summary>
        [NameInMap("refuse_reson")]
        [Validation(Required=false)]
        public string RefuseReson { get; set; }

        // 审核不通过图片序号
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;1&quot;,&quot;2&quot;]</para>
        /// </summary>
        [NameInMap("refuse_images")]
        [Validation(Required=false)]
        public string RefuseImages { get; set; }

        // 美柚itag关联状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("audit_state")]
        [Validation(Required=false)]
        public string AuditState { get; set; }

        // 美柚itag关联状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("topic_state")]
        [Validation(Required=false)]
        public string TopicState { get; set; }

        // 审核结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("audit_result")]
        [Validation(Required=false)]
        public string AuditResult { get; set; }

        // 审核人员
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("audit_user")]
        [Validation(Required=false)]
        public string AuditUser { get; set; }

        // 审核时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("audit_time")]
        [Validation(Required=false)]
        public long? AuditTime { get; set; }

    }

}
