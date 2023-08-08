// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    public class SignAntsaasStaffingcContractSendRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要确保唯一（定位订单）
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 合同或模版文件
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

        // 合同类型（1合同文件 2合同模板）
        [NameInMap("contract_type")]
        [Validation(Required=true)]
        public long? ContractType { get; set; }

        // 合同名称, 必须带上文件名后缀。 .dpf .doc .docx
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 合同文件类型 （pdf、word）
        [NameInMap("contract_file_type")]
        [Validation(Required=true)]
        public string ContractFileType { get; set; }

        // 合同模版参数，json格式，以key value格式存储，合同类型属于模板必填
        [NameInMap("simple_form_fields")]
        [Validation(Required=false)]
        public string SimpleFormFields { get; set; }

        // 签署平台（ALIPAY或H5）
        [NameInMap("sign_platform")]
        [Validation(Required=true)]
        public string SignPlatform { get; set; }

        // 合同用户信息列表
        [NameInMap("sign_user_list")]
        [Validation(Required=true)]
        public List<SignUserInfo> SignUserList { get; set; }

        // 合同企业信息列表
        [NameInMap("sign_enterprise_list")]
        [Validation(Required=true)]
        public List<SignEnterpriseInfo> SignEnterpriseList { get; set; }

    }

}
