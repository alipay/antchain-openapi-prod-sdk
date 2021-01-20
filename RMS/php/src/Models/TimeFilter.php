<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TimeFilter extends Model {
    protected $_name = [
        'from' => 'from',
        'to' => 'to',
        'weeks' => 'weeks',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->weeks) {
            $res['weeks'] = $this->weeks;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TimeFilter
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['from'])){
            $model->from = $map['from'];
        }
        if(isset($map['to'])){
            $model->to = $map['to'];
        }
        if(isset($map['weeks'])){
            if(!empty($map['weeks'])){
                $model->weeks = $map['weeks'];
            }
        }
        return $model;
    }
    // from
    /**
     * @example from
     * @var string
     */
    public $from;

    // to
    /**
     * @example to
     * @var string
     */
    public $to;

    // weeks
    /**
     * @example weeks
     * @var int[]
     */
    public $weeks;

}
