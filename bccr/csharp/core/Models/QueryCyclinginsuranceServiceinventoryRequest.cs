// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryCyclinginsuranceServiceinventoryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 请求id，用于链路追踪，如uuid
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 调用方
        [NameInMap("caller_app_name")]
        [Validation(Required=true)]
        public string CallerAppName { get; set; }

        // 服务商账号id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 商品code
        [NameInMap("item_code")]
        [Validation(Required=true)]
        public string ItemCode { get; set; }

        // 商品属性
        [NameInMap("item_attributes")]
        [Validation(Required=true)]
        public string ItemAttributes { get; set; }

    }

}
