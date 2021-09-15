// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 答辩人为自然人对象
    public class NaturalPerson : TeaModel {
        // 自然人姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 自然人手机号码
        [NameInMap("mobile_number")]
        [Validation(Required=true)]
        public string MobileNumber { get; set; }

        // 自然人身份号码
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 自然人民族
        [NameInMap("nation")]
        [Validation(Required=false)]
        public string Nation { get; set; }

        // 自然人身份地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 自然人电子邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 自然人身份证正反面照片
        // 文件信息 列表（先调用接口获取上传url和fileKey）
        [NameInMap("id_number_file")]
        [Validation(Required=false)]
        public List<FileInfo> IdNumberFile { get; set; }

    }

}
