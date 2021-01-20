// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 一个执行的指令。
    public class OpsCmd : TeaModel {
        // 执行指令的参数列表
        [NameInMap("args")]
        [Validation(Required=false)]
        public List<OpsCmdArg> Args { get; set; }

        // 失败重试的间隔，单位为秒
        [NameInMap("retry_interval")]
        [Validation(Required=false)]
        public int? RetryInterval { get; set; }

        // 失败重试次数
        [NameInMap("retry_times")]
        [Validation(Required=false)]
        public int? RetryTimes { get; set; }

        // 指令模板ID
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public string TemplateId { get; set; }

        // 单次执行的超时时间，单位为秒
        [NameInMap("time_out")]
        [Validation(Required=false)]
        public int? TimeOut { get; set; }

    }

}
