<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TimeRange extends Model {
    protected $_name = [
        'start' => 'start',
        'end' => 'end',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TimeRange
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['start'])){
            $model->start = $map['start'];
        }
        if(isset($map['end'])){
            $model->end = $map['end'];
        }
        return $model;
    }
    // start
    /**
     * @example start
     * @var int
     */
    public $start;

    // end
    /**
     * @example end
     * @var int
     */
    public $end;

}
