// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 当前页码
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // customer_id
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 用户ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // is_locale_enabled
        [NameInMap("is_locale_enabled")]
        [Validation(Required=false)]
        public bool? IsLocaleEnabled { get; set; }

        // local
        [NameInMap("local")]
        [Validation(Required=false)]
        public string Local { get; set; }

        // 登录名称
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 排序关键字列表
        [NameInMap("orders")]
        [Validation(Required=false)]
        public List<string> Orders { get; set; }

        // 每页个数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 是否分页
        [NameInMap("paging")]
        [Validation(Required=false)]
        public bool? Paging { get; set; }

        // 查询类型
        // 模糊查询 FUZZY
        // 精准查询 ACCURATE,
        //  前缀查询 START_WITH
        [NameInMap("query_type")]
        [Validation(Required=false)]
        public string QueryType { get; set; }

        // 实际名称
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // search
        [NameInMap("search")]
        [Validation(Required=false)]
        public bool? Search { get; set; }

        // 账户类型
        // MASTER 主账号
        // OPERATOR 操作员
        // SERVICE 服务账号
        // STS_ACTOR 虚拟身份
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 账户类型列表
        [NameInMap("types")]
        [Validation(Required=false)]
        public List<string> Types { get; set; }

    }

}
