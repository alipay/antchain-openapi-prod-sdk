// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 授权设备清单
    public class DeviceScopeItem : TeaModel {
        // 场景码
        /// <summary>
        /// <b>Example:</b>
        /// <para>SCENE_001</para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 客户侧 deviceId 列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>DEV001</para>
        /// </summary>
        [NameInMap("device_list")]
        [Validation(Required=true)]
        public List<string> DeviceList { get; set; }

    }

}
