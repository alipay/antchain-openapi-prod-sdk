// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TriggerDTO extends TeaModel {
    // 名称
    @NameInMap("name")
    public String name;

    // 类型
    @NameInMap("type")
    public String type;

    // 源
    @NameInMap("source")
    public String source;

    // 创建时间
    @NameInMap("create_time")
    public String createTime;

    // 错误信息
    @NameInMap("error_message")
    public String errorMessage;

    // 状态
    @NameInMap("status")
    public String status;

    // option（map结构，由于金融云无map接口所以通过string类型传输json格式）
    @NameInMap("option")
    public String option;

    // checkpoint类
    @NameInMap("checkpoint")
    public CheckPoint checkpoint;

    public static TriggerDTO build(java.util.Map<String, ?> map) throws Exception {
        TriggerDTO self = new TriggerDTO();
        return TeaModel.build(map, self);
    }

    public TriggerDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TriggerDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TriggerDTO setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public TriggerDTO setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public TriggerDTO setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TriggerDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TriggerDTO setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public TriggerDTO setCheckpoint(CheckPoint checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public CheckPoint getCheckpoint() {
        return this.checkpoint;
    }

}
