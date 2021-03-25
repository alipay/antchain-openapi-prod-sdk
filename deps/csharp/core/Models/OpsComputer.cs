// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 一个正在进行运维操作的计算容器。
    public class OpsComputer : TeaModel {
        // 计算容器id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 计算容器内网ip
        [NameInMap("inner_ip")]
        [Validation(Required=false)]
        public string InnerIp { get; set; }

        // 计算容器名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 计算容器当前运维状态。取值列表：
        //                     INITED：初始化完成；
        //                     EXECUTING：执行中；
        //                     SUCCESS：执行成功；
        //                     FAILED：执行失败；
        //                     CANCELED：已取消；
        //                     IGNORED：已忽略
        //                 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 计算容器上执行的任务信息。任务信息列表中包含正在执行和执行完成的任务。
        [NameInMap("tasks")]
        [Validation(Required=false)]
        public List<OpsComputerTask> Tasks { get; set; }

    }

}
