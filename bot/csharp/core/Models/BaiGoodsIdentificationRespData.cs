// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 商品鉴定返回结果
    public class BaiGoodsIdentificationRespData : TeaModel {
        // 鉴定结果
        // REAL：鉴定为真
        // FAKE：鉴定为假
        // UNABLE_IDENTIFY：无法鉴定
        [NameInMap("identification_result")]
        [Validation(Required=true)]
        public string IdentificationResult { get; set; }

        // 整体鉴定分数
        [NameInMap("grade")]
        [Validation(Required=true)]
        public string Grade { get; set; }

        // 整体鉴定报告描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 鉴定点鉴定结果列表
        [NameInMap("point_identification_results")]
        [Validation(Required=true)]
        public List<BaiGoodsPointIdentificationResult> PointIdentificationResults { get; set; }

        // 鉴定评价
        [NameInMap("appraise_message")]
        [Validation(Required=false)]
        public string AppraiseMessage { get; set; }

        // 用户自定义字符串，系统不做处理，会在响应体中带回
        [NameInMap("out_state")]
        [Validation(Required=false)]
        public string OutState { get; set; }

    }

}
