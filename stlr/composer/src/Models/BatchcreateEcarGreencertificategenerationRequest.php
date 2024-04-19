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

    // 设备发电量列表
    /**
     * @var DeviceGeneration[]
     */
    public $generation;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'date'              => 'date',
        'generation'        => 'generation',
    ];

    public function validate()
    {
        Model::validateRequired('date', $this->date, true);
        Model::validateRequired('generation', $this->generation, true);
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
        if (null !== $this->generation) {
            $res['generation'] = [];
            if (null !== $this->generation && \is_array($this->generation)) {
                $n = 0;
                foreach ($this->generation as $item) {
                    $res['generation'][$n++] = null !== $item ? $item->toMap() : $item;
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
        if (isset($map['generation'])) {
            if (!empty($map['generation'])) {
                $model->generation = [];
                $n                 = 0;
                foreach ($map['generation'] as $item) {
                    $model->generation[$n++] = null !== $item ? DeviceGeneration::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
