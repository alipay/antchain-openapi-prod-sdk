// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent详情查询-Agent关联配置信息表
    public class AgentRefPluginInfo : TeaModel {
        // 工具id
        // 
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 构建版本号
        // 
        [NameInMap("build_version")]
        [Validation(Required=true)]
        public string BuildVersion { get; set; }

        // 入参预设值表 Map<String,String> 格式
        [NameInMap("param_value_map")]
        [Validation(Required=true)]
        public string ParamValueMap { get; set; }

        // 关联的语料
        [NameInMap("corpus")]
        [Validation(Required=true)]
        public List<string> Corpus { get; set; }

    }

}
