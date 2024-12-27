// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class NoiseResult extends TeaModel {
    // success/failed/queuing/processing
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 声音大小
    @NameInMap("speaker_db")
    public String speakerDb;

    // 噪音值
    @NameInMap("noise_db")
    public String noiseDb;

    public static NoiseResult build(java.util.Map<String, ?> map) throws Exception {
        NoiseResult self = new NoiseResult();
        return TeaModel.build(map, self);
    }

    public NoiseResult setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public NoiseResult setSpeakerDb(String speakerDb) {
        this.speakerDb = speakerDb;
        return this;
    }
    public String getSpeakerDb() {
        return this.speakerDb;
    }

    public NoiseResult setNoiseDb(String noiseDb) {
        this.noiseDb = noiseDb;
        return this;
    }
    public String getNoiseDb() {
        return this.noiseDb;
    }

}
