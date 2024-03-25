// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    // 用户信息查询结果
    public class UserInfoResult : TeaModel {
        // hr主数据接口调用结果
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 调用信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 查询结果
        [NameInMap("query_result_list")]
        [Validation(Required=true)]
        public List<QueryResult> QueryResultList { get; set; }

    }

}
