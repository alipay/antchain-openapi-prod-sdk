// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 编码
    public class Cmd : TeaModel {
        // cmd编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>SC-RealEstate-Query</para>
        /// </summary>
        [NameInMap("cmd_code")]
        [Validation(Required=true)]
        public string CmdCode { get; set; }

        // 版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>test_d19bd9d59915</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

    }

}
