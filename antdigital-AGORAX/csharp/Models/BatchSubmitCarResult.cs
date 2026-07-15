// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 批量提交结果
    public class BatchSubmitCarResult : TeaModel {
        // 提交线索唯一请求id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("submit_id")]
        [Validation(Required=true)]
        public string SubmitId { get; set; }

        // 是否成功
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_success")]
        [Validation(Required=true)]
        public bool? IsSuccess { get; set; }

        // OK
        // NO_DEMAND 无线索需求，需要重试
        // INVALID 无效，不要重试
        /// <summary>
        /// <b>Example:</b>
        /// <para>OK/INVALID/NO_DEMAND</para>
        /// </summary>
        [NameInMap("push_result_code")]
        [Validation(Required=true)]
        public string PushResultCode { get; set; }

    }

}
