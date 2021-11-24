// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveTrailerCorpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 企业统一社会信用代码
        [NameInMap("social_credit_code")]
        [Validation(Required=true)]
        public string SocialCreditCode { get; set; }

        // 渠道企业名称
        [NameInMap("channel_company_name")]
        [Validation(Required=true)]
        public string ChannelCompanyName { get; set; }

        // 渠道企业信用代码
        [NameInMap("channel_social_credit_code")]
        [Validation(Required=true)]
        public string ChannelSocialCreditCode { get; set; }

        // 企业入驻渠道日期
        [NameInMap("entry_date")]
        [Validation(Required=true)]
        public string EntryDate { get; set; }

    }

}
