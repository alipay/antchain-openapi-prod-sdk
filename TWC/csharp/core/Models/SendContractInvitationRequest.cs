// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SendContractInvitationRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务方id，重定向和回调时都回传这个id
        [NameInMap("biz_process_id")]
        [Validation(Required=false)]
        public string BizProcessId { get; set; }

        // 回调接口地址，默认为空，不回调
        [NameInMap("callback_url")]
        [Validation(Required=false)]
        public string CallbackUrl { get; set; }

        // 被邀请人邮箱，若手机号和邮箱都传入，则仅手机号有效
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 被邀请人证件号
        [NameInMap("id_number")]
        [Validation(Required=false)]
        public string IdNumber { get; set; }

        // 被邀请人证件类型，详见个人证件类型说明 ，默认CRED_PSN_CH_IDCARD
        [NameInMap("invitee_cert_type")]
        [Validation(Required=false)]
        public string InviteeCertType { get; set; }

        // 邀请个人实名为PERSON，邀请企业为ORGAN
        [NameInMap("invite_type")]
        [Validation(Required=true)]
        public string InviteType { get; set; }

        // 企业法定代表人证件类型，详见个人证件类型说明 ，默认CRED_PSN_CH_IDCARD
        [NameInMap("legal_cert_type")]
        [Validation(Required=false)]
        public string LegalCertType { get; set; }

        // 企业法定代表人姓名
        [NameInMap("legal_name")]
        [Validation(Required=false)]
        public string LegalName { get; set; }

        // 企业法定代表人证件号
        [NameInMap("legal_no")]
        [Validation(Required=false)]
        public string LegalNo { get; set; }

        // 被邀请人手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 被邀请人姓名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 默认为空，传入“sms”表示短信，“email”表示邮件，若两者都传入，则只发送短信
        [NameInMap("notify_type")]
        [Validation(Required=false)]
        public string NotifyType { get; set; }

        // 企业证件号
        [NameInMap("organ_cert_no")]
        [Validation(Required=false)]
        public string OrganCertNo { get; set; }

        // 企业证件类型，详见机构证件类型说明 ，默认CRED_ORG_USCC
        [NameInMap("organ_cert_type")]
        [Validation(Required=false)]
        public string OrganCertType { get; set; }

        // 企业名称
        [NameInMap("organ_name")]
        [Validation(Required=false)]
        public string OrganName { get; set; }

        // 结束后重定向地址（需加前缀https:// 或 http:// ），默认停留在当前页面
        [NameInMap("redirect_url")]
        [Validation(Required=false)]
        public string RedirectUrl { get; set; }

    }

}
