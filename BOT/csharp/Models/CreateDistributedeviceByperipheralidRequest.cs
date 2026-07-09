// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateDistributedeviceByperipheralidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 厂商名称
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

        // 数据模型id
        [NameInMap("peripheral_data_model_id")]
        [Validation(Required=true)]
        public string PeripheralDataModelId { get; set; }

        // 外围设备ID
        [NameInMap("peripheral_id")]
        [Validation(Required=true)]
        public string PeripheralId { get; set; }

        // 外围设备名称
        // 
        [NameInMap("peripheral_name")]
        [Validation(Required=false)]
        public string PeripheralName { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 设备类型编码
        [NameInMap("device_type_code")]
        [Validation(Required=false)]
        public long? DeviceTypeCode { get; set; }

        // 设备单价 单位：分
        [NameInMap("initial_price")]
        [Validation(Required=false)]
        public long? InitialPrice { get; set; }

        // 出厂时间
        [NameInMap("factory_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FactoryTime { get; set; }

        // 投放时间
        [NameInMap("release_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ReleaseTime { get; set; }

    }

}
