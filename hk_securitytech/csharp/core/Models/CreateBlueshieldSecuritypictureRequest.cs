// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    public class CreateBlueshieldSecuritypictureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名
        // 
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 客户名
        // 
        [NameInMap("client_name")]
        [Validation(Required=true)]
        public string ClientName { get; set; }

        // 操作系统
        // 
        [NameInMap("os_type")]
        [Validation(Required=true)]
        public string OsType { get; set; }

        // 包名
        // 
        [NameInMap("package_name")]
        [Validation(Required=true)]
        public string PackageName { get; set; }

        // 签名信息
        // 
        [NameInMap("cert_sign")]
        [Validation(Required=false)]
        public string CertSign { get; set; }

        // 签名秘钥内容
        // 
        [NameInMap("app_key_data")]
        [Validation(Required=false)]
        public string AppKeyData { get; set; }

        // 加密秘钥内容
        // 
        [NameInMap("security_data")]
        [Validation(Required=false)]
        public string SecurityData { get; set; }

        // 自定义秘钥内容
        // 
        [NameInMap("extra_data")]
        [Validation(Required=false)]
        public string ExtraData { get; set; }

        // 白盒秘钥内容
        // 
        [NameInMap("white_box_data")]
        [Validation(Required=false)]
        public string WhiteBoxData { get; set; }

    }

}
