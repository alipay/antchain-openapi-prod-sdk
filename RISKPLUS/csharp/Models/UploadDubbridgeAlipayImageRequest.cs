// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class UploadDubbridgeAlipayImageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // request请求单号，每次请求唯一，如uuid
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 门店Id
        [NameInMap("store_id")]
        [Validation(Required=true)]
        public string StoreId { get; set; }

        // 门店所属子品牌，
        // TBJHF: 赛鸽出行-
        // AIJNBJ: 智迈电动车
        // KJOKJBO: 金箭出行
        // IFJRJTIJ: 骑士智行
        // KVMPOH: 巨龙智行
        // NPGBRVBO: 摩生态A
        [NameInMap("traffic_platform")]
        [Validation(Required=true)]
        public string TrafficPlatform { get; set; }

        // 图片种类，
        // 10: 营业执照
        // 20: 门头照
        // 21: 内景照
        [NameInMap("image_category")]
        [Validation(Required=true)]
        public string ImageCategory { get; set; }

        // 文件base64字符串，最大10M
        [NameInMap("image_content")]
        [Validation(Required=false)]
        public string ImageContent { get; set; }

        // 图片文件路径，（建议），http、https为前缀
        [NameInMap("image_path")]
        [Validation(Required=false)]
        public string ImagePath { get; set; }

        // 图片格式，
        // 支持格式：bmp、jpg、jpeg、png、gif
        [NameInMap("image_type")]
        [Validation(Required=true)]
        public string ImageType { get; set; }

    }

}
