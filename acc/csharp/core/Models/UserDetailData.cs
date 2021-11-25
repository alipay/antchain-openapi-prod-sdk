// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 个人认证信息
    public class UserDetailData : TeaModel {
        // 账户Id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public long? UserId { get; set; }

        // 统一身份id
        // 
        // 
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 账户名
        // 
        // 
        [NameInMap("login_id")]
        [Validation(Required=true)]
        public string LoginId { get; set; }

        // 用户姓名
        // 
        // 
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 用户类型
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 账户类型
        [NameInMap("account_type")]
        [Validation(Required=true)]
        public string AccountType { get; set; }

        // 个人认证状态
        [NameInMap("cert_status")]
        [Validation(Required=true)]
        public string CertStatus { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 手机号
        [NameInMap("telphone")]
        [Validation(Required=true)]
        public string Telphone { get; set; }

        // 个人证件类型
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 证件号码	
        // 
        [NameInMap("cert_num")]
        [Validation(Required=true)]
        public string CertNum { get; set; }

        // cert_file_front_id
        [NameInMap("cert_file_front_id")]
        [Validation(Required=true)]
        public string CertFileFrontId { get; set; }

        // 个人证件正面类型
        [NameInMap("cert_file_front_type")]
        [Validation(Required=true)]
        public string CertFileFrontType { get; set; }

        // 个人证件反面图片，osskeyId
        // 
        // 
        [NameInMap("cert_file_reverse_id")]
        [Validation(Required=true)]
        public string CertFileReverseId { get; set; }

        // 个人证件反面类型。JPG
        // 
        // 
        [NameInMap("cert_file_reverse_type")]
        [Validation(Required=true)]
        public string CertFileReverseType { get; set; }

        // 关联企业信息
        // 
        // 
        [NameInMap("ref_firms")]
        [Validation(Required=true)]
        public List<RefFirm> RefFirms { get; set; }

        // 是否有印章
        [NameInMap("seal_flag")]
        [Validation(Required=false)]
        public bool? SealFlag { get; set; }

    }

}
