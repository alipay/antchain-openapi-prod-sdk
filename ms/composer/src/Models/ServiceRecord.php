<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ServiceRecord extends Model
{
    // 服务标识
    /**
     * @example com.alipay.sofa.demo.Facade:1.0@DEFAULT
     *
     * @var string
     */
    public $dataId;
    protected $_name = [
        'dataId' => 'data_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }

        return $model;
    }
}
