// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class AuthEcarOffsetdatumRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 会员在蚂蚁DIS服务的账户DID
        [NameInMap("account_did")]
        [Validation(Required=true)]
        public string AccountDid { get; set; }

        // 碳普惠平台编码，如蚂蚁森林编码为Antforest
        [NameInMap("carbon_offset_platform_no")]
        [Validation(Required=true)]
        public string CarbonOffsetPlatformNo { get; set; }

        // 平台方会员账户ID
        [NameInMap("platform_account_id")]
        [Validation(Required=true)]
        public string PlatformAccountId { get; set; }

        // 授权关键数据列表，KV结构列表
        [NameInMap("auth_keyword_list")]
        [Validation(Required=true)]
        public List<AnyKeywordItem> AuthKeywordList { get; set; }

    }

}
