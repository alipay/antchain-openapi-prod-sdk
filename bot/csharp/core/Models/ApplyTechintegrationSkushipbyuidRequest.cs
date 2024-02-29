// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ApplyTechintegrationSkushipbyuidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品名称
        [NameInMap("sku_name")]
        [Validation(Required=true)]
        public string SkuName { get; set; }

        // 产品型号
        [NameInMap("sku_model")]
        [Validation(Required=true)]
        public string SkuModel { get; set; }

        // 产品类型
        [NameInMap("product_type")]
        [Validation(Required=true)]
        public string ProductType { get; set; }

        // 安全方案
        // 
        [NameInMap("security_mechanism")]
        [Validation(Required=true)]
        public string SecurityMechanism { get; set; }

        // 证书类型
        // 
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 凭证种类
        // 
        [NameInMap("features")]
        [Validation(Required=true)]
        public List<string> Features { get; set; }

        // 设备唯一编码类型
        [NameInMap("uid_type")]
        [Validation(Required=true)]
        public string UidType { get; set; }

        // 设备唯一编码值
        [NameInMap("uid")]
        [Validation(Required=true)]
        public string Uid { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

    }

}
