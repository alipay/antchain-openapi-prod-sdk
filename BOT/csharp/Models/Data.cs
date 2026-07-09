// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // provision数据
    public class Data : TeaModel {
        // provision数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>123XXX</para>
        /// </summary>
        [NameInMap("provision_data")]
        [Validation(Required=true)]
        public string ProvisionData { get; set; }

        // 余量
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("remaining")]
        [Validation(Required=false)]
        public long? Remaining { get; set; }

    }

}
