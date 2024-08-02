// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 业务号条件
    public class BizNoCondition : TeaModel {
        // 枚举
        // CITY 城市
        // BLOCK 区县
        // AGE 年龄
        [NameInMap("dimension")]
        [Validation(Required=true)]
        public string Dimension { get; set; }

        // 枚举范围，每个维度的值是或的关系,需要校验场景和取值范围是否匹配
        // CITY:区划码
        // BLOCK:区划码（底包暂不支持）
        // AGE:30+、40+、50+（底包暂不支持
        [NameInMap("value_scope")]
        [Validation(Required=true)]
        public List<string> ValueScope { get; set; }

    }

}
