// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // InitPack
    public class InitPack : TeaModel {
        // 2022-11-07 14:48
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022-11-07 14:48</para>
        /// </summary>
        [NameInMap("time")]
        [Validation(Required=false)]
        public string Time { get; set; }

        // wanyi
        /// <summary>
        /// <b>Example:</b>
        /// <para>wanyi</para>
        /// </summary>
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 1
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

    }

}
