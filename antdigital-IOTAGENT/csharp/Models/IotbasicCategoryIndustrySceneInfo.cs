// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // iotbasic项目品类行业场景内容
    public class IotbasicCategoryIndustrySceneInfo : TeaModel {
        // 行业
        /// <summary>
        /// <b>Example:</b>
        /// <para>工业</para>
        /// </summary>
        [NameInMap("industry")]
        [Validation(Required=true)]
        public string Industry { get; set; }

        // 场景
        /// <summary>
        /// <b>Example:</b>
        /// <para>智能工业</para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

    }

}
