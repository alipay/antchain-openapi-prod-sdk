// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    public class SignAntsaasStaffingcContractCaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务名称
        [NameInMap("biz_name")]
        [Validation(Required=true)]
        public string BizName { get; set; }

        // 业务编号
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 版本
        [NameInMap("sign_version")]
        [Validation(Required=true)]
        public string SignVersion { get; set; }

        // 签署任务信息
        [NameInMap("sign_task_request_list")]
        [Validation(Required=true)]
        public List<CaSignTaskRequest> SignTaskRequestList { get; set; }

        // 通过文件API上传的文件的file_id
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
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 合同模板密钥:若为合同模板该值必填,否则不需要填写
        [NameInMap("template_secret_key")]
        [Validation(Required=false)]
        public string TemplateSecretKey { get; set; }

        // 模板填充字段集合
        [NameInMap("template_field_config_request_list")]
        [Validation(Required=false)]
        public List<TemplateFieldConfigRequest> TemplateFieldConfigRequestList { get; set; }

    }

}
