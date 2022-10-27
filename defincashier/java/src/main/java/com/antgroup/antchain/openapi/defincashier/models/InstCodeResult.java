// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class InstCodeResult extends TeaModel {
    // 机构编码
    // 
    @NameInMap("channel_member_code")
    public String channelMemberCode;

    // 机构网点联行号
    // 
    @NameInMap("channel_official_number")
    public String channelOfficialNumber;

    // 业务错误码(为空表示成功，否则为业务错误码)
    @NameInMap("sub_code")
    public String subCode;

    // 业务错误描述
    @NameInMap("sub_msg")
    public String subMsg;

    public static InstCodeResult build(java.util.Map<String, ?> map) throws Exception {
        InstCodeResult self = new InstCodeResult();
        return TeaModel.build(map, self);
    }

    public InstCodeResult setChannelMemberCode(String channelMemberCode) {
        this.channelMemberCode = channelMemberCode;
        return this;
    }
    public String getChannelMemberCode() {
        return this.channelMemberCode;
    }

    public InstCodeResult setChannelOfficialNumber(String channelOfficialNumber) {
        this.channelOfficialNumber = channelOfficialNumber;
        return this;
    }
    public String getChannelOfficialNumber() {
        return this.channelOfficialNumber;
    }

    public InstCodeResult setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public InstCodeResult setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
