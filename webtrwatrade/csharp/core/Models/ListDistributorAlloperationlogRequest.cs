// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class ListDistributorAlloperationlogRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作员用户id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户地址（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
        [NameInMap("user_address")]
        [Validation(Required=false)]
        public string UserAddress { get; set; }

        // 登录名类型(EMAIL)（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
        [NameInMap("login_accout_type")]
        [Validation(Required=false)]
        public string LoginAccoutType { get; set; }

        // 登录名（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
        [NameInMap("login_accout")]
        [Validation(Required=false)]
        public string LoginAccout { get; set; }

        // 开始时间 (时间戳)
        [NameInMap("start_time_mills")]
        [Validation(Required=false)]
        public long? StartTimeMills { get; set; }

        // 结束时间 (时间戳)
        [NameInMap("end_time_mills")]
        [Validation(Required=false)]
        public long? EndTimeMills { get; set; }

    }

}
