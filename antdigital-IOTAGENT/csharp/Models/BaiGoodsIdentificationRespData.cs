// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 商品鉴定返回结果
    public class BaiGoodsIdentificationRespData : TeaModel {
        // 鉴定结果
        // REAL：鉴定为真
        // FAKE：鉴定为假
        // UNABLE_IDENTIFY：无法鉴定
        /// <summary>
        /// <b>Example:</b>
        /// <para>REAL</para>
        /// </summary>
        [NameInMap("identification_result")]
        [Validation(Required=true)]
        public string IdentificationResult { get; set; }

        // 整体鉴定分数
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.99</para>
        /// </summary>
        [NameInMap("grade")]
        [Validation(Required=true)]
        public string Grade { get; set; }

        // 整体鉴定报告描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>AI鉴定成功</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 鉴定点鉴定结果列表
        [NameInMap("point_identification_results")]
        [Validation(Required=true)]
        public List<BaiGoodsPointIdentificationResult> PointIdentificationResults { get; set; }

        // 鉴定评价
        /// <summary>
        /// <b>Example:</b>
        /// <para>完全同一，趋于同一，和不同一</para>
        /// </summary>
        [NameInMap("appraise_message")]
        [Validation(Required=false)]
        public string AppraiseMessage { get; set; }

        // 用户自定义字符串，系统不做处理，会在响应体中带回
        /// <summary>
        /// <b>Example:</b>
        /// <para>state</para>
        /// </summary>
        [NameInMap("out_state")]
        [Validation(Required=false)]
        public string OutState { get; set; }

    }

}
