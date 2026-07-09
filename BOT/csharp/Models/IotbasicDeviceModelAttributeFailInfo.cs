// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic设备模型属性失败结果
    public class IotbasicDeviceModelAttributeFailInfo : TeaModel {
        // 型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>A2</para>
        /// </summary>
        [NameInMap("model_value")]
        [Validation(Required=true)]
        public string ModelValue { get; set; }

        // 规格列表 为空表示使用标准规格
        [NameInMap("specs_list")]
        [Validation(Required=false)]
        public List<string> SpecsList { get; set; }

        // 失败code
        /// <summary>
        /// <b>Example:</b>
        /// <para>code</para>
        /// </summary>
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public string ErrorCode { get; set; }

        // 失败消息
        /// <summary>
        /// <b>Example:</b>
        /// <para>message</para>
        /// </summary>
        [NameInMap("error_message")]
        [Validation(Required=true)]
        public string ErrorMessage { get; set; }

    }

}
