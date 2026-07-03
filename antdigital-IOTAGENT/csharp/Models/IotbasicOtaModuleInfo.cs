// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // iotbasic ota模块信息
    public class IotbasicOtaModuleInfo : TeaModel {
        // OTA模块名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>barcodeScanner</para>
        /// </summary>
        [NameInMap("module_name")]
        [Validation(Required=true)]
        public string ModuleName { get; set; }

        // 最新版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.1.1</para>
        /// </summary>
        [NameInMap("last_version")]
        [Validation(Required=false)]
        public string LastVersion { get; set; }

    }

}
