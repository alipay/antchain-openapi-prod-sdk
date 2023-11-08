// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    // 数字人部件素材对象
    public class AvatarMaterialDTO : TeaModel {
        // 装扮id
        [NameInMap("deco_id")]
        [Validation(Required=true)]
        public string DecoId { get; set; }

        // 装扮名称
        [NameInMap("deco_name")]
        [Validation(Required=true)]
        public string DecoName { get; set; }

        // IOS ab包地址
        [NameInMap("ios_ab_url")]
        [Validation(Required=true)]
        public string IosAbUrl { get; set; }

        // Android ab包地址
        [NameInMap("android_ab_url")]
        [Validation(Required=true)]
        public string AndroidAbUrl { get; set; }

        // json配置
        [NameInMap("json")]
        [Validation(Required=true)]
        public string Json { get; set; }

        // 贴图文件配置
        [NameInMap("texture_url")]
        [Validation(Required=true)]
        public string TextureUrl { get; set; }

        // 缩略图
        [NameInMap("thumbnail")]
        [Validation(Required=true)]
        public string Thumbnail { get; set; }

        // json字符串，装扮额外属性信息
        // 如自定义头发颜色，性别等
        [NameInMap("avatar_pv_json")]
        [Validation(Required=true)]
        public string AvatarPvJson { get; set; }

    }

}
