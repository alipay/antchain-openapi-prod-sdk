// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 逆变器发电量
    public class InverterGeneration : TeaModel {
        // 逆变器SN
        /// <summary>
        /// <b>Example:</b>
        /// <para>Inv-Other-16801-Q0kll-2024-04-11</para>
        /// </summary>
        [NameInMap("inv_sn")]
        [Validation(Required=true)]
        public string InvSn { get; set; }

        // 生产商名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>生产商1</para>
        /// </summary>
        [NameInMap("manufacturer")]
        [Validation(Required=true)]
        public string Manufacturer { get; set; }

        // 当日发电量，最多3位小数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.232</para>
        /// </summary>
        [NameInMap("daily")]
        [Validation(Required=true)]
        public string Daily { get; set; }

        // 累计发电量，最多3位小数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.232</para>
        /// </summary>
        [NameInMap("total")]
        [Validation(Required=true)]
        public string Total { get; set; }

    }

}
