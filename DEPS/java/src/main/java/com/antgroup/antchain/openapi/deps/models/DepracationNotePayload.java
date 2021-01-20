// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DepracationNotePayload extends TeaModel {
    // depracationNote
    @NameInMap("depracation_note")
    public String depracationNote;

    public static DepracationNotePayload build(java.util.Map<String, ?> map) throws Exception {
        DepracationNotePayload self = new DepracationNotePayload();
        return TeaModel.build(map, self);
    }

    public DepracationNotePayload setDepracationNote(String depracationNote) {
        this.depracationNote = depracationNote;
        return this;
    }
    public String getDepracationNote() {
        return this.depracationNote;
    }

}
