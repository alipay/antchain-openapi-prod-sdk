// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    public class ApplyAntsaasStaffingcInsureSignurlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业名称
        [NameInMap("enterprise_name")]
        [Validation(Required=true)]
        public string EnterpriseName { get; set; }

        // 社会信用代码
        [NameInMap("social_credit_code")]
        [Validation(Required=true)]
        public string SocialCreditCode { get; set; }

        // 签约支付宝账号（企业支付宝是邮箱）
        [NameInMap("auth_account")]
        [Validation(Required=true)]
        public string AuthAccount { get; set; }

        // 联系手机号（用于接收投保失败等短信通知）
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 外部业务号(64长度以内）
        // 
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

    }

}
