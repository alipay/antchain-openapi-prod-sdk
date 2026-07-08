<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateEcarGreencertificategenerationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 数据发生时间
    /**
     * @var string
     */
    public $date;

    // 逆变器发电量列表
    /**
     * @var InverterGeneration[]
     */
    public $inverterGenerations;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'date'                => 'date',
        'inverterGenerations' => 'inverter_generations',
    ];

    public function validate()
    {
        Model::validateRequired('date', $this->date, true);
        Model::validateRequired('inverterGenerations', $this->inverterGenerations, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->inverterGenerations) {
            $res['inverter_generations'] = [];
            if (null !== $this->inverterGenerations && \is_array($this->inverterGenerations)) {
                $n = 0;
                foreach ($this->inverterGenerations as $item) {
                    $res['inverter_generations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateEcarGreencertificategenerationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['inverter_generations'])) {
            if (!empty($map['inverter_generations'])) {
                $model->inverterGenerations = [];
                $n                          = 0;
                foreach ($map['inverter_generations'] as $item) {
                    $model->inverterGenerations[$n++] = null !== $item ? InverterGeneration::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
