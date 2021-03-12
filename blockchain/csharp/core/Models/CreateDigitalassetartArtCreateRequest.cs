// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDigitalassetartArtCreateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 艺术品锚定物
        [NameInMap("art_anchor")]
        [Validation(Required=true)]
        public string ArtAnchor { get; set; }

        // 艺术品唯一id
        [NameInMap("art_id")]
        [Validation(Required=true)]
        public string ArtId { get; set; }

        // 艺术品名称
        [NameInMap("art_name")]
        [Validation(Required=true)]
        public string ArtName { get; set; }

        // 艺术品代码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 创建时间
        [NameInMap("create_date")]
        [Validation(Required=true)]
        public string CreateDate { get; set; }

        // 鉴定者账户
        [NameInMap("identifiers")]
        [Validation(Required=true)]
        public List<string> Identifiers { get; set; }

        // 艺术品图片哈希
        [NameInMap("image_hashes")]
        [Validation(Required=true)]
        public List<string> ImageHashes { get; set; }

        // 一级分类
        [NameInMap("main_class")]
        [Validation(Required=true)]
        public string MainClass { get; set; }

        // 拥有者链上账户地址
        [NameInMap("owner_account_id")]
        [Validation(Required=true)]
        public string OwnerAccountId { get; set; }

        // 二级分类
        [NameInMap("sub_class")]
        [Validation(Required=true)]
        public string SubClass { get; set; }

        // 艺术品视频哈希
        [NameInMap("vedio_hashes")]
        [Validation(Required=true)]
        public List<string> VedioHashes { get; set; }

    }

}
