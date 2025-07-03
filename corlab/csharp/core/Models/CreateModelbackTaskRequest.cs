// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CORLAB.Models
{
    public class CreateModelbackTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文件唯一ID
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

        // 创建任务时回溯的产品
        [NameInMap("product_codes")]
        [Validation(Required=true)]
        public List<string> ProductCodes { get; set; }

        // 样本记录名，不传为file_id
        [NameInMap("sample_file_name")]
        [Validation(Required=true)]
        public string SampleFileName { get; set; }

        // 目前只支持MD5,SHA_256两种加密方式
        [NameInMap("key_type")]
        [Validation(Required=true)]
        public string KeyType { get; set; }

        // 客户方唯一code
        [NameInMap("unique_code")]
        [Validation(Required=true)]
        public string UniqueCode { get; set; }

    }

}
