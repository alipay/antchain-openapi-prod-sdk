// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 逻辑
    public class Logic : TeaModel {
        // 操作符
        //  equal = _equal_, // 相等比较
        //   notEqual = _notEqual_, // 不相等比较
        //   AND = _AND_, // 与逻辑
        //   OR = _OR_, // 或逻辑
        [NameInMap("op")]
        [Validation(Required=true)]
        public string Op { get; set; }

        //  只有 op 是 AND 或者 OR 才是可选，其他情况为必选
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 只有 op 是 AND 或者 OR 才是可选，其他情况为必选
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 只有 op 是 AND 或者 OR 才需要这个字段
        // [{op: _AND_, // 与逻辑
        //         children: [
        //           {
        //             op: _equal_, // 相等比较
        //             key: _validationMethod_, // 表示：验证方式
        //             value: _smsCode_  // 表示：短信验证码
        //           },
        //           { // 判断登录信息的值不为 null
        //             op: _notEqual_, // 不相等比较
        //             key: _username_,  // 表示：登录信息
        //             value: null
        //           }]}]
        [NameInMap("children")]
        [Validation(Required=true)]
        public string Children { get; set; }

    }

}
