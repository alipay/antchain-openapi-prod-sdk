// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 电脑型号信息
    public class ComputerInfo : TeaModel {
        // 颜色
        [NameInMap("colour")]
        [Validation(Required=false)]
        public string Colour { get; set; }

        // 色值
        [NameInMap("colour_number")]
        [Validation(Required=false)]
        public string ColourNumber { get; set; }

        // 电脑型号
        [NameInMap("computer_model")]
        [Validation(Required=false)]
        public string ComputerModel { get; set; }

        // 配置参数
        [NameInMap("config_param")]
        [Validation(Required=false)]
        public string ConfigParam { get; set; }

        // 显卡
        [NameInMap("video_card")]
        [Validation(Required=false)]
        public string VideoCard { get; set; }

        // 屏幕
        [NameInMap("screen_size")]
        [Validation(Required=false)]
        public string ScreenSize { get; set; }

        // 电脑CPU
        [NameInMap("cpu")]
        [Validation(Required=true)]
        public string Cpu { get; set; }

        // 电脑内存
        [NameInMap("memory")]
        [Validation(Required=true)]
        public string Memory { get; set; }

        // 电脑硬盘
        [NameInMap("disk_size")]
        [Validation(Required=true)]
        public string DiskSize { get; set; }

    }

}
