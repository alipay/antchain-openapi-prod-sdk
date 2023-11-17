// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class ParticipantInput extends TeaModel {
    // 授权至项目内的数据集ID
    @NameInMap("auth_dataset_id")
    @Validation(required = true)
    public String authDatasetId;

    // 上述数据集所需参与计算的列
    @NameInMap("fields")
    public java.util.List<String> fields;

    // 用户筛选该数据集的过滤条件
    @NameInMap("filter")
    public String filter;

    public static ParticipantInput build(java.util.Map<String, ?> map) throws Exception {
        ParticipantInput self = new ParticipantInput();
        return TeaModel.build(map, self);
    }

    public ParticipantInput setAuthDatasetId(String authDatasetId) {
        this.authDatasetId = authDatasetId;
        return this;
    }
    public String getAuthDatasetId() {
        return this.authDatasetId;
    }

    public ParticipantInput setFields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<String> getFields() {
        return this.fields;
    }

    public ParticipantInput setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

}
