// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 模块版本树形节点
    public class ModuleVersionTreeNode : TeaModel {
        // 模块名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>BLE</para>
        /// </summary>
        [NameInMap("module_name")]
        [Validation(Required=false)]
        public string ModuleName { get; set; }

        // 版本号列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("versions")]
        [Validation(Required=false)]
        public List<string> Versions { get; set; }

    }

}
