// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DataModel extends TeaModel {
    //  数据模型Id
    /**
     * <strong>example:</strong>
     * <p>112233</p>
     */
    @NameInMap("data_model_id")
    @Validation(required = true)
    public String dataModelId;

    // 数据模型名称
    /**
     * <strong>example:</strong>
     * <p>检测设备模型</p>
     */
    @NameInMap("data_model_name")
    public String dataModelName;

    // 数据模型
    /**
     * <strong>example:</strong>
     * <p>{          &quot;PIC-URL&quot;: {                 &quot;type&quot;: &quot;string&quot;,                 &quot;require&quot;:false              } }</p>
     */
    @NameInMap("data_model")
    @Validation(required = true)
    public String dataModel;

    // 数据模型类别
    /**
     * <strong>example:</strong>
     * <p>ORDER</p>
     */
    @NameInMap("biz_type")
    public String bizType;

    // 用户自定义版本
    /**
     * <strong>example:</strong>
     * <p>V1.0</p>
     */
    @NameInMap("customer_version")
    public String customerVersion;

    // 数据样例
    /**
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;zhangsan&quot;}</p>
     */
    @NameInMap("data_demo")
    public String dataDemo;

    public static DataModel build(java.util.Map<String, ?> map) throws Exception {
        DataModel self = new DataModel();
        return TeaModel.build(map, self);
    }

    public DataModel setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public DataModel setDataModelName(String dataModelName) {
        this.dataModelName = dataModelName;
        return this;
    }
    public String getDataModelName() {
        return this.dataModelName;
    }

    public DataModel setDataModel(String dataModel) {
        this.dataModel = dataModel;
        return this;
    }
    public String getDataModel() {
        return this.dataModel;
    }

    public DataModel setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DataModel setCustomerVersion(String customerVersion) {
        this.customerVersion = customerVersion;
        return this;
    }
    public String getCustomerVersion() {
        return this.customerVersion;
    }

    public DataModel setDataDemo(String dataDemo) {
        this.dataDemo = dataDemo;
        return this;
    }
    public String getDataDemo() {
        return this.dataDemo;
    }

}
