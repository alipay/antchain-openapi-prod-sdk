// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_aafd16538edd4fc0ab50acd01355adb6.Models
{
    public class ImportDataBccCompanyPersonRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 姓名
        [NameInMap("xm")]
        [Validation(Required=false)]
        public string Xm { get; set; }

        // 身份证号
        [NameInMap("sfzh")]
        [Validation(Required=false)]
        public string Sfzh { get; set; }

        // 数据更新时间
        [NameInMap("sjgxsj")]
        [Validation(Required=false)]
        public string Sjgxsj { get; set; }

        // 数据目录名称
        [NameInMap("sjmlmc")]
        [Validation(Required=false)]
        public string Sjmlmc { get; set; }

        // 数据所属部门
        [NameInMap("sjssbm")]
        [Validation(Required=false)]
        public string Sjssbm { get; set; }

        // 从业资格证号
        [NameInMap("cyzgzh")]
        [Validation(Required=false)]
        public string Cyzgzh { get; set; }

        // 从业类别
        [NameInMap("cylb")]
        [Validation(Required=false)]
        public string Cylb { get; set; }

        // 聘用单位
        [NameInMap("pydw")]
        [Validation(Required=false)]
        public string Pydw { get; set; }

        // 公告事由
        [NameInMap("ggsy")]
        [Validation(Required=false)]
        public string Ggsy { get; set; }

        // 公告日期起
        [NameInMap("ggrqq")]
        [Validation(Required=false)]
        public string Ggrqq { get; set; }

        // 公告日期止
        [NameInMap("ggrqz")]
        [Validation(Required=false)]
        public string Ggrqz { get; set; }

        // 企信链所需---企信链控制台数据管理列表页中每个数据的唯一码
        [NameInMap("data_name")]
        [Validation(Required=false)]
        public string DataName { get; set; }

    }

}
