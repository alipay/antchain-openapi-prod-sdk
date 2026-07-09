// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateSdkRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 主键id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 设备SDK公钥
        [NameInMap("verify_key")]
        [Validation(Required=false)]
        public string VerifyKey { get; set; }

        // SDK版本号
        [NameInMap("sdk_version_str")]
        [Validation(Required=false)]
        public string SdkVersionStr { get; set; }

        // sdk模型，格式为json
        [NameInMap("meta_model")]
        [Validation(Required=false)]
        public string MetaModel { get; set; }

        // 平台
        [NameInMap("platform")]
        [Validation(Required=false)]
        public string Platform { get; set; }

        // 公司名称
        // 
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

    }

}
