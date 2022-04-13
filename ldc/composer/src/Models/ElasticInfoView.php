<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ElasticInfoView extends Model
{
    // 全局弹性状态，有效值：NORMAL，ELASTIC
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $status;

    // 弹性值
    /**
     * @example
     *
     * @var string[]
     */
    public $elasticValues;

    // 是否压测
    /**
     * @example true, false
     *
     * @var bool
     */
    public $press;
    protected $_name = [
        'status'        => 'status',
        'elasticValues' => 'elastic_values',
        'press'         => 'press',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->elasticValues) {
            $res['elastic_values'] = $this->elasticValues;
        }
        if (null !== $this->press) {
            $res['press'] = $this->press;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ElasticInfoView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['elastic_values'])) {
            if (!empty($map['elastic_values'])) {
                $model->elasticValues = $map['elastic_values'];
            }
        }
        if (isset($map['press'])) {
            $model->press = $map['press'];
        }

        return $model;
    }
}
