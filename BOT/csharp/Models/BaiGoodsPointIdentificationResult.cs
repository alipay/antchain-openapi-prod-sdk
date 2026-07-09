// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 商品单点鉴定结果
    public class BaiGoodsPointIdentificationResult : TeaModel {
        // 鉴定点大项名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>内包装</para>
        /// </summary>
        [NameInMap("point_name")]
        [Validation(Required=true)]
        public string PointName { get; set; }

        // 鉴定点子项名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>顶部</para>
        /// </summary>
        [NameInMap("sub_point_name")]
        [Validation(Required=true)]
        public string SubPointName { get; set; }

        // 单点鉴定结果
        // REAL：鉴定为真
        // FAKE：鉴定为假
        // UNABLE_IDENTIFY：无法鉴定
        /// <summary>
        /// <b>Example:</b>
        /// <para>REAL</para>
        /// </summary>
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 鉴定分数
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.92</para>
        /// </summary>
        [NameInMap("grade")]
        [Validation(Required=false)]
        public string Grade { get; set; }

        // 用户侧的鉴定点point_id，直接将用户传入的user_point_id返回
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("user_point_id")]
        [Validation(Required=false)]
        public string UserPointId { get; set; }

        // 鉴定评价
        /// <summary>
        /// <b>Example:</b>
        /// <para>完全同一，趋于同一，不同一</para>
        /// </summary>
        [NameInMap("appraise_message")]
        [Validation(Required=false)]
        public string AppraiseMessage { get; set; }

        // 鉴定点图片资源定位符
        [NameInMap("resource_location")]
        [Validation(Required=false)]
        public BaiResourceLocation ResourceLocation { get; set; }

    }

}
