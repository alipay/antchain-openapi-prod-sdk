// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_58d0e6ac9a1f4c75b8220234c093d952.models;

import com.aliyun.tea.*;

public class Dog extends TeaModel {
    // 名字
    @NameInMap("name")
    @Validation(required = true, maxLength = 32, minLength = 2)
    public String name;

    // 年龄
    @NameInMap("age")
    @Validation(required = true, maximum = 100)
    public Long age;

    // 是否已领养
    @NameInMap("is_adopted")
    @Validation(required = true)
    public Boolean isAdopted;

    // 领养时间
    @NameInMap("adopted_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String adoptedDate;

    // 标记
    @NameInMap("marks")
    public java.util.List<String> marks;

    public static Dog build(java.util.Map<String, ?> map) throws Exception {
        Dog self = new Dog();
        return TeaModel.build(map, self);
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Dog setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

    public Dog setIsAdopted(Boolean isAdopted) {
        this.isAdopted = isAdopted;
        return this;
    }
    public Boolean getIsAdopted() {
        return this.isAdopted;
    }

    public Dog setAdoptedDate(String adoptedDate) {
        this.adoptedDate = adoptedDate;
        return this;
    }
    public String getAdoptedDate() {
        return this.adoptedDate;
    }

    public Dog setMarks(java.util.List<String> marks) {
        this.marks = marks;
        return this;
    }
    public java.util.List<String> getMarks() {
        return this.marks;
    }

}
