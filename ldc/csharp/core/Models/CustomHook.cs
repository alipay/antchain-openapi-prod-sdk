// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 发布单自定义卡点。暂时不支持
    public class CustomHook : TeaModel {
        // 卡点范围，目前只支持分批
        [NameInMap("hook_scope")]
        [Validation(Required=true)]
        public string HookScope { get; set; }

        // 卡点类型：api或has
        [NameInMap("hook_type")]
        [Validation(Required=true)]
        public string HookType { get; set; }

        // 卡点名称
        [NameInMap("hook_name")]
        [Validation(Required=false)]
        public string HookName { get; set; }

        // 卡点执行策略：each-每个分组，first-第一个分组，last-最后一个分组，custom-自定义分组。
        // 默认每个分组都会执行。
        [NameInMap("hook_strategy")]
        [Validation(Required=false)]
        public string HookStrategy { get; set; }

        // 自定义批次编号，从1开始。hook_strategy=custom时有效
        [NameInMap("custom_num")]
        [Validation(Required=false)]
        public long? CustomNum { get; set; }

        // api类型卡点配置，当hook_type=api时不能为空
        [NameInMap("api_hook_config")]
        [Validation(Required=false)]
        public ApiHookConfig ApiHookConfig { get; set; }

        // 守夜人类型卡点配置，当hook_type=has时不能为空
        [NameInMap("has_hook_config")]
        [Validation(Required=false)]
        public HasHookConfig HasHookConfig { get; set; }

        // 【暂不支持】是否允许忽略
        [NameInMap("ignore_supported")]
        [Validation(Required=false)]
        public bool? IgnoreSupported { get; set; }

        // 【暂不支持】任务超时时间，单位毫秒，默认10分钟
        [NameInMap("timeout_millis")]
        [Validation(Required=false)]
        public long? TimeoutMillis { get; set; }

        // 【暂不支持】默认true
        [NameInMap("un_override")]
        [Validation(Required=false)]
        public bool? UnOverride { get; set; }

        // 【暂不支持】是否需要确认
        [NameInMap("need_confirm")]
        [Validation(Required=false)]
        public bool? NeedConfirm { get; set; }

    }

}
