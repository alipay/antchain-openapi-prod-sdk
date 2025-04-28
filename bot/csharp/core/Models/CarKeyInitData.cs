// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 凭证申请接口返回参数
    public class CarKeyInitData : TeaModel {
        // IIFFAA 根密钥
        [NameInMap("root_pub_key")]
        [Validation(Required=true)]
        public string RootPubKey { get; set; }

        // IIFAA 设备唯一ID
        [NameInMap("tuid")]
        [Validation(Required=true)]
        public string Tuid { get; set; }

        // 业务密钥
        [NameInMap("biz_priv_key")]
        [Validation(Required=true)]
        public string BizPrivKey { get; set; }

        // 设备唯一密钥
        [NameInMap("device_priv_key")]
        [Validation(Required=true)]
        public string DevicePrivKey { get; set; }

        // 无感空车凭证
        [NameInMap("key_less_authy")]
        [Validation(Required=true)]
        public string KeyLessAuthy { get; set; }

    }

}
