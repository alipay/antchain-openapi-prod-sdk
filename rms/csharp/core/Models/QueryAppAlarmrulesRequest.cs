// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryAppAlarmrulesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 指标栈ID
        [NameInMap("stack_id")]
        [Validation(Required=true)]
        public long? StackId { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 查询所有，还是查询当前设置的告警指标。
        [NameInMap("all")]
        [Validation(Required=true)]
        public bool? All { get; set; }

    }

}
