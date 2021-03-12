// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云区块链配置信息
    public class ALiYunChainConfigOption : TeaModel {
        // config_option
        [NameInMap("config_option")]
        [Validation(Required=false)]
        public string ConfigOption { get; set; }

        // show_name
        [NameInMap("show_name")]
        [Validation(Required=false)]
        public string ShowName { get; set; }

        // enable
        [NameInMap("enable")]
        [Validation(Required=false)]
        public bool? Enable { get; set; }

    }

}
