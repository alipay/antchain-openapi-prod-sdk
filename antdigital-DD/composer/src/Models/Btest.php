<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\ATest;

class Btest extends Model {
    protected $_name = [
        'atest' => 'atest',
    ];
    public function validate() {
        Model::validateRequired('atest', $this->atest, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->atest) {
            $res['atest'] = null !== $this->atest ? $this->atest->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Btest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['atest'])){
            $model->atest = ATest::fromMap($map['atest']);
        }
        return $model;
    }
    // atest
    /**
     * @example atest
     * @var ATest
     */
    public $atest;

}
