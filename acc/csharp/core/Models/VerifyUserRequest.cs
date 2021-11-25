// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class VerifyUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 账号id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public long? UserId { get; set; }

        // 个人名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 证件类型
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 证件号码
        [NameInMap("cert_num")]
        [Validation(Required=true)]
        public string CertNum { get; set; }

        // 个人证件正面图片,osskey值
        // 
        [NameInMap("cert_file_front_id")]
        [Validation(Required=false)]
        public string CertFileFrontId { get; set; }

        // 个人证件反面图片,oss的key值
        [NameInMap("cert_file_reverse_id")]
        [Validation(Required=false)]
        public string CertFileReverseId { get; set; }

        // JPG
        [NameInMap("cert_file_front_type")]
        [Validation(Required=false)]
        public string CertFileFrontType { get; set; }

        // 个人证件文件反面，文件类型
        [NameInMap("cert_file_reverse_type")]
        [Validation(Required=false)]
        public string CertFileReverseType { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

    }

}
