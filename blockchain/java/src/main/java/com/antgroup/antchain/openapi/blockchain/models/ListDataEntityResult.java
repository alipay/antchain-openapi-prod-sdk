// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListDataEntityResult extends TeaModel {
    // 数据模型信息
    @NameInMap("data_model")
    @Validation(required = true)
    public DataModel dataModel;

    // 数据资产信息
    @NameInMap("data_entity")
    @Validation(required = true)
    public DataEntity dataEntity;

    public static ListDataEntityResult build(java.util.Map<String, ?> map) throws Exception {
        ListDataEntityResult self = new ListDataEntityResult();
        return TeaModel.build(map, self);
    }

    public ListDataEntityResult setDataModel(DataModel dataModel) {
        this.dataModel = dataModel;
        return this;
    }
    public DataModel getDataModel() {
        return this.dataModel;
    }

    public ListDataEntityResult setDataEntity(DataEntity dataEntity) {
        this.dataEntity = dataEntity;
        return this;
    }
    public DataEntity getDataEntity() {
        return this.dataEntity;
    }

}
