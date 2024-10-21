// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 机构详情
    public class InstitutionVO : TeaModel {
        // 机构id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 机构名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 简介
        [NameInMap("about")]
        [Validation(Required=false)]
        public string About { get; set; }

        // 主页
        [NameInMap("home_page")]
        [Validation(Required=false)]
        public string HomePage { get; set; }

        // 联系人信息
        [NameInMap("contacts")]
        [Validation(Required=false)]
        public List<InstitutionContactInfo> Contacts { get; set; }

        // 机构类型
        [NameInMap("types")]
        [Validation(Required=true)]
        public List<InstitutionType> Types { get; set; }

        // 机构用户信息
        [NameInMap("users")]
        [Validation(Required=false)]
        public List<UserInfo> Users { get; set; }

        // 是否支持删除
        [NameInMap("delete_enable")]
        [Validation(Required=false)]
        public bool? DeleteEnable { get; set; }

    }

}
