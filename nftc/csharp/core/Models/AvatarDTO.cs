// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    // 数字人整体形象
    public class AvatarDTO : TeaModel {
        // 数字人基础脸部模型
        [NameInMap("avatar_face_url")]
        [Validation(Required=true)]
        public string AvatarFaceUrl { get; set; }

        // 数字人基础脸部Json配置
        [NameInMap("avatar_face_json")]
        [Validation(Required=true)]
        public string AvatarFaceJson { get; set; }

        // 上衣配置
        [NameInMap("upcloth")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Upcloth { get; set; }

        // 下衣配置
        [NameInMap("downcloth")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Downcloth { get; set; }

        // 鞋子配置
        [NameInMap("shoe")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Shoe { get; set; }

        // 套装配置
        [NameInMap("suit")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Suit { get; set; }

        // 项链配置
        [NameInMap("necklace")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Necklace { get; set; }

        // 帽子配置
        [NameInMap("hat")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Hat { get; set; }

        // 眼镜配置
        [NameInMap("glass")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Glass { get; set; }

        // 头发配置
        [NameInMap("hair")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Hair { get; set; }

        // 脸型配置
        [NameInMap("head")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Head { get; set; }

        // 眉毛配置
        [NameInMap("eyebrow")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Eyebrow { get; set; }

        // 眼睛配置
        [NameInMap("eye")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Eye { get; set; }

        // 嘴巴配置
        [NameInMap("lip")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Lip { get; set; }

        // 鼻子配置
        [NameInMap("nose")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Nose { get; set; }

        // 腮红配置
        [NameInMap("rouge")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Rouge { get; set; }

        // 美瞳配置
        [NameInMap("lens")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Lens { get; set; }

        // 睫毛配置
        [NameInMap("eyelash")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Eyelash { get; set; }

        // 唇妆配置
        [NameInMap("lipstick")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Lipstick { get; set; }

        // 眼线配置
        [NameInMap("eyeliner")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Eyeliner { get; set; }

        // 眼影配置
        [NameInMap("eyeshadow")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Eyeshadow { get; set; }

        // webgl ab包链接
        [NameInMap("avatar_web_gl_unity_body_url")]
        [Validation(Required=true)]
        public string AvatarWebGlUnityBodyUrl { get; set; }

        // ios ab包链接
        [NameInMap("avatar_ios_unity_body_url")]
        [Validation(Required=true)]
        public string AvatarIosUnityBodyUrl { get; set; }

        // android ab包链接
        [NameInMap("avatar_android_unity_body_url")]
        [Validation(Required=true)]
        public string AvatarAndroidUnityBodyUrl { get; set; }

        // 默认Unity配置
        [NameInMap("default_unity_config")]
        [Validation(Required=true)]
        public string DefaultUnityConfig { get; set; }

        // 袜子配置
        [NameInMap("sock")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Sock { get; set; }

        // 背持配置
        [NameInMap("backpack")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Backpack { get; set; }

        // 手部配置
        [NameInMap("hand")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Hand { get; set; }

        // 耳环配置
        [NameInMap("earring")]
        [Validation(Required=true)]
        public AvatarMaterialDTO Earring { get; set; }

    }

}
