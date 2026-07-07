// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOTSG.Models
{
    // 设备信息
    // 
    public class Device : TeaModel {
        // 设备ID，一般是设备的出厂编码或业务上的资产ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123ABC</para>
        /// </summary>
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 	
        // 物模型事件ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>112233</para>
        /// </summary>
        [NameInMap("device_data_model_id")]
        [Validation(Required=true)]
        public string DeviceDataModelId { get; set; }

        // 场景码
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>SCENE1</para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // imei号
        /// <summary>
        /// <b>Example:</b>
        /// <para>223344</para>
        /// </summary>
        [NameInMap("device_imei")]
        [Validation(Required=true)]
        public string DeviceImei { get; set; }

        // 设备名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>设备1号</para>
        /// </summary>
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 设备厂商名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江一厂</para>
        /// </summary>
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

        // 设备ICCID
        /// <summary>
        /// <b>Example:</b>
        /// <para>a1234</para>
        /// </summary>
        [NameInMap("device_iccid")]
        [Validation(Required=false)]
        public string DeviceIccid { get; set; }

        // 设备扩展信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>{“”:&quot;&quot;}</para>
        /// </summary>
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 设备类型编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>5000</para>
        /// </summary>
        [NameInMap("device_type_code")]
        [Validation(Required=true)]
        public string DeviceTypeCode { get; set; }

        // 单价
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("initial_price")]
        [Validation(Required=true)]
        public long? InitialPrice { get; set; }

        // 投放时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("release_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ReleaseTime { get; set; }

        // 出厂时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("factory_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FactoryTime { get; set; }

        // 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
        /// <summary>
        /// <b>Example:</b>
        /// <para>NORMAL</para>
        /// </summary>
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // 可信设备ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>7006071575276187649</para>
        /// </summary>
        [NameInMap("trustiot_device_id")]
        [Validation(Required=true)]
        public long? TrustiotDeviceId { get; set; }

        // 设备链上Id
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>223344</para>
        /// </summary>
        [NameInMap("chain_device_id")]
        [Validation(Required=false)]
        public string ChainDeviceId { get; set; }

        // 上链哈希
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>3344</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 上链时间
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>224455</para>
        /// </summary>
        [NameInMap("tx_time")]
        [Validation(Required=false)]
        public long? TxTime { get; set; }

    }

}
