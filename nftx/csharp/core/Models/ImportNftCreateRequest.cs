// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class ImportNftCreateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 对端自己的项目id；用作幂等字段
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // NFT艺术品的名称
        [NameInMap("sku_name")]
        [Validation(Required=true)]
        public string SkuName { get; set; }

        // IMAGE("IMAGE","图片"),
        // VIDEO("VIDEO","视频"),
        // ;
        [NameInMap("sku_type")]
        [Validation(Required=true)]
        public string SkuType { get; set; }

        // 发行数量
        [NameInMap("quantity")]
        [Validation(Required=true)]
        public long? Quantity { get; set; }

        // 艺术品作者
        [NameInMap("author")]
        [Validation(Required=true)]
        public string Author { get; set; }

        // 艺术品拥有者
        [NameInMap("owner")]
        [Validation(Required=true)]
        public string Owner { get; set; }

        // 艺术品创作时间
        [NameInMap("creation_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreationTime { get; set; }

        // 用于标识NFT资产来自特定的产品，用作特殊的交互跳转需求，非必填字段
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // nft简介信息
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 跳转链接
        [NameInMap("jump_url")]
        [Validation(Required=false)]
        public string JumpUrl { get; set; }

        // nft发行的艺术品文件
        [NameInMap("files")]
        [Validation(Required=true)]
        public List<File> Files { get; set; }

    }

}
