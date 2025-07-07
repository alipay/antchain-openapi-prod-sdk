// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InstanceProgressInfo extends TeaModel {
    // 操作人
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("operator")
    public String operator;

    // 操作时间
    /**
     * <strong>example:</strong>
     * <p>1690166971465</p>
     */
    @NameInMap("time")
    public Long time;

    // 合约部署进度类型
    /**
     * <strong>example:</strong>
     * <p>SERVICE_START</p>
     */
    @NameInMap("type")
    public String type;

    // 部署状态
    /**
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("status")
    public String status;

    // 合约部署进度名称
    /**
     * <strong>example:</strong>
     * <p>部署合约服务</p>
     */
    @NameInMap("type_name")
    public String typeName;

    // 额外参数
    /**
     * <strong>example:</strong>
     * <p>{json}</p>
     */
    @NameInMap("data")
    public String data;

    public static InstanceProgressInfo build(java.util.Map<String, ?> map) throws Exception {
        InstanceProgressInfo self = new InstanceProgressInfo();
        return TeaModel.build(map, self);
    }

    public InstanceProgressInfo setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public InstanceProgressInfo setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public InstanceProgressInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public InstanceProgressInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public InstanceProgressInfo setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public InstanceProgressInfo setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
