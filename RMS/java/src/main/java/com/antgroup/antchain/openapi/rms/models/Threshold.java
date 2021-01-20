// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Threshold extends TeaModel {
    // level1
    @NameInMap("level1")
    public String level1;

    // level2
    @NameInMap("level2")
    public String level2;

    // level3
    @NameInMap("level3")
    public String level3;

    // im
    @NameInMap("im")
    public String im;

    // sms
    @NameInMap("sms")
    public String sms;

    // control_plan
    @NameInMap("control_plan")
    public String controlPlan;

    public static Threshold build(java.util.Map<String, ?> map) throws Exception {
        Threshold self = new Threshold();
        return TeaModel.build(map, self);
    }

    public Threshold setLevel1(String level1) {
        this.level1 = level1;
        return this;
    }
    public String getLevel1() {
        return this.level1;
    }

    public Threshold setLevel2(String level2) {
        this.level2 = level2;
        return this;
    }
    public String getLevel2() {
        return this.level2;
    }

    public Threshold setLevel3(String level3) {
        this.level3 = level3;
        return this;
    }
    public String getLevel3() {
        return this.level3;
    }

    public Threshold setIm(String im) {
        this.im = im;
        return this;
    }
    public String getIm() {
        return this.im;
    }

    public Threshold setSms(String sms) {
        this.sms = sms;
        return this;
    }
    public String getSms() {
        return this.sms;
    }

    public Threshold setControlPlan(String controlPlan) {
        this.controlPlan = controlPlan;
        return this;
    }
    public String getControlPlan() {
        return this.controlPlan;
    }

}
