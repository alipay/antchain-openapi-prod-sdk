// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class SyncexecuteCmdTaskRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 执行的指令。示例如下：cmd.template_id=000015678&cmd.args.1.name=--version&cmd.args.1.value=2.2
        [NameInMap("cmd")]
        [Validation(Required=false)]
        public OpsCmd Cmd { get; set; }

        // 执行指令的目标机器id列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
        [NameInMap("computers")]
        [Validation(Required=false)]
        public List<OpsComputer> Computers { get; set; }

    }

}
