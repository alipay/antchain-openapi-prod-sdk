// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 客户对应设备
    public class CustomerDeviceItem : TeaModel {
        // id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>tenant_id</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 账号id
        /// <summary>
        /// <b>Example:</b>
        /// <para>账号id</para>
        /// </summary>
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        //  设备品类-型号-规格  
        /// <summary>
        /// <b>Example:</b>
        /// <para> 设备品类-型号-规格  </para>
        /// </summary>
        [NameInMap("device_type")]
        [Validation(Required=true)]
        public string DeviceType { get; set; }

        // 设备sn
        /// <summary>
        /// <b>Example:</b>
        /// <para>SN</para>
        /// </summary>
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 设备did
        /// <summary>
        /// <b>Example:</b>
        /// <para>dasdf</para>
        /// </summary>
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 服务有效期
        /// <summary>
        /// <b>Example:</b>
        /// <para>服务有效期</para>
        /// </summary>
        [NameInMap("valide_time")]
        [Validation(Required=true)]
        public string ValideTime { get; set; }

        // 设备状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>INIT</para>
        /// </summary>
        [NameInMap("device_status")]
        [Validation(Required=true)]
        public string DeviceStatus { get; set; }

        // 服务状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>INIT</para>
        /// </summary>
        [NameInMap("service_status")]
        [Validation(Required=true)]
        public string ServiceStatus { get; set; }

        // 屏幕状态 开屏、锁屏
        /// <summary>
        /// <b>Example:</b>
        /// <para>屏幕状态</para>
        /// </summary>
        [NameInMap("screen_status")]
        [Validation(Required=false)]
        public string ScreenStatus { get; set; }

    }

}
