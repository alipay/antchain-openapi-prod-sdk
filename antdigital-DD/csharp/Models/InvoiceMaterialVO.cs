// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票介质
    public class InvoiceMaterialVO : TeaModel {
        // 发票介质，01: 电子发票; 02: 纸质发票
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("material")]
        [Validation(Required=true)]
        public string Material { get; set; }

        // 名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>电子发票</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
