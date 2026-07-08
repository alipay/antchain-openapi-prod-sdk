// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class AddEcarAvitivedataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 活动数据业务单号
        [NameInMap("enterprise_biz_no")]
        [Validation(Required=true, MaxLength=64)]
        public string EnterpriseBizNo { get; set; }

        // 盘查排放项编码
        [NameInMap("inventory_item_no")]
        [Validation(Required=true)]
        public string InventoryItemNo { get; set; }

        // 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss
        [NameInMap("occurrence_start_time")]
        [Validation(Required=true)]
        public string OccurrenceStartTime { get; set; }

        // 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss
        [NameInMap("occurrence_end_time")]
        [Validation(Required=true)]
        public string OccurrenceEndTime { get; set; }

        // 排放源用量值列表
        [NameInMap("emission_source_dosage_list")]
        [Validation(Required=true)]
        public List<AnyAmountItem> EmissionSourceDosageList { get; set; }

        // 活动数据附加要素值列表
        [NameInMap("emission_source_element_list")]
        [Validation(Required=false)]
        public List<AnyKeywordItem> EmissionSourceElementList { get; set; }

        // 活动数据扩展信息值列表
        [NameInMap("extension_value_list")]
        [Validation(Required=false)]
        public List<AnyKeywordItem> ExtensionValueList { get; set; }

        // 凭证文件列表，每个文件通过接口/open/api/file/upload上传
        [NameInMap("voucher_file_list")]
        [Validation(Required=false)]
        public List<EnterpriseDocumentFile> VoucherFileList { get; set; }

        // 备注
        [NameInMap("remark")]
        [Validation(Required=false, MaxLength=512)]
        public string Remark { get; set; }

    }

}
