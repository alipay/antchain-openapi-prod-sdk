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
        [NameInMap("point_name")]
        [Validation(Required=true)]
        public string PointName { get; set; }

        // 鉴定点子项名称
        [NameInMap("sub_point_name")]
        [Validation(Required=true)]
        public string SubPointName { get; set; }

        // 单点鉴定结果
        // REAL：鉴定为真
        // FAKE：鉴定为假
        // UNABLE_IDENTIFY：无法鉴定
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 鉴定分数
        [NameInMap("grade")]
        [Validation(Required=false)]
        public string Grade { get; set; }

        // 用户侧的鉴定点point_id，直接将用户传入的user_point_id返回
        [NameInMap("user_point_id")]
        [Validation(Required=false)]
        public string UserPointId { get; set; }

    }

}
