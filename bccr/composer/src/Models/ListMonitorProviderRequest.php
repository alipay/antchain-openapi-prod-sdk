<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ListMonitorProviderRequest extends Model
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

    // 需监测文件类型
    /**
     * @var MonitorType[]
     */
    public $monitorTypes;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'monitorTypes'      => 'monitor_types',
    ];

    public function validate()
    {
        Model::validateRequired('monitorTypes', $this->monitorTypes, true);
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
        if (null !== $this->monitorTypes) {
            $res['monitor_types'] = [];
            if (null !== $this->monitorTypes && \is_array($this->monitorTypes)) {
                $n = 0;
                foreach ($this->monitorTypes as $item) {
                    $res['monitor_types'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListMonitorProviderRequest
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
        if (isset($map['monitor_types'])) {
            if (!empty($map['monitor_types'])) {
                $model->monitorTypes = [];
                $n                   = 0;
                foreach ($map['monitor_types'] as $item) {
                    $model->monitorTypes[$n++] = null !== $item ? MonitorType::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
