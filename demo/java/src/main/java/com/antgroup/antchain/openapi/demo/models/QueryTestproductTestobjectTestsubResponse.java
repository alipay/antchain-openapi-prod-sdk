// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestproductTestobjectTestsubResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 主键
    @NameInMap("id")
    public Long id;

    // 姓名
    @NameInMap("name")
    public String name;

    // 性别
    @NameInMap("sex")
    public String sex;

    // 年龄
    @NameInMap("age")
    public Long age;

    public static QueryTestproductTestobjectTestsubResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTestproductTestobjectTestsubResponse self = new QueryTestproductTestobjectTestsubResponse();
        return TeaModel.build(map, self);
    }

    public QueryTestproductTestobjectTestsubResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTestproductTestobjectTestsubResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTestproductTestobjectTestsubResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTestproductTestobjectTestsubResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryTestproductTestobjectTestsubResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryTestproductTestobjectTestsubResponse setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getSex() {
        return this.sex;
    }

    public QueryTestproductTestobjectTestsubResponse setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

}
