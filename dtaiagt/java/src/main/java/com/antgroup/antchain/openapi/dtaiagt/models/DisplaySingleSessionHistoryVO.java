// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class DisplaySingleSessionHistoryVO extends TeaModel {
    // 展示内容列表，入参和出参放在一起，方便前端展示
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("content_list")
    @Validation(required = true)
    public java.util.List<DisplayResponseContent> contentList;

    public static DisplaySingleSessionHistoryVO build(java.util.Map<String, ?> map) throws Exception {
        DisplaySingleSessionHistoryVO self = new DisplaySingleSessionHistoryVO();
        return TeaModel.build(map, self);
    }

    public DisplaySingleSessionHistoryVO setContentList(java.util.List<DisplayResponseContent> contentList) {
        this.contentList = contentList;
        return this;
    }
    public java.util.List<DisplayResponseContent> getContentList() {
        return this.contentList;
    }

}
