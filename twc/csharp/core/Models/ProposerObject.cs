// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 发起人对象
    public class ProposerObject : TeaModel {
        // 申请人姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 统一社会信用代码
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 联系电话
        [NameInMap("phone_number")]
        [Validation(Required=false)]
        public string PhoneNumber { get; set; }

        // 电子邮箱地址
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 经营地址
        [NameInMap("business_address")]
        [Validation(Required=false)]
        public string BusinessAddress { get; set; }

        // 营业执照照片
        // 文件信息 列表
        [NameInMap("id_number_file")]
        [Validation(Required=false)]
        public List<FileInfo> IdNumberFile { get; set; }

        // 法定代表人姓名
        [NameInMap("representative_name")]
        [Validation(Required=false)]
        public string RepresentativeName { get; set; }

        // 法定代表人性别
        // 0: 男 1: 女
        [NameInMap("representative_sex")]
        [Validation(Required=false)]
        public long? RepresentativeSex { get; set; }

        // 法定代表人身份证号码
        [NameInMap("representative_id_number")]
        [Validation(Required=false)]
        public string RepresentativeIdNumber { get; set; }

        // 法定代表人手机号码
        [NameInMap("representative_mobile_number")]
        [Validation(Required=false)]
        public string RepresentativeMobileNumber { get; set; }

        // 法定代表人代表身份证明
        // 文件信息列表
        [NameInMap("representative_id_number_file")]
        [Validation(Required=false)]
        public List<FileInfo> RepresentativeIdNumberFile { get; set; }

        // 法定代表人职务
        [NameInMap("representative_post")]
        [Validation(Required=false)]
        public string RepresentativePost { get; set; }

        // 法定代表人职务证明
        // 文件信息列表
        [NameInMap("representative_post_file")]
        [Validation(Required=false)]
        public List<FileInfo> RepresentativePostFile { get; set; }

        // 签章管理员姓名
        [NameInMap("signature_manager_name")]
        [Validation(Required=false)]
        public string SignatureManagerName { get; set; }

        // 签章管理员身份证号码
        [NameInMap("signature_manager_id_card")]
        [Validation(Required=false)]
        public string SignatureManagerIdCard { get; set; }

        // 签章管理员手机号码
        [NameInMap("signature_manager_phone")]
        [Validation(Required=false)]
        public string SignatureManagerPhone { get; set; }

    }

}
