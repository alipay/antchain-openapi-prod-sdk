// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 通过设备注册发行时的设备参数 （与RegByDeviceIdParam的区别在于设备端有无植入蚂蚁SDK或模组）
    // 
    public class RegByDeviceParm : TeaModel {
        // 一般是业务上唯一的设备ID/资产编码
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1122</para>
        /// </summary>
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 数据模型ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>7033986596836630528</para>
        /// </summary>
        [NameInMap("device_data_model_id")]
        [Validation(Required=false)]
        public string DeviceDataModelId { get; set; }

        // 设备端经过蚂蚁SDK或模组初始化得到的注册信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>73546f6b656e323031323131313332393235303230303033</para>
        /// </summary>
        [NameInMap("device_reg_content")]
        [Validation(Required=true)]
        public string DeviceRegContent { get; set; }

        // 蚂蚁侧SDK或模组对device_reg_content的签名
        /// <summary>
        /// <b>Example:</b>
        /// <para>a573546f6b656e323031323131313332393235303230303033</para>
        /// </summary>
        [NameInMap("device_reg_signature")]
        [Validation(Required=true)]
        public string DeviceRegSignature { get; set; }

        // sdk版本号，由蚂蚁侧提供
        /// <summary>
        /// <b>Example:</b>
        /// <para>ma1-t1-0.1.1-00.04.54</para>
        /// </summary>
        [NameInMap("sdk_id")]
        [Validation(Required=true)]
        public string SdkId { get; set; }

        // 设备类型编码，联系蚂蚁侧获取设备类型编码
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1001</para>
        /// </summary>
        [NameInMap("device_type_code")]
        [Validation(Required=true)]
        public long? DeviceTypeCode { get; set; }

        // 设备单价 单位：分
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("initial_price")]
        [Validation(Required=false)]
        public long? InitialPrice { get; set; }

        // 出厂时间
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("factory_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FactoryTime { get; set; }

        // 投放时间
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("release_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ReleaseTime { get; set; }

        // 额外信息，联系蚂蚁侧获取参数格式
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>{...} </para>
        /// </summary>
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 资产所有人标识（统一社会信用代码）
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>91310101MA1FPCXA3G</para>
        /// </summary>
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

        // 资产所有人名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>蚂蚁区块链科技（上海）有限公司 </para>
        /// </summary>
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

        // 设备名称/型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>64.0V30AH</para>
        /// </summary>
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 设备IMEI
        /// <summary>
        /// <b>Example:</b>
        /// <para>823456712312345</para>
        /// </summary>
        [NameInMap("device_imei")]
        [Validation(Required=false)]
        public string DeviceImei { get; set; }

    }

}
