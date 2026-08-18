// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PushElectrocarAipanelskinRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // ekyt设备唯一标识
        [NameInMap("tuid")]
        [Validation(Required=true)]
        public string Tuid { get; set; }

        // 皮肤id
        [NameInMap("skin_id")]
        [Validation(Required=true)]
        public long? SkinId { get; set; }

        // 皮肤名称
        [NameInMap("skin_name")]
        [Validation(Required=true)]
        public string SkinName { get; set; }

        // 0 全量、1 背景图、2 开关机动画、3 电子宠物动画
        [NameInMap("skin_type")]
        [Validation(Required=true)]
        public long? SkinType { get; set; }

        // 皮肤版本号
        [NameInMap("skin_ver")]
        [Validation(Required=true)]
        public long? SkinVer { get; set; }

        // 文件大小，单位字节
        [NameInMap("skin_size")]
        [Validation(Required=true)]
        public long? SkinSize { get; set; }

        // 是	目标屏幕宽高
        [NameInMap("screen_w")]
        [Validation(Required=true)]
        public long? ScreenW { get; set; }

        // 目标屏幕高
        [NameInMap("screen_h")]
        [Validation(Required=true)]
        public long? ScreenH { get; set; }

        // 格式版本
        [NameInMap("format_ver")]
        [Validation(Required=false)]
        public long? FormatVer { get; set; }

        // 打包皮肤url地址
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 可选扩展字段
        [NameInMap("ext")]
        [Validation(Required=false)]
        public string Ext { get; set; }

    }

}
