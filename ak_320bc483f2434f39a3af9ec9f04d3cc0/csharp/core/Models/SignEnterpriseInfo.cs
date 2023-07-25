// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 签约企业信息
    public class SignEnterpriseInfo : TeaModel {
        // 公司名称
        [NameInMap("organization_name")]
        [Validation(Required=true)]
        public string OrganizationName { get; set; }

        // 社会统一信用代码
        [NameInMap("uscc")]
        [Validation(Required=true)]
        public string Uscc { get; set; }

        // 法人姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 法人身份证号码
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 签署模式0、自动签署1、手动签署（用户只能手动）
        // 
        [NameInMap("sign_type")]
        [Validation(Required=true)]
        public long? SignType { get; set; }

        // 签署区列表
        [NameInMap("sign_area_list")]
        [Validation(Required=true)]
        public List<SignatoryInfo> SignAreaList { get; set; }

    }

}
