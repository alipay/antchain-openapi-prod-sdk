// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class AsyncexecuteBashcmdRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 执行的命令，长度不能超过500个字符
        [NameInMap("command")]
        [Validation(Required=false)]
        public string Command { get; set; }

        // 执行指令的目标机器id列表。n代表第n个机器，n从1开始，最大50。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
        [NameInMap("computers")]
        [Validation(Required=false)]
        public List<Computer> Computers { get; set; }

        // 单次执行的超时时间，单位为秒。最大值为1800秒，默认值也为1800秒
        [NameInMap("time_out")]
        [Validation(Required=false)]
        public int? TimeOut { get; set; }

        // 机器上执行命令的用户,比如：root,admin
        [NameInMap("user")]
        [Validation(Required=false)]
        public string User { get; set; }

    }

}
