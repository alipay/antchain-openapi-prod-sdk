// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class AddDciUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 用户类型
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 证件类型
        [NameInMap("certificate_type")]
        [Validation(Required=true)]
        public string CertificateType { get; set; }

        // 证件号
        [NameInMap("certificate_number")]
        [Validation(Required=true)]
        public string CertificateNumber { get; set; }

        // 证件有效期限起始日期
        [NameInMap("certificate_start_time")]
        [Validation(Required=false)]
        public string CertificateStartTime { get; set; }

        // 证件有效期限终止日期
        [NameInMap("certificate_end_time")]
        [Validation(Required=false)]
        public string CertificateEndTime { get; set; }

        // 证件正面OSS filePath
        [NameInMap("certificate_front_file_path")]
        [Validation(Required=true)]
        public string CertificateFrontFilePath { get; set; }

        // 证件反面OSS filePath
        [NameInMap("certificate_back_file_path")]
        [Validation(Required=false)]
        public string CertificateBackFilePath { get; set; }

        // 手机号
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 用户身份开始时间
        [NameInMap("identity_start_time")]
        [Validation(Required=true)]
        public string IdentityStartTime { get; set; }

        // 所属地区
        [NameInMap("area_type")]
        [Validation(Required=true)]
        public string AreaType { get; set; }

        // 代理信息
        [NameInMap("proxy_data")]
        [Validation(Required=true)]
        public ProxyData ProxyData { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

    }

}
