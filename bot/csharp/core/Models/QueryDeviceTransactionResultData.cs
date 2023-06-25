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
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 场景码,所属项目
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // IMEI
        [NameInMap("device_imei")]
        [Validation(Required=false)]
        public string DeviceImei { get; set; }

        // 设备sn
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 设备金额
        [NameInMap("price")]
        [Validation(Required=false)]
        public string Price { get; set; }

        // 设备分布式身份did
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 设备终端唯一ID
        [NameInMap("device_tuid")]
        [Validation(Required=false)]
        public string DeviceTuid { get; set; }

        // 设备参数:品类+型号+规格
        [NameInMap("device_specs")]
        [Validation(Required=true)]
        public string DeviceSpecs { get; set; }

        // 所属租户
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 所属账号
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

    }

}
