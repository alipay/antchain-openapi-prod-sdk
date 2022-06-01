// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 商品的鉴定点图片信息
    public class BaiGoodsPoint : TeaModel {
        // 鉴定点名称
        [NameInMap("point_name")]
        [Validation(Required=true)]
        public string PointName { get; set; }

        // 鉴定点子项
        [NameInMap("sub_point_name")]
        [Validation(Required=true)]
        public string SubPointName { get; set; }

        // 鉴定点图片的url
        [NameInMap("image_url")]
        [Validation(Required=false)]
        public string ImageUrl { get; set; }

        // 图片内容base64编码的字符串，该字段与image_url至少一个非空，同时传入以image_url为准
        [NameInMap("image_base64")]
        [Validation(Required=false)]
        public string ImageBase64 { get; set; }

        // 用户侧鉴定单关联id
        [NameInMap("user_point_id")]
        [Validation(Required=false)]
        public string UserPointId { get; set; }

    }

}
