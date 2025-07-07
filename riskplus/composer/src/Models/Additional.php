<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class Additional extends Model
{
    // 骑手标识；1-骑手
    /**
     * @example 1
     *
     * @var string
     */
    public $deliveryman;
    protected $_name = [
        'deliveryman' => 'deliveryman',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deliveryman) {
            $res['deliveryman'] = $this->deliveryman;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Additional
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['deliveryman'])) {
            $model->deliveryman = $map['deliveryman'];
        }

        return $model;
    }
}
