// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // OTA 模块定位信息
    public class ModuleLocator : TeaModel {
        // 模块定位信息：EKYT_MID / MODULE_NAME / CHANNEL_EXTERNAL_ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>EKYT_MID</para>
        /// </summary>
        [NameInMap("locator_type")]
        [Validation(Required=true)]
        public string LocatorType { get; set; }

        // EKYT 模块 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>fda6f23a7767486d9d5f29e7567a2004</para>
        /// </summary>
        [NameInMap("mid")]
        [Validation(Required=false)]
        public string Mid { get; set; }

        // 模块名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>BLE</para>
        /// </summary>
        [NameInMap("module_name")]
        [Validation(Required=false)]
        public string ModuleName { get; set; }

        // channel 维度外部模块 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123456</para>
        /// </summary>
        [NameInMap("external_id")]
        [Validation(Required=false)]
        public string ExternalId { get; set; }

    }

}
