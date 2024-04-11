// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 数字人形象设置
    public class ProfileInfo : TeaModel {
        // 数字人离画面位置坐标,可以为负数或者出画
        //  数字人在视频生成中的位置
        [NameInMap("x")]
        [Validation(Required=true)]
        public long? X { get; set; }

        // 数字人离画面位置坐标,可以为负数或者出画
        //  数字人在视频生成中的位置
        [NameInMap("y")]
        [Validation(Required=true)]
        public long? Y { get; set; }

        // 数字人视频大小,初始大小为训练素材整体大小非数字人在框选大小
        [NameInMap("w")]
        [Validation(Required=true)]
        public long? W { get; set; }

        // 数字人视频大小,初始大小为训练素材整体大小非数字人在框选大小
        [NameInMap("h")]
        [Validation(Required=true)]
        public long? H { get; set; }

        // 数字人视频大小缩放,实际大小为  scale*w   scale*h 
        [NameInMap("scale")]
        [Validation(Required=false)]
        public string Scale { get; set; }

    }

}
