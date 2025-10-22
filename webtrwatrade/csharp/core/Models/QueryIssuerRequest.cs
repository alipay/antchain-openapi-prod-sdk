// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class QueryIssuerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资产项目ID（资产项目ID、资产项目合约地址+所在链 二选一必填）
        [NameInMap("asset_project_id")]
        [Validation(Required=false)]
        public string AssetProjectId { get; set; }

        // 资产项目合约地址（资产项目ID、资产项目合约地址+所在链 二选一必填）
        [NameInMap("asset_project_address")]
        [Validation(Required=false)]
        public string AssetProjectAddress { get; set; }

        // 项目所在链（资产项目ID、资产项目合约地址+所在链 二选一必填）
        [NameInMap("chain_name")]
        [Validation(Required=false)]
        public string ChainName { get; set; }

        // 用户ID（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户地址（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
        [NameInMap("user_address")]
        [Validation(Required=false)]
        public string UserAddress { get; set; }

        // 登录名（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 登录名类型(EMAIL)（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
        [NameInMap("login_accout_type")]
        [Validation(Required=false)]
        public string LoginAccoutType { get; set; }

        // 开始时间 (时间戳)
        [NameInMap("start_time_mills")]
        [Validation(Required=true)]
        public long? StartTimeMills { get; set; }

        // 结束时间 (时间戳)
        [NameInMap("end_time_mills")]
        [Validation(Required=true)]
        public long? EndTimeMills { get; set; }

    }

}
