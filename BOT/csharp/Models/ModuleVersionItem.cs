// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 模块版本上报数据信息
    public class ModuleVersionItem : TeaModel {
        // 模块定位信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("module_locator")]
        [Validation(Required=false)]
        public ModuleLocator ModuleLocator { get; set; }

        // 当前模块版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0.0</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
