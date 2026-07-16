// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 智能体二期-知识点信息
    public class KnowledgeInfo : TeaModel {
        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>UDFXXXXX</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 主键id
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>order</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 问题
        /// <summary>
        /// <b>Example:</b>
        /// <para>问题</para>
        /// </summary>
        [NameInMap("question")]
        [Validation(Required=false)]
        public string Question { get; set; }

        // 答案
        /// <summary>
        /// <b>Example:</b>
        /// <para>答案</para>
        /// </summary>
        [NameInMap("answer")]
        [Validation(Required=false)]
        public string Answer { get; set; }

        // 是否选择订单
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("has_order")]
        [Validation(Required=false)]
        public bool? HasOrder { get; set; }

        // 是否带小程序链接
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("has_app_link")]
        [Validation(Required=false)]
        public bool? HasAppLink { get; set; }

        // 是否转人工
        /// <summary>
        /// <b>Example:</b>
        /// <para>true,false</para>
        /// </summary>
        [NameInMap("has_manual")]
        [Validation(Required=false)]
        public bool? HasManual { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>状态</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 驳回原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>驳回原因</para>
        /// </summary>
        [NameInMap("refuse_reason")]
        [Validation(Required=false)]
        public string RefuseReason { get; set; }

    }

}
