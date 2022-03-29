// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // SpiConfig
    public class SpiConfig : TeaModel {
        // end_point或token
        [NameInMap("end_point")]
        [Validation(Required=false)]
        public string EndPoint { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

        // last_editor
        [NameInMap("last_editor")]
        [Validation(Required=false)]
        public string LastEditor { get; set; }

        // 字段格式
        [NameInMap("field_naming_strategy")]
        [Validation(Required=false)]
        public string FieldNamingStrategy { get; set; }

        // 云厂商类型
        [NameInMap("cloud_vendor_type")]
        [Validation(Required=false)]
        public string CloudVendorType { get; set; }

    }

}
