// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 数据校验失败返回体
    public class DataVerifyFailureData : TeaModel {
        // 主键id 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // Alipay-0101
        /// <summary>
        /// <b>Example:</b>
        /// <para>场景码</para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 设备ID 
        /// <summary>
        /// <b>Example:</b>
        /// <para>device_id_001</para>
        /// </summary>
        [NameInMap("device_id")]
        [Validation(Required=false)]
        public string DeviceId { get; set; }

        // 发行设备ID 
        /// <summary>
        /// <b>Example:</b>
        /// <para>00202009111700539276</para>
        /// </summary>
        [NameInMap("dis_device_id")]
        [Validation(Required=false)]
        public string DisDeviceId { get; set; }

        // 类型：0:数据上报;1:数据完整性校验
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // c89b65a2e3afd604977c0....
        /// <summary>
        /// <b>Example:</b>
        /// <para>公钥</para>
        /// </summary>
        [NameInMap("public_key")]
        [Validation(Required=false)]
        public string PublicKey { get; set; }

        // 验签类型：0(RAW_DATA)；1(公钥格式为PEM)；2(公钥格式为DER)
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("format_type")]
        [Validation(Required=false)]
        public long? FormatType { get; set; }

        // 验证内容hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>aa5304221185b370ea84d...</para>
        /// </summary>
        [NameInMap("content_id")]
        [Validation(Required=false)]
        public string ContentId { get; set; }

        // 验证内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;content&quot;:&quot;demo&quot;,...}</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 签名
        /// <summary>
        /// <b>Example:</b>
        /// <para>9b47e12b0ddb8df...</para>
        /// </summary>
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 错误信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>数据验真失败</para>
        /// </summary>
        [NameInMap("fail_message")]
        [Validation(Required=false)]
        public string FailMessage { get; set; }

        // 补充数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>{“DEVICE-ID”:&quot;DEMO-001&quot;}</para>
        /// </summary>
        [NameInMap("extra_data")]
        [Validation(Required=false)]
        public string ExtraData { get; set; }

        // 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("source")]
        [Validation(Required=false)]
        public long? Source { get; set; }

    }

}
