// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateIotbasicDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备厂商名称
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 设备品类编码
        [NameInMap("device_category_code")]
        [Validation(Required=true)]
        public string DeviceCategoryCode { get; set; }

        // A1
        [NameInMap("device_model")]
        [Validation(Required=true)]
        public string DeviceModel { get; set; }

        // xxx
        [NameInMap("device_name")]
        [Validation(Required=true)]
        public string DeviceName { get; set; }

        // xe21d
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // standard
        [NameInMap("device_specs")]
        [Validation(Required=true)]
        public string DeviceSpecs { get; set; }

        // 安装位置
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // 设备标签
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // secid
        [NameInMap("sec_id")]
        [Validation(Required=false)]
        public string SecId { get; set; }

        // 设备扩展信息
        [NameInMap("device_ext")]
        [Validation(Required=false)]
        public string DeviceExt { get; set; }

        // 业务场景编码
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 所属租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

    }

}
