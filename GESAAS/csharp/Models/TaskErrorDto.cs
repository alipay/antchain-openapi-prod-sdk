// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 任务错误信息
    public class TaskErrorDto : TeaModel {
        // 错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>402</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 错误提示信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>未知异常</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
