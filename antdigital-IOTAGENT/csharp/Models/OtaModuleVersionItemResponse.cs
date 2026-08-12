// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 设备模块版本明细
    public class OtaModuleVersionItemResponse : TeaModel {
        // 对外模块定位信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("module_locator")]
        [Validation(Required=false)]
        public ModuleLocator ModuleLocator { get; set; }

        // 设备最近一次被接受的上报版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0.0</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 设备上报时间戳，单位毫秒。
        /// <summary>
        /// <b>Example:</b>
        /// <para>设备上报时间戳，单位毫秒。</para>
        /// </summary>
        [NameInMap("reported_at")]
        [Validation(Required=false)]
        public string ReportedAt { get; set; }

    }

}
