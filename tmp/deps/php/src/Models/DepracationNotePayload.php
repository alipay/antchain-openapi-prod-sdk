<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class DepracationNotePayload extends Model {
    protected $_name = [
        'depracationNote' => 'depracation_note',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->depracationNote) {
            $res['depracation_note'] = $this->depracationNote;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DepracationNotePayload
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['depracation_note'])){
            $model->depracationNote = $map['depracation_note'];
        }
        return $model;
    }
    // depracationNote
    /**
     * @example depracationNote
     * @var string
     */
    public $depracationNote;

}
