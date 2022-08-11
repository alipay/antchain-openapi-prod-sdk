// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4b3196fa612148cd8407b20f4e5ed132.Models
{
    // 个人
    public class Person : TeaModel {
        // 身份证地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 居民身份证号
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 证件类型,比如：ID_CARD=身份证
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 客户编号
        [NameInMap("cm_no")]
        [Validation(Required=false)]
        public string CmNo { get; set; }

        // 电子邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 证件反面照片oss存储路径
        [NameInMap("cert_back_pic_oss_key")]
        [Validation(Required=false)]
        public string CertBackPicOssKey { get; set; }

        // 证件正面照片OSS存储路径
        [NameInMap("cert_front_pic_oss_key")]
        [Validation(Required=false)]
        public string CertFrontPicOssKey { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 客户姓名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 身份证所在地邮编
        [NameInMap("post_code")]
        [Validation(Required=false)]
        public string PostCode { get; set; }

    }

}
