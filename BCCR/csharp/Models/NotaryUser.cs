// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 出证用户（申请人，经办人）
    public class NotaryUser : TeaModel {
        // 用户类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>PERSON 或者 ENTERPRISE</para>
        /// </summary>
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 用户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>个人用户姓名、企业名称</para>
        /// </summary>
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 用户账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>该用户为业务方注册用户时传入</para>
        /// </summary>
        [NameInMap("user_account")]
        [Validation(Required=false)]
        public string UserAccount { get; set; }

        // 证件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>个人证件类型： identity_card（身份证） 企业证件类型： unified _ social _ credit _ code（统一 社会信用代码） enterprise_registered_number（企 业工商注册号）</para>
        /// </summary>
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 证件号
        /// <summary>
        /// <b>Example:</b>
        /// <para>证件类型对应的证件号码</para>
        /// </summary>
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 联系电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>个人手机号或企业联系人手机号码</para>
        /// </summary>
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 法定代表人姓名,用户类型为机构时必填
        /// <summary>
        /// <b>Example:</b>
        /// <para>用户类型为机构时必填</para>
        /// </summary>
        [NameInMap("legal_person_name")]
        [Validation(Required=false)]
        public string LegalPersonName { get; set; }

        // 法定代表人证件号码,用户类型为机构时必填
        /// <summary>
        /// <b>Example:</b>
        /// <para>法定代表人证件号码</para>
        /// </summary>
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=false)]
        public string LegalPersonCertNo { get; set; }

        // 法定代表人证件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>证件类型： identity_card（身份证，默认） foreign_permanent_resident_id_ca rd(外国人永久居留身份证)</para>
        /// </summary>
        [NameInMap("legal_person_cert_type")]
        [Validation(Required=false)]
        public string LegalPersonCertType { get; set; }

        // 身份证正面
        /// <summary>
        /// <b>Example:</b>
        /// <para>类型为个人时，传入个人的证件照片；类型为企业时，传入法人的证件正面</para>
        /// </summary>
        [NameInMap("cert_front_file")]
        [Validation(Required=false)]
        public string CertFrontFile { get; set; }

        // 身份证反面
        /// <summary>
        /// <b>Example:</b>
        /// <para>类型为个人时，传入个人的证件照片；类型为企业时，传入法人的证件反面</para>
        /// </summary>
        [NameInMap("cert_back_file")]
        [Validation(Required=false)]
        public string CertBackFile { get; set; }

        // 企业营业执照
        /// <summary>
        /// <b>Example:</b>
        /// <para>用户类型为机构时必填</para>
        /// </summary>
        [NameInMap("enterprise_cert_file")]
        [Validation(Required=false)]
        public string EnterpriseCertFile { get; set; }

    }

}
