// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 过程详情
    public class ProcessDetail : TeaModel {
        // 单元过程名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("process_name")]
        [Validation(Required=false)]
        public string ProcessName { get; set; }

        // 过程编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("process_no")]
        [Validation(Required=false)]
        public string ProcessNo { get; set; }

    }

}
