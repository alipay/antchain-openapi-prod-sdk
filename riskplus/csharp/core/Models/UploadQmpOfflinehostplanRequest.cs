// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class UploadQmpOfflinehostplanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文件上传后的fileId
        /// <summary>
        /// 待上传文件
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// 待上传文件名
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // MOBILE/MOBILE_MD5/OAID/IDFA/IMEI选择其中一种
        [NameInMap("file_template")]
        [Validation(Required=true)]
        public string FileTemplate { get; set; }

        // plancode，托管计划编码
        [NameInMap("plan_code")]
        [Validation(Required=true)]
        public string PlanCode { get; set; }

        // OFFLINE_DECISION/OFFLINE_DECISION_ACTION,默认OFFLINE_DECISION_ACTION
        [NameInMap("relation_type")]
        [Validation(Required=false)]
        public string RelationType { get; set; }

        // properties的header,其他的为ext_info,
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 默认为false
        [NameInMap("need_to_refactor")]
        [Validation(Required=false)]
        public bool? NeedToRefactor { get; set; }

    }

}
