// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备规格信息体
    public class IotBasicDeviceSpecs : TeaModel {
        // 厂商编码
        [NameInMap("corp_value")]
        [Validation(Required=true)]
        public string CorpValue { get; set; }

        // 厂商名称
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 型号名称
        [NameInMap("model_name")]
        [Validation(Required=true)]
        public string ModelName { get; set; }

        // 型号编码
        [NameInMap("model_value")]
        [Validation(Required=true)]
        public string ModelValue { get; set; }

        // 防疫机
        [NameInMap("category_name")]
        [Validation(Required=true)]
        public string CategoryName { get; set; }

        // 设备品类编码
        [NameInMap("category_code")]
        [Validation(Required=true)]
        public string CategoryCode { get; set; }

        // 规格ID
        [NameInMap("specs_id")]
        [Validation(Required=true)]
        public long? SpecsId { get; set; }

        // 规格名称
        [NameInMap("specs_name")]
        [Validation(Required=true)]
        public string SpecsName { get; set; }

        // 规格编码
        [NameInMap("specs_value")]
        [Validation(Required=true)]
        public string SpecsValue { get; set; }

        // 规格参数
        [NameInMap("specs_param")]
        [Validation(Required=true)]
        public string SpecsParam { get; set; }

    }

}
