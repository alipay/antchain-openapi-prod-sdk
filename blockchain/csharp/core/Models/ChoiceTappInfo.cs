// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 数据隐私服务选择tapp信息的结构体
    public class ChoiceTappInfo : TeaModel {
        // 选择的tapp的名字
        [NameInMap("tapp_name")]
        [Validation(Required=true)]
        public string TappName { get; set; }

        // 版本号，如果不填就选择最新的版本
        [NameInMap("tapp_version")]
        [Validation(Required=false)]
        public long? TappVersion { get; set; }

        // 该tapp将被声明在did doc中的id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

    }

}
