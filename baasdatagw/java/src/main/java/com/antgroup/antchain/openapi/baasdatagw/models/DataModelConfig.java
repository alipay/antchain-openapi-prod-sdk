// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class DataModelConfig extends TeaModel {
    // 对应的方法参数
    @NameInMap("arg_name")
    @Validation(required = true)
    public String argName;

    // 方法参数位置，input / output
    @NameInMap("arg_location")
    @Validation(required = true)
    public String argLocation;

    // 业务名称
    @NameInMap("comment")
    public String comment;

    // 业务名称在交易时间轴是否可见
    @NameInMap("visible")
    public Boolean visible;

    public static DataModelConfig build(java.util.Map<String, ?> map) throws Exception {
        DataModelConfig self = new DataModelConfig();
        return TeaModel.build(map, self);
    }

    public DataModelConfig setArgName(String argName) {
        this.argName = argName;
        return this;
    }
    public String getArgName() {
        return this.argName;
    }

    public DataModelConfig setArgLocation(String argLocation) {
        this.argLocation = argLocation;
        return this;
    }
    public String getArgLocation() {
        return this.argLocation;
    }

    public DataModelConfig setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public DataModelConfig setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }
    public Boolean getVisible() {
        return this.visible;
    }

}
