// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 1
    public class CardInfo : TeaModel {
        // 1233
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("persion_info")]
        [Validation(Required=false)]
        public Person PersionInfo { get; set; }

        // 12
        /// <summary>
        /// <b>Example:</b>
        /// <para>12345</para>
        /// </summary>
        [NameInMap("id_card")]
        [Validation(Required=false)]
        public string IdCard { get; set; }

    }

}
