// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 设备硬件模块信息体
    public class IotBasicDeviceHardWareModule : TeaModel {
        // 所属规格
        /// <summary>
        /// <b>Example:</b>
        /// <para>12321321</para>
        /// </summary>
        [NameInMap("specs_id")]
        [Validation(Required=true)]
        public long? SpecsId { get; set; }

        // 硬件模块ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>12321321</para>
        /// </summary>
        [NameInMap("hardware_module_id")]
        [Validation(Required=true)]
        public long? HardwareModuleId { get; set; }

        // 模块名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>反扫头</para>
        /// </summary>
        [NameInMap("hardware_module_name")]
        [Validation(Required=true)]
        public string HardwareModuleName { get; set; }

        // 模块编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>REVERSE_SCANNING_HEAD</para>
        /// </summary>
        [NameInMap("hardware_module_value")]
        [Validation(Required=true)]
        public string HardwareModuleValue { get; set; }

        // 模块参数
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;size&quot;:102}</para>
        /// </summary>
        [NameInMap("hardware_module_param")]
        [Validation(Required=true)]
        public string HardwareModuleParam { get; set; }

    }

}
