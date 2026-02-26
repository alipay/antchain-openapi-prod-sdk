// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class UploadMktFileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 文件唯一id
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

        // 业务入参json格式字符串
        [NameInMap("biz_content")]
        [Validation(Required=false, MaxLength=1024)]
        public string BizContent { get; set; }

        // 请求id，每一次请求保持唯一，若重复，则报错；
        [NameInMap("request_id")]
        [Validation(Required=true, MaxLength=128)]
        public string RequestId { get; set; }

        // 产品编码，蚂蚁分配
        [NameInMap("product_code")]
        [Validation(Required=true, MaxLength=64)]
        public string ProductCode { get; set; }

        // 数据类型，
        // 营销人群底包--MKT_AUD_SRC，
        // 营销目标人群包--MKT_AUD_TAR
        [NameInMap("data_type")]
        [Validation(Required=true, MaxLength=64)]
        public string DataType { get; set; }

    }

}
