// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 统一物联产品响应
    public class IotxProductResponse : TeaModel {
        // 主键id
        /// <summary>
        /// <b>Example:</b>
        /// <para>636804107650338816</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>POPVPRVV</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 行业id
        /// <summary>
        /// <b>Example:</b>
        /// <para>607848084638142464</para>
        /// </summary>
        [NameInMap("industry_id")]
        [Validation(Required=false)]
        public string IndustryId { get; set; }

        // 行业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>行业名称</para>
        /// </summary>
        [NameInMap("industry_name")]
        [Validation(Required=false)]
        public string IndustryName { get; set; }

        // 品类id
        /// <summary>
        /// <b>Example:</b>
        /// <para>607848648444874752</para>
        /// </summary>
        [NameInMap("category_id")]
        [Validation(Required=false)]
        public string CategoryId { get; set; }

        // 品类名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>品类名称</para>
        /// </summary>
        [NameInMap("category_name")]
        [Validation(Required=false)]
        public string CategoryName { get; set; }

        // 可信物联唯一产品标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>B7uwSpw2dAaxhZ8nJt</para>
        /// </summary>
        [NameInMap("trust_product_key")]
        [Validation(Required=false)]
        public string TrustProductKey { get; set; }

        // 三方物联网平台产品productKey
        /// <summary>
        /// <b>Example:</b>
        /// <para>k03iddJl20m</para>
        /// </summary>
        [NameInMap("product_key")]
        [Validation(Required=false)]
        public string ProductKey { get; set; }

        // 产品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>产品名称</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 产品秘钥
        /// <summary>
        /// <b>Example:</b>
        /// <para>1wugvASuxxxxxxxxxx</para>
        /// </summary>
        [NameInMap("product_secret")]
        [Validation(Required=false)]
        public string ProductSecret { get; set; }

        // 节点类型：0-直连设备、1-网关设备、2-网关子设备
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("node_type")]
        [Validation(Required=false)]
        public long? NodeType { get; set; }

        // 联网方式：0-wifi、1-蜂窝、2-以太网、3-蓝牙、4-蓝牙+蜂窝网络
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("net_type")]
        [Validation(Required=false)]
        public long? NetType { get; set; }

        // 产品协议：MQTT\CoAP
        /// <summary>
        /// <b>Example:</b>
        /// <para>MQTT</para>
        /// </summary>
        [NameInMap("product_protocol")]
        [Validation(Required=false)]
        public string ProductProtocol { get; set; }

        // 接入网关协议:0-ZigBee协议、1-BLE协议、2-Modbus
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("protocol_type")]
        [Validation(Required=false)]
        public string ProtocolType { get; set; }

        // 数据格式：0-Alink Json、1-自定义透传
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("data_format")]
        [Validation(Required=false)]
        public string DataFormat { get; set; }

        // 认证类型：默认不认证
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("auth_type")]
        [Validation(Required=false)]
        public long? AuthType { get; set; }

        // 数据校验级别：0-免校验、1-弱校验
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("validate_type")]
        [Validation(Required=false)]
        public long? ValidateType { get; set; }

        // 发布状态：0-未发布、1-已发布
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("publish_status")]
        [Validation(Required=false)]
        public long? PublishStatus { get; set; }

        // 业务来源：ekyt-数字钥匙、trust-可信上链、ai_hardware-AI硬件
        /// <summary>
        /// <b>Example:</b>
        /// <para>ekyt</para>
        /// </summary>
        [NameInMap("biz_source")]
        [Validation(Required=false)]
        public string BizSource { get; set; }

        // 产品的状态：0-开发中、1-已发布
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("product_status")]
        [Validation(Required=false)]
        public long? ProductStatus { get; set; }

        // 关联客户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>SAIGE</para>
        /// </summary>
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 可信物联实例Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>8ws7jeelei</para>
        /// </summary>
        [NameInMap("trust_instance_id")]
        [Validation(Required=false)]
        public string TrustInstanceId { get; set; }

        // 平台类型：0-alicloud、1-tuyaAli、2-自管
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("iot_platform")]
        [Validation(Required=false)]
        public long? IotPlatform { get; set; }

        // 产品描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>产品描述</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 产品物模型
        /// <summary>
        /// <b>Example:</b>
        /// <para>产品物模型</para>
        /// </summary>
        [NameInMap("thing_model")]
        [Validation(Required=false)]
        public string ThingModel { get; set; }

        // 是否启用动态注册：0-关闭动态注册、1-启用动态注册(仅支持涂鸦平台)
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("enable_dyn_reg")]
        [Validation(Required=false)]
        public long? EnableDynReg { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1783389225000</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1783389225000</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 租户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>租户名称</para>
        /// </summary>
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

    }

}
