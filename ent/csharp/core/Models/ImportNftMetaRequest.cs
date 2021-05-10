// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class ImportNftMetaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 在外部渠道的全局唯一id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // nft资产标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 缩略图OSS文件名
        [NameInMap("mini_image_url")]
        [Validation(Required=true)]
        public string MiniImageUrl { get; set; }

        // 原图地址
        [NameInMap("origin_image_url")]
        [Validation(Required=true)]
        public string OriginImageUrl { get; set; }

        // 创作者
        [NameInMap("author")]
        [Validation(Required=true)]
        public string Author { get; set; }

        // 作品简介信息文字描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 商品详情页url
        [NameInMap("item_url")]
        [Validation(Required=true)]
        public string ItemUrl { get; set; }

        // 资产发行时间
        [NameInMap("publish_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PublishTime { get; set; }

    }

}
