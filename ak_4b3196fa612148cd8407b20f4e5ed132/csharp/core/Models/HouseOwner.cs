// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4b3196fa612148cd8407b20f4e5ed132.Models
{
    // 产权人
    public class HouseOwner : TeaModel {
        // 姓名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 证件类型
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 证件号
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 身份证正面照片存储路径
        [NameInMap("cert_front_pic_oss_key")]
        [Validation(Required=false)]
        public string CertFrontPicOssKey { get; set; }

        // 身份证反面照片存储路径
        [NameInMap("cert_back_pic_oss_key")]
        [Validation(Required=false)]
        public string CertBackPicOssKey { get; set; }

        // 权利人主体类型，PERSON=个人
        [NameInMap("obligee_type")]
        [Validation(Required=false)]
        public string ObligeeType { get; set; }

        // 权利人类型
        [NameInMap("obligee_role")]
        [Validation(Required=false)]
        public string ObligeeRole { get; set; }

        // 共有情况
        [NameInMap("ownership_status")]
        [Validation(Required=false)]
        public string OwnershipStatus { get; set; }

        // 权证类型
        [NameInMap("house_cert_type")]
        [Validation(Required=false)]
        public string HouseCertType { get; set; }

        // 权证号
        [NameInMap("house_cert_no")]
        [Validation(Required=false)]
        public string HouseCertNo { get; set; }

        // 权利比例
        [NameInMap("rights_rate")]
        [Validation(Required=false)]
        public string RightsRate { get; set; }

        // 房产链内部客户编号
        [NameInMap("cm_no")]
        [Validation(Required=false)]
        public string CmNo { get; set; }

        // 房产链内部房产编号
        [NameInMap("house_no")]
        [Validation(Required=false)]
        public string HouseNo { get; set; }

    }

}
