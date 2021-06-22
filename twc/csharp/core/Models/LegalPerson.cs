// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 当被申请人为法人
    public class LegalPerson : TeaModel {
        // 被申请人姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 法人统一社会信用编码
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 法定代表人姓名
        [NameInMap("representative_name")]
        [Validation(Required=false)]
        public string RepresentativeName { get; set; }

        // 联系方式
        [NameInMap("legal_phone_number")]
        [Validation(Required=false)]
        public string LegalPhoneNumber { get; set; }

        // 住所地（同营业执照地址）
        [NameInMap("legal_address")]
        [Validation(Required=false)]
        public string LegalAddress { get; set; }

        // 企业经营地址
        [NameInMap("legal_business_address")]
        [Validation(Required=false)]
        public string LegalBusinessAddress { get; set; }

        // 营业执照照片
        // 文件信息列表（先调用接口获取上传url和fileKey）
        [NameInMap("legal_id_number_file")]
        [Validation(Required=false)]
        public List<FileInfo> LegalIdNumberFile { get; set; }

    }

}
