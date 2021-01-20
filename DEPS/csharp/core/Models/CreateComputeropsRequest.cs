// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateComputeropsRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 执行的指令列表。n代表第n个指令，n从1开始，最大20。示例如下：cmds.1.template_id=000015678&cmds.1.args.1.name=--version&cmds.1.args.1.value=2.2&cmds.2.template_id=000015688
        [NameInMap("cmds")]
        [Validation(Required=false)]
        public List<OpsCmd> Cmds { get; set; }

        // 执行运维操作的目标机器id列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
        [NameInMap("computers")]
        [Validation(Required=false)]
        public List<Computer> Computers { get; set; }

        // 运维单标题。长度不超过50个UTF-8字符
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

    }

}
