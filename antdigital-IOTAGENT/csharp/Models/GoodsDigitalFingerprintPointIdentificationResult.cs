// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 商品数字指纹子鉴定项鉴定结果
    public class GoodsDigitalFingerprintPointIdentificationResult : TeaModel {
        // 子鉴定项
        /// <summary>
        /// <b>Example:</b>
        /// <para>子鉴定项</para>
        /// </summary>
        [NameInMap("sub_point_name")]
        [Validation(Required=true)]
        public string SubPointName { get; set; }

        // 商品数字指纹鉴定子项鉴定结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>REAL</para>
        /// </summary>
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 鉴定子项鉴定得分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.92</para>
        /// </summary>
        [NameInMap("grade")]
        [Validation(Required=true)]
        public string Grade { get; set; }

    }

}
