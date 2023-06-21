// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 租赁用户信息
    public class BclUserInfo : TeaModel {
        // 用户账号ID,长度不超过64位
        [NameInMap("user_account_id")]
        [Validation(Required=true, MaxLength=64)]
        public string UserAccountId { get; set; }

        // 用户账号类型（承租人) ALIPAY.支付宝
        [NameInMap("user_account_type")]
        [Validation(Required=true, MaxLength=16)]
        public string UserAccountType { get; set; }

        // 承租人/企业姓名,长度不超过32位
        [NameInMap("user_cert_name")]
        [Validation(Required=true, MaxLength=32)]
        public string UserCertName { get; set; }

        // 承租人/企业证件号,长度不超过64位
        [NameInMap("user_cert_no")]
        [Validation(Required=true, MaxLength=64)]
        public string UserCertNo { get; set; }

        // 承租人/企业证件类型: IDENTITY_CARD 身份证 NATIONAL_LEGAL_MERGE 统一社会信用代码
        [NameInMap("user_cert_type")]
        [Validation(Required=true, MaxLength=32)]
        public string UserCertType { get; set; }

        // 承租人/企业手机号,长度不超过32位
        [NameInMap("user_phone_number")]
        [Validation(Required=true, MaxLength=32)]
        public string UserPhoneNumber { get; set; }

        // 承租人身份证人像面/企业营业执照 先调用文件上传的接口,这里填上传后返回的fileid
        [NameInMap("user_cert_front_file_id")]
        [Validation(Required=true, MaxLength=64)]
        public string UserCertFrontFileId { get; set; }

        // 承租人身份证国徽面 先调用文件上传的接口,这里填上传后返回的fileid
        [NameInMap("user_cert_back_file_id")]
        [Validation(Required=false, MaxLength=64)]
        public string UserCertBackFileId { get; set; }

    }

}
