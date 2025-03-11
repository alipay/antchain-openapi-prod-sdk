// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 数字人平台--知识库信息
    public class AvatarLibraryInfo : TeaModel {
        // 知识点数量
        [NameInMap("question_count")]
        [Validation(Required=true)]
        public long? QuestionCount { get; set; }

        // 知识库id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 知识库名称
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 数字人角色信息
        [NameInMap("human_info")]
        [Validation(Required=true)]
        public AvatarHumanInfo HumanInfo { get; set; }

    }

}
