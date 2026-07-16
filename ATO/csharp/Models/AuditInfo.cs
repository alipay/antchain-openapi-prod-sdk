// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 审核信息
    public class AuditInfo : TeaModel {
        // 审核步骤
        /// <summary>
        /// <b>Example:</b>
        /// <para>商户提交</para>
        /// </summary>
        [NameInMap("stage")]
        [Validation(Required=true)]
        public string Stage { get; set; }

        // 审核主体
        /// <summary>
        /// <b>Example:</b>
        /// <para>平台审核</para>
        /// </summary>
        [NameInMap("audit_subject")]
        [Validation(Required=true)]
        public string AuditSubject { get; set; }

        // 审核状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>AUDIT_PASSED</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 审核时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023-04-05 12:12:23</para>
        /// </summary>
        [NameInMap("apply_date_str")]
        [Validation(Required=true)]
        public string ApplyDateStr { get; set; }

        // 审核失败描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx值校验失败</para>
        /// </summary>
        [NameInMap("fail_reason")]
        [Validation(Required=true)]
        public string FailReason { get; set; }

    }

}
