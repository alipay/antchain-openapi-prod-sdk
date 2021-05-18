// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class PushAuthSigninfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 签署流程id
        [NameInMap("sign_process_id")]
        [Validation(Required=true)]
        public string SignProcessId { get; set; }

        // 授权关系类型id
        [NameInMap("auth_rel_type_id")]
        [Validation(Required=true)]
        public string AuthRelTypeId { get; set; }

        // 某某主题
        [NameInMap("sign_theme")]
        [Validation(Required=false)]
        public string SignTheme { get; set; }

        // 发起方名称
        [NameInMap("initiator_name")]
        [Validation(Required=true)]
        public string InitiatorName { get; set; }

        // 发起方证件类型，可以填写的枚举类型：UNIFIED_SOCIAL_CREDIT_CODE,  BUSINESS_LICENSE_NUMBER。分别表示统一社会信用代码和工商注册号
        [NameInMap("initiator_cert_type")]
        [Validation(Required=true)]
        public string InitiatorCertType { get; set; }

        // 发起方证件号码
        [NameInMap("initiator_cert_num")]
        [Validation(Required=true)]
        public string InitiatorCertNum { get; set; }

        // 合同模板hash
        [NameInMap("cont_tmpl_hash")]
        [Validation(Required=true)]
        public string ContTmplHash { get; set; }

        // 签署方信息列表
        [NameInMap("auth_partys")]
        [Validation(Required=true)]
        public List<AuthParty> AuthPartys { get; set; }

        // 上链文件信息列表
        [NameInMap("auth_chain_files")]
        [Validation(Required=true)]
        public List<AuthChainFile> AuthChainFiles { get; set; }

        // 动态字段1
        [NameInMap("dyna_field1")]
        [Validation(Required=false)]
        public string DynaField1 { get; set; }

        // 动态字段2
        [NameInMap("dyna_field2")]
        [Validation(Required=false)]
        public string DynaField2 { get; set; }

        // 动态字段3
        [NameInMap("dyna_field3")]
        [Validation(Required=false)]
        public string DynaField3 { get; set; }

        // 动态字段4
        [NameInMap("dyna_field4")]
        [Validation(Required=false)]
        public string DynaField4 { get; set; }

        // 动态字段5
        [NameInMap("dyna_field5")]
        [Validation(Required=false)]
        public string DynaField5 { get; set; }

        // 动态字段6
        [NameInMap("dyna_field6")]
        [Validation(Required=false)]
        public string DynaField6 { get; set; }

        // 动态字段7
        [NameInMap("dyna_field7")]
        [Validation(Required=false)]
        public string DynaField7 { get; set; }

        // 动态字段8
        [NameInMap("dyna_field8")]
        [Validation(Required=false)]
        public string DynaField8 { get; set; }

        // 动态字段9
        [NameInMap("dyna_field9")]
        [Validation(Required=false)]
        public string DynaField9 { get; set; }

        // 动态字段10
        [NameInMap("dyna_field10")]
        [Validation(Required=false)]
        public string DynaField10 { get; set; }

        // 动态字段11
        [NameInMap("dyna_field11")]
        [Validation(Required=false)]
        public string DynaField11 { get; set; }

        // 动态字段12
        [NameInMap("dyna_field12")]
        [Validation(Required=false)]
        public string DynaField12 { get; set; }

        // 动态字段13
        [NameInMap("dyna_field13")]
        [Validation(Required=false)]
        public string DynaField13 { get; set; }

        // 动态字段14
        [NameInMap("dyna_field14")]
        [Validation(Required=false)]
        public string DynaField14 { get; set; }

        // 动态字段15
        [NameInMap("dyna_field15")]
        [Validation(Required=false)]
        public string DynaField15 { get; set; }

        // 动态字段16
        [NameInMap("dyna_field16")]
        [Validation(Required=false)]
        public string DynaField16 { get; set; }

        // 动态字段17
        [NameInMap("dyna_field17")]
        [Validation(Required=false)]
        public string DynaField17 { get; set; }

        // 动态字段18
        [NameInMap("dyna_field18")]
        [Validation(Required=false)]
        public string DynaField18 { get; set; }

        // 动态字段19
        [NameInMap("dyna_field19")]
        [Validation(Required=false)]
        public string DynaField19 { get; set; }

        // 动态字段20
        [NameInMap("dyna_field20")]
        [Validation(Required=false)]
        public string DynaField20 { get; set; }

    }

}
