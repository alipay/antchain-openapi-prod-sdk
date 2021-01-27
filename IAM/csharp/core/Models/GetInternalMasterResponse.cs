// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class GetInternalMasterResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 证件ID
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 证件类型
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 所属客户ID
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 企业认证名称
        [NameInMap("firm_name")]
        [Validation(Required=false)]
        public string FirmName { get; set; }

        // havanaId
        [NameInMap("havana_id")]
        [Validation(Required=false)]
        public string HavanaId { get; set; }

        // 主账号ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 手机
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 真实姓名
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // 来源用户类型，CUSTOMER（企业用户），PERSONAL（个人用户）
        [NameInMap("source_user_type")]
        [Validation(Required=false)]
        public string SourceUserType { get; set; }

        // 主账号行业标签，I表示金融机构，C表示特殊机构，N表示非金融机构
        [NameInMap("industry_label")]
        [Validation(Required=false)]
        public string IndustryLabel { get; set; }

    }

}
