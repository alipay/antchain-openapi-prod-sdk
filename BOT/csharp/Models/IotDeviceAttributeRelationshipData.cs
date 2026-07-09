// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备属性关系对象
    public class IotDeviceAttributeRelationshipData : TeaModel {
        // id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 设备品类名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>智能防疫机一体机</para>
        /// </summary>
        [NameInMap("device_category")]
        [Validation(Required=true)]
        public string DeviceCategory { get; set; }

        // 关系类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>CORP</para>
        /// </summary>
        [NameInMap("relation_type")]
        [Validation(Required=true)]
        public string RelationType { get; set; }

        // 厂商名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>天波</para>
        /// </summary>
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

        // 设备型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>TPS980</para>
        /// </summary>
        [NameInMap("device_model")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

        // 设备规格
        /// <summary>
        /// <b>Example:</b>
        /// <para>安卓标准版</para>
        /// </summary>
        [NameInMap("device_specs")]
        [Validation(Required=false)]
        public string DeviceSpecs { get; set; }

        // 硬件模块
        /// <summary>
        /// <b>Example:</b>
        /// <para>测温头</para>
        /// </summary>
        [NameInMap("hardware_module")]
        [Validation(Required=false)]
        public string HardwareModule { get; set; }

    }

}
