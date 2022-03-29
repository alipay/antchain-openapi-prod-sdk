// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 连接器中来源去向信息的配置项描述，包括名称、控件、描述、默认值
    public class ConnectorConfigs : TeaModel {
        // 前端控件类型
        [NameInMap("control")]
        [Validation(Required=true)]
        public string Control { get; set; }

        // 控件描述：中文、展示给用户
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 配置项名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 选项控件的所有选项
        [NameInMap("select_options")]
        [Validation(Required=false)]
        public List<string> SelectOptions { get; set; }

        // radio控件的所有选项
        [NameInMap("radio_options")]
        [Validation(Required=false)]
        public List<string> RadioOptions { get; set; }

        // 描述本配置的子配置名称，如果本配置是 选项类型，那么如果本选项被选中后，子控件才可见。
        [NameInMap("child")]
        [Validation(Required=false)]
        public string Child { get; set; }

        // 本配置是否可见，也即控件是否被用户可见
        [NameInMap("visible")]
        [Validation(Required=true)]
        public bool? Visible { get; set; }

        // 代表 本配置 的 父配置名称，便于做 控件间联动
        [NameInMap("parent")]
        [Validation(Required=false)]
        public string Parent { get; set; }

    }

}
