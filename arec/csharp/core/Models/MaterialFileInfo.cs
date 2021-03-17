// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 材料文件信息
    public class MaterialFileInfo : TeaModel {
        // 文件路径
        [NameInMap("file_path")]
        [Validation(Required=true)]
        public string FilePath { get; set; }

        // 材料ID，默认值为2，代表身份证明
        [NameInMap("material_id")]
        [Validation(Required=true)]
        public string MaterialId { get; set; }

        // 材料名称
        [NameInMap("material_name")]
        [Validation(Required=true)]
        public string MaterialName { get; set; }

        // 材料类型，取值范围：1--申请文件，2--业务表格，3--证照，4--申请人像，5--受理回执单 ，6--缴款通知书，7--抵押登记证明，8--原证照，9--银行内部审批材料，10--网上申办凭证
        [NameInMap("material_type")]
        [Validation(Required=false)]
        public string MaterialType { get; set; }

        // 材料类别，取值范围：1--原件，2--复印件，3--原件和复印件，4--申请人像，10--原证照 
        [NameInMap("material_category")]
        [Validation(Required=false)]
        public string MaterialCategory { get; set; }

        // 材料份数
        [NameInMap("copies_number")]
        [Validation(Required=true)]
        public long? CopiesNumber { get; set; }

        // 材料页数
        [NameInMap("page")]
        [Validation(Required=true)]
        public long? Page { get; set; }

    }

}
