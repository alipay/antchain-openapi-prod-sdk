// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 商品数字指纹鉴定结果
    public class GoodsDigitalFingerprintIdentifyResultData : TeaModel {
        // 鉴定结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>REAL</para>
        /// </summary>
        [NameInMap("identification_result")]
        [Validation(Required=true)]
        public string IdentificationResult { get; set; }

        // 鉴定结果描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>描述</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 商品数字指纹鉴定点鉴定结果列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;sub_point_name&quot;:&quot;正面&quot;,&quot;result&quot;:&quot;REAL&quot;,&quot;grade&quot;:&quot;0.92&quot;}</para>
        /// </summary>
        [NameInMap("point_identification_results")]
        [Validation(Required=true)]
        public List<GoodsDigitalFingerprintPointIdentificationResult> PointIdentificationResults { get; set; }

    }

}
