// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 用户签署信息
    public class SignUserInfo : TeaModel {
        // 身份证号
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 签署区列表
        [NameInMap("sign_area_list")]
        [Validation(Required=true)]
        public List<SignatoryInfo> SignAreaList { get; set; }

    }

}
