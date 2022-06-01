// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 商品鉴定点检测接口响应数据
    public class BaiGoodsPointCheckRespData : TeaModel {
        // 图片是否有效，无效则需要提示重拍
        [NameInMap("valid")]
        [Validation(Required=true)]
        public bool? Valid { get; set; }

    }

}
