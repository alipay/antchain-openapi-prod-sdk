// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 一个指令模板。
    public class CmdTemplate : TeaModel {
        // 指令模板定义的参数名称。比如：./install_env.sh --version 2.2，其中的 --version 就是参数名称
        [NameInMap("arg_names")]
        [Validation(Required=false)]
        public List<string> ArgNames { get; set; }

        // 指令模板内容，可以为一个简单命令，也可是一个自定义脚本
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 指令模板创建者，通常为改用户注册蚂蚁金融云的email
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // 指令模板描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 在机器上执行该指令的账号，比如：root, admin
        [NameInMap("execute_account")]
        [Validation(Required=false)]
        public string ExecuteAccount { get; set; }

        // 指令模板ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 指令名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 失败重试的间隔，单位为秒
        [NameInMap("retry_interval")]
        [Validation(Required=false)]
        public int? RetryInterval { get; set; }

        // 失败重试次数
        [NameInMap("retry_times")]
        [Validation(Required=false)]
        public int? RetryTimes { get; set; }

        // 单次执行的超时时间，单位为秒
        [NameInMap("time_out")]
        [Validation(Required=false)]
        public int? TimeOut { get; set; }

        // 模板类型。目前取值列表：
        //                     SIMPLE_COMMAND：简单指令类型；
        //                     CUSTOM_SHELL_SCRIPT：用户自定义shell脚本
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
