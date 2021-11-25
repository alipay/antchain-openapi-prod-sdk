// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateUserCertRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 云蚂账户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public long? UserId { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 个人证件类型
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 证件号码
        [NameInMap("cert_num")]
        [Validation(Required=true)]
        public string CertNum { get; set; }

        // 个人证件正面图片文件id，应用侧fileId
        [NameInMap("cert_file_front")]
        [Validation(Required=true)]
        public long? CertFileFront { get; set; }

        // 个人证件正面类型。JPG
        [NameInMap("cert_file_front_type")]
        [Validation(Required=true)]
        public string CertFileFrontType { get; set; }

        // 个人证件反面图片文件id，应用侧fileId
        [NameInMap("cert_file_reverse")]
        [Validation(Required=true)]
        public long? CertFileReverse { get; set; }

        // 个人证件反面类型。JPG
        [NameInMap("cert_file_reverse_type")]
        [Validation(Required=true)]
        public string CertFileReverseType { get; set; }

    }

}
