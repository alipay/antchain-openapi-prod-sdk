// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class AddRegisterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文件oss id
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 是否自动创建公证书,默认否
        [NameInMap("create_certificate")]
        [Validation(Required=false)]
        public bool? CreateCertificate { get; set; }

        // 证书类型
        [NameInMap("certificate_type")]
        [Validation(Required=false)]
        public string CertificateType { get; set; }

        // 是否创建证据包，默认否
        [NameInMap("create_package")]
        [Validation(Required=false)]
        public bool? CreatePackage { get; set; }

        // 公证处id
        [NameInMap("org_id")]
        [Validation(Required=false)]
        public string OrgId { get; set; }

        // 文件名称
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=128)]
        public string Name { get; set; }

        // 文件类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 备注
        [NameInMap("memo")]
        [Validation(Required=false, MaxLength=512)]
        public string Memo { get; set; }

        // 证件名称
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 证件号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 证件类型
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 电话号码
        [NameInMap("phone_num")]
        [Validation(Required=false)]
        public string PhoneNum { get; set; }

        // 幂等
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

        // 代理信息
        [NameInMap("proxy_info")]
        [Validation(Required=false)]
        public ProxyData ProxyInfo { get; set; }

        // 同步账号信息
        [NameInMap("sync_info")]
        [Validation(Required=false)]
        public AccountData SyncInfo { get; set; }

    }

}
