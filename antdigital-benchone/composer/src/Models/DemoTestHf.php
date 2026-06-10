<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BENCHONE\Models;

use AlibabaCloud\Tea\Model;

class DemoTestHf extends Model
{
    // test
    /**
     * @example undefined
     *
     * @var ResultTest
     */
    public $info;
    protected $_name = [
        'info' => 'info',
    ];

    public function validate()
    {
        Model::validateRequired('info', $this->info, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->info) {
            $res['info'] = null !== $this->info ? $this->info->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DemoTestHf
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['info'])) {
            $model->info = ResultTest::fromMap($map['info']);
        }

        return $model;
    }
}
