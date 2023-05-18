// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class PublishMerchantDiyskuRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务请求id，用来做业务上的幂等。后面查询状态也是此字段
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 调用渠道
        // PET 宠物
        // MEMBER 会员
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 领取数字藏品的用户ID，支持2088/手机号/1322
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 支付宝2088账号：ALIPAY_UID
        // 手机号：PHONE_NO
        // 鲸探1322账号：FANS_UID
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 需要发放的SKUID编码
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public string SkuId { get; set; }

        // 一期仅支持图片：IMAGE
        [NameInMap("sku_type")]
        [Validation(Required=true)]
        public string SkuType { get; set; }

        // 数字藏品的缩略图地址，可与原图相同也可不同，需要校验长宽比为1:1
        [NameInMap("thumbnail_url")]
        [Validation(Required=true)]
        public string ThumbnailUrl { get; set; }

        // 数字藏品的原图地址，需要校验长宽比为1:1
        [NameInMap("original_url")]
        [Validation(Required=true)]
        public string OriginalUrl { get; set; }

    }

}
