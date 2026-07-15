// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云区块链配置信息
    public class ALiYunChainConfigOption : TeaModel {
        // config_option
        /// <summary>
        /// <b>Example:</b>
        /// <para>config_option</para>
        /// </summary>
        [NameInMap("config_option")]
        [Validation(Required=false)]
        public string ConfigOption { get; set; }

        // show_name
        /// <summary>
        /// <b>Example:</b>
        /// <para>show_name</para>
        /// </summary>
        [NameInMap("show_name")]
        [Validation(Required=false)]
        public string ShowName { get; set; }

        // enable
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("enable")]
        [Validation(Required=false)]
        public bool? Enable { get; set; }

    }

}
