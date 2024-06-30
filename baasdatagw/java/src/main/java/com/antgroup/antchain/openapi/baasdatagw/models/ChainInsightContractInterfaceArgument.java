// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightContractInterfaceArgument extends TeaModel {
    // 参数名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 参数类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 参数位置，枚举：input，output，deposit
    @NameInMap("location")
    @Validation(required = true)
    public String location;

    // 参数的业务名称
    @NameInMap("comment")
    public String comment;

    // 用于在更新参数配置时，声明是否需要删除该参数的 comment 内容
    @NameInMap("delete_comment")
    public Boolean deleteComment;

    // 对应的标准 ERC 参数的名称，例如：标准ERC1155 TransferBatch事件中的operator
    @NameInMap("standard_erc_name")
    public String standardErcName;

    // 是否进行数据脱敏
    @NameInMap("need_desensitization")
    public Boolean needDesensitization;

    // 子参数列表
    @NameInMap("sub_args")
    public ChainInsightContractInterfaceArgumentList subArgs;

    public static ChainInsightContractInterfaceArgument build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightContractInterfaceArgument self = new ChainInsightContractInterfaceArgument();
        return TeaModel.build(map, self);
    }

    public ChainInsightContractInterfaceArgument setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ChainInsightContractInterfaceArgument setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ChainInsightContractInterfaceArgument setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ChainInsightContractInterfaceArgument setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ChainInsightContractInterfaceArgument setDeleteComment(Boolean deleteComment) {
        this.deleteComment = deleteComment;
        return this;
    }
    public Boolean getDeleteComment() {
        return this.deleteComment;
    }

    public ChainInsightContractInterfaceArgument setStandardErcName(String standardErcName) {
        this.standardErcName = standardErcName;
        return this;
    }
    public String getStandardErcName() {
        return this.standardErcName;
    }

    public ChainInsightContractInterfaceArgument setNeedDesensitization(Boolean needDesensitization) {
        this.needDesensitization = needDesensitization;
        return this;
    }
    public Boolean getNeedDesensitization() {
        return this.needDesensitization;
    }

    public ChainInsightContractInterfaceArgument setSubArgs(ChainInsightContractInterfaceArgumentList subArgs) {
        this.subArgs = subArgs;
        return this;
    }
    public ChainInsightContractInterfaceArgumentList getSubArgs() {
        return this.subArgs;
    }

}
