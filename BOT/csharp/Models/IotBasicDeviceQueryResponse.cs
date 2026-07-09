// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 查询设备列表结构体
    public class IotBasicDeviceQueryResponse : TeaModel {
        // 设备名称	
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>智能防疫一体机</para>
        /// </summary>
        [NameInMap("device_name")]
        [Validation(Required=true)]
        public string DeviceName { get; set; }

        // 设备序列号
        /// <summary>
        /// <b>Example:</b>
        /// <para>CN12300x</para>
        /// </summary>
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 设备品类名称	
        /// <summary>
        /// <b>Example:</b>
        /// <para>智能防疫机</para>
        /// </summary>
        [NameInMap("device_category_name")]
        [Validation(Required=true)]
        public string DeviceCategoryName { get; set; }

        // 设备型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>PL10</para>
        /// </summary>
        [NameInMap("device_model")]
        [Validation(Required=true)]
        public string DeviceModel { get; set; }

        // 设备状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>online</para>
        /// </summary>
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // 设备安装位置
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江省杭州市西湖区 </para>
        /// </summary>
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // 设备注册时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("register_time")]
        [Validation(Required=true)]
        public string RegisterTime { get; set; }

        // 设备厂商
        /// <summary>
        /// <b>Example:</b>
        /// <para>蚂蚁数科</para>
        /// </summary>
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 租户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088xx</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 客户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试客户xx </para>
        /// </summary>
        [NameInMap("customer_name")]
        [Validation(Required=true)]
        public string CustomerName { get; set; }

        // 异常错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>SMILE_INIT_ERROR</para>
        /// </summary>
        [NameInMap("abnormal_code")]
        [Validation(Required=false)]
        public string AbnormalCode { get; set; }

        // 设备唯一身份id
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:private:12dsadadadf </para>
        /// </summary>
        [NameInMap("device_did")]
        [Validation(Required=false)]
        public string DeviceDid { get; set; }

        // 账号ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>12321321</para>
        /// </summary>
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 账户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

        // 设备服务状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>INIT</para>
        /// </summary>
        [NameInMap("service_status")]
        [Validation(Required=true)]
        public string ServiceStatus { get; set; }

        // 应用版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.1.13</para>
        /// </summary>
        [NameInMap("app_version")]
        [Validation(Required=true)]
        public string AppVersion { get; set; }

        // 服务有效期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-4-01</para>
        /// </summary>
        [NameInMap("validity_time")]
        [Validation(Required=false)]
        public string ValidityTime { get; set; }

    }

}
