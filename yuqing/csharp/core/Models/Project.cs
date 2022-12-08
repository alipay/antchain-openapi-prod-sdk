// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 项目
    public class Project : TeaModel {
        // 项目名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 作者名称
        [NameInMap("author_name_list")]
        [Validation(Required=false)]
        public List<string> AuthorNameList { get; set; }

        // 关键词
        [NameInMap("pos_keyword_list")]
        [Validation(Required=true)]
        public List<string> PosKeywordList { get; set; }

        // 标题包含词列表
        [NameInMap("pos_keyword_list_in_title")]
        [Validation(Required=false)]
        public List<string> PosKeywordListInTitle { get; set; }

        // 排除关键词标签列表
        [NameInMap("exclude_keyword_tag_ids")]
        [Validation(Required=false)]
        public string ExcludeKeywordTagIds { get; set; }

        // 修改人uid
        [NameInMap("uid_modified")]
        [Validation(Required=false)]
        public string UidModified { get; set; }

        // 提级用户名，如@xxx
        [NameInMap("at_author_name_list")]
        [Validation(Required=false)]
        public List<string> AtAuthorNameList { get; set; }

        // 排除词
        [NameInMap("exclude_keyword_list")]
        [Validation(Required=false)]
        public List<string> ExcludeKeywordList { get; set; }

        // 项目的分析页面id，关联hbase中的自定义页面表
        [NameInMap("analyse_cp_id")]
        [Validation(Required=false)]
        public long? AnalyseCpId { get; set; }

        // 关键词标签列表
        [NameInMap("keyword_tag_ids")]
        [Validation(Required=false)]
        public List<string> KeywordTagIds { get; set; }

        // 搭配词
        [NameInMap("ass_keyword_list")]
        [Validation(Required=false)]
        public List<string> AssKeywordList { get; set; }

        // 项目ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 默认搜索模板id
        [NameInMap("default_filter_id")]
        [Validation(Required=false)]
        public long? DefaultFilterId { get; set; }

        // 创建人名称
        [NameInMap("uname_create")]
        [Validation(Required=false)]
        public string UnameCreate { get; set; }

        // 父项目id
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public long? ParentId { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public long? GmtCreate { get; set; }

        // 修改人名称
        [NameInMap("uname_modified")]
        [Validation(Required=false)]
        public string UnameModified { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

        // 项目分组id
        [NameInMap("project_group_id")]
        [Validation(Required=false)]
        public long? ProjectGroupId { get; set; }

        // 父文章id
        [NameInMap("parent_doc_id")]
        [Validation(Required=false)]
        public long? ParentDocId { get; set; }

        // 文章id列表
        [NameInMap("doc_id_list")]
        [Validation(Required=false)]
        public List<string> DocIdList { get; set; }

        // 话题词列表
        [NameInMap("topic_list")]
        [Validation(Required=false)]
        public List<string> TopicList { get; set; }

        // 创建人UID
        [NameInMap("uid_create")]
        [Validation(Required=false)]
        public string UidCreate { get; set; }

    }

}
