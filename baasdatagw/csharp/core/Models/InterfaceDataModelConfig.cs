// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 接口业务字段配置
    public class InterfaceDataModelConfig : TeaModel {
        // 接口名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 接口签名，SOLIDITY 合约必填
        [NameInMap("name_sig")]
        [Validation(Required=false)]
        public string NameSig { get; set; }

        // 接口类型，当前 event 暂不支持。
        // function / deposit / event
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 接口参数配置列表，保序传递。
        [NameInMap("arg_configs")]
        [Validation(Required=false)]
        public List<DataModelConfig> ArgConfigs { get; set; }

    }

}
