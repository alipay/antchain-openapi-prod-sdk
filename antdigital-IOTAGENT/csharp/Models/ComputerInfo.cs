// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 电脑型号信息
    public class ComputerInfo : TeaModel {
        // 颜色
        /// <summary>
        /// <b>Example:</b>
        /// <para>红色</para>
        /// </summary>
        [NameInMap("colour")]
        [Validation(Required=false)]
        public string Colour { get; set; }

        // 色值
        /// <summary>
        /// <b>Example:</b>
        /// <para>#BA0F2F</para>
        /// </summary>
        [NameInMap("colour_number")]
        [Validation(Required=false)]
        public string ColourNumber { get; set; }

        // 电脑型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>X100</para>
        /// </summary>
        [NameInMap("computer_model")]
        [Validation(Required=false)]
        public string ComputerModel { get; set; }

        // 配置参数
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;&quot;}</para>
        /// </summary>
        [NameInMap("config_param")]
        [Validation(Required=false)]
        public string ConfigParam { get; set; }

        // 显卡
        /// <summary>
        /// <b>Example:</b>
        /// <para>GTX3080</para>
        /// </summary>
        [NameInMap("video_card")]
        [Validation(Required=false)]
        public string VideoCard { get; set; }

        // 屏幕
        /// <summary>
        /// <b>Example:</b>
        /// <para>27</para>
        /// </summary>
        [NameInMap("screen_size")]
        [Validation(Required=false)]
        public string ScreenSize { get; set; }

        // 电脑CPU
        /// <summary>
        /// <b>Example:</b>
        /// <para>i9</para>
        /// </summary>
        [NameInMap("cpu")]
        [Validation(Required=true)]
        public string Cpu { get; set; }

        // 电脑内存
        /// <summary>
        /// <b>Example:</b>
        /// <para>16GB</para>
        /// </summary>
        [NameInMap("memory")]
        [Validation(Required=true)]
        public string Memory { get; set; }

        // 电脑硬盘
        /// <summary>
        /// <b>Example:</b>
        /// <para>500GB</para>
        /// </summary>
        [NameInMap("disk_size")]
        [Validation(Required=true)]
        public string DiskSize { get; set; }

    }

}
