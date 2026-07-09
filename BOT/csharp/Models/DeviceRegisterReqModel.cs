// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备实体请求结构体，应用在注册/更新API的ThingsExtraParams
    public class DeviceRegisterReqModel : TeaModel {
        // 保留
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("auth_level")]
        [Validation(Required=false)]
        public long? AuthLevel { get; set; }

        // 设备属性字符串，
        // 阿里云设备类型，填入三元组
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;设备属性&quot;</para>
        /// </summary>
        [NameInMap("device_attribute")]
        [Validation(Required=false)]
        public string DeviceAttribute { get; set; }

        // 物模型ID，参考其他文档
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;模型ID&quot;</para>
        /// </summary>
        [NameInMap("device_model_id")]
        [Validation(Required=false)]
        public string DeviceModelId { get; set; }

        // 可传入自定义信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;自定义字段&quot;</para>
        /// </summary>
        [NameInMap("other_info")]
        [Validation(Required=false)]
        public string OtherInfo { get; set; }

        // 业务自定义，可以传入该实体的w3c服务节点
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;服务端点&quot;</para>
        /// </summary>
        [NameInMap("service_endpoint")]
        [Validation(Required=false)]
        public string ServiceEndpoint { get; set; }

        // 保留，默认
        //     STATUS_REGISTERED(3)
        /// <summary>
        /// <b>Example:</b>
        /// <para>null</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
