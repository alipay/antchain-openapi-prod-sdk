// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 数字人形象
    public class AvatarProfile : TeaModel {
        // 190087
        [NameInMap("avatar_id")]
        [Validation(Required=true)]
        public string AvatarId { get; set; }

        // 数字人形象名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // CUSTOM---定制；
        // PRESET---预置
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 位置信息等配置信息
        [NameInMap("conf")]
        [Validation(Required=false)]
        public string Conf { get; set; }

        // 数字人形象图片
        [NameInMap("pic_url")]
        [Validation(Required=true)]
        public string PicUrl { get; set; }

        // 背景图片地址
        [NameInMap("bg_url")]
        [Validation(Required=false)]
        public string BgUrl { get; set; }

    }

}
