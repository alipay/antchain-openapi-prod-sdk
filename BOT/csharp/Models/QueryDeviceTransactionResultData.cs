// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 查询设备交易结果对象数据
    public class QueryDeviceTransactionResultData : TeaModel {
        // 设备所属厂商
        /// <summary>
        /// <b>Example:</b>
        /// <para>corp</para>
        /// </summary>
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 场景码,所属项目
        /// <summary>
        /// <b>Example:</b>
        /// <para>SMART_CAR_KEY</para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // IMEI
        /// <summary>
        /// <b>Example:</b>
        /// <para>IMEI</para>
        /// </summary>
        [NameInMap("device_imei")]
        [Validation(Required=false)]
        public string DeviceImei { get; set; }

        // 设备sn
        /// <summary>
        /// <b>Example:</b>
        /// <para>设备sn123</para>
        /// </summary>
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 设备金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.05</para>
        /// </summary>
        [NameInMap("price")]
        [Validation(Required=false)]
        public string Price { get; set; }

        // 设备分布式身份did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did1223</para>
        /// </summary>
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 设备终端唯一ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>tuid123</para>
        /// </summary>
        [NameInMap("device_tuid")]
        [Validation(Required=false)]
        public string DeviceTuid { get; set; }

        // 设备参数:品类+型号+规格
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("device_specs")]
        [Validation(Required=true)]
        public string DeviceSpecs { get; set; }

        // 所属租户
        /// <summary>
        /// <b>Example:</b>
        /// <para>QWERTYUU</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 所属账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

    }

}
