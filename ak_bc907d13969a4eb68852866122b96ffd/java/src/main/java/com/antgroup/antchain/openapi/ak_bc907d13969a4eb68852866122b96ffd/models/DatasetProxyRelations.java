// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class DatasetProxyRelations extends TeaModel {
    // 来源
    @NameInMap("source")
    public String source;

    // iTAG数据集的ID
    @NameInMap("datasetid")
    public String datasetid;

    // 标注类型
    @NameInMap("datasettype")
    public String datasettype;

    // SourceBizId
    @NameInMap("sourcebizid")
    public String sourcebizid;

    public static DatasetProxyRelations build(java.util.Map<String, ?> map) throws Exception {
        DatasetProxyRelations self = new DatasetProxyRelations();
        return TeaModel.build(map, self);
    }

    public DatasetProxyRelations setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DatasetProxyRelations setDatasetid(String datasetid) {
        this.datasetid = datasetid;
        return this;
    }
    public String getDatasetid() {
        return this.datasetid;
    }

    public DatasetProxyRelations setDatasettype(String datasettype) {
        this.datasettype = datasettype;
        return this;
    }
    public String getDatasettype() {
        return this.datasettype;
    }

    public DatasetProxyRelations setSourcebizid(String sourcebizid) {
        this.sourcebizid = sourcebizid;
        return this;
    }
    public String getSourcebizid() {
        return this.sourcebizid;
    }

}
