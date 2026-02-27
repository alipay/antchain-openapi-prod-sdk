// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CHATBI.Models
{
    public class QueryNltosqlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户自然语言输入的问题
        [NameInMap("input")]
        [Validation(Required=true)]
        public string Input { get; set; }

        // 主题ID
        [NameInMap("topicid")]
        [Validation(Required=true)]
        public string Topicid { get; set; }

        // 对话ID
        [NameInMap("dialogid")]
        [Validation(Required=true)]
        public string Dialogid { get; set; }

        // 来源系统
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 是否需要返回SQL执行结果
        [NameInMap("needsqlexecuteresult")]
        [Validation(Required=false)]
        public bool? Needsqlexecuteresult { get; set; }

        // 是否限制返回条数
        [NameInMap("limit")]
        [Validation(Required=false)]
        public bool? Limit { get; set; }

    }

}
