<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class OpsFilter extends Model {
    protected $_name = [
        'black' => 'black',
        'names' => 'names',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->black) {
            $res['black'] = $this->black;
        }
        if (null !== $this->names) {
            $res['names'] = $this->names;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpsFilter
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['black'])){
            $model->black = $map['black'];
        }
        if(isset($map['names'])){
            if(!empty($map['names'])){
                $model->names = $map['names'];
            }
        }
        return $model;
    }
    // black
    /**
     * @example true, false
     * @var bool
     */
    public $black;

    // names
    /**
     * @example names
     * @var string[]
     */
    public $names;

}
