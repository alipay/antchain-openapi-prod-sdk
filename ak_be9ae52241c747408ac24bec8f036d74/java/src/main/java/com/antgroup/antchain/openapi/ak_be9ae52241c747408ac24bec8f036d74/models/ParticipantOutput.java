// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class ParticipantOutput extends TeaModel {
    // 授权至项目内的数据源ID
    @NameInMap("auth_datasource_id")
    public String authDatasourceId;

    // 输出表名
    @NameInMap("table_name")
    public String tableName;

    // 输出类型，本期仅支持FULL
    @NameInMap("write_type")
    public String writeType;

    public static ParticipantOutput build(java.util.Map<String, ?> map) throws Exception {
        ParticipantOutput self = new ParticipantOutput();
        return TeaModel.build(map, self);
    }

    public ParticipantOutput setAuthDatasourceId(String authDatasourceId) {
        this.authDatasourceId = authDatasourceId;
        return this;
    }
    public String getAuthDatasourceId() {
        return this.authDatasourceId;
    }

    public ParticipantOutput setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ParticipantOutput setWriteType(String writeType) {
        this.writeType = writeType;
        return this;
    }
    public String getWriteType() {
        return this.writeType;
    }

}
