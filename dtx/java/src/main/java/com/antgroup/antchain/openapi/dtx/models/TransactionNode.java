// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class TransactionNode extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // start_time
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    // end_time
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    // role
    @NameInMap("role")
    @Validation(required = true)
    public String role;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // label
    @NameInMap("label")
    @Validation(required = true)
    public String label;

    // is_end
    @NameInMap("is_end")
    @Validation(required = true)
    public Boolean isEnd;

    public static TransactionNode build(java.util.Map<String, ?> map) throws Exception {
        TransactionNode self = new TransactionNode();
        return TeaModel.build(map, self);
    }

    public TransactionNode setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public TransactionNode setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public TransactionNode setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TransactionNode setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public TransactionNode setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TransactionNode setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public TransactionNode setIsEnd(Boolean isEnd) {
        this.isEnd = isEnd;
        return this;
    }
    public Boolean getIsEnd() {
        return this.isEnd;
    }

}
