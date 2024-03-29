// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class PagequeryIpCodeinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 用户ID
        // phone_number、external_user_id、user_id 三个条件至少必填一个
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 页码
        [NameInMap("page_number")]
        [Validation(Required=true)]
        public long? PageNumber { get; set; }

        // 每页数据量大小(请小于等于100)
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 0 扫描过的数字凭证，1 领取过的数字凭证
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 商家ID筛选
        [NameInMap("buyer_id")]
        [Validation(Required=false)]
        public string BuyerId { get; set; }

        // 手机号筛选
        // phone_number、external_user_id、user_id 三个条件至少必填一个
        [NameInMap("phone_number")]
        [Validation(Required=false)]
        public string PhoneNumber { get; set; }

        // 外部客户自定义客户ID
        // phone_number、external_user_id、user_id 三个条件至少必填一个
        [NameInMap("external_user_id")]
        [Validation(Required=false)]
        public string ExternalUserId { get; set; }

    }

}
