// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_58d0e6ac9a1f4c75b8220234c093d952.models;

import com.aliyun.tea.*;

public class DogHome extends TeaModel {
    // 狗狗成员
    @NameInMap("dog_members")
    @Validation(required = true)
    public java.util.List<Dog> dogMembers;

    // 狗狗头目
    @NameInMap("leader")
    @Validation(required = true)
    public Dog leader;

    public static DogHome build(java.util.Map<String, ?> map) throws Exception {
        DogHome self = new DogHome();
        return TeaModel.build(map, self);
    }

    public DogHome setDogMembers(java.util.List<Dog> dogMembers) {
        this.dogMembers = dogMembers;
        return this;
    }
    public java.util.List<Dog> getDogMembers() {
        return this.dogMembers;
    }

    public DogHome setLeader(Dog leader) {
        this.leader = leader;
        return this;
    }
    public Dog getLeader() {
        return this.leader;
    }

}
