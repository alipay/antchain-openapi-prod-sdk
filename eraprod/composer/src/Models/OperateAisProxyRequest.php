<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ERAPROD\Models;

use AlibabaCloud\Tea\Model;

class OperateAisProxyRequest extends Model
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

    // 入参json
    /**
     * @var string
     */
    public $bizData;

    // 系统参数
    /**
     * @var string
     */
    public $systemData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizData'           => 'biz_data',
        'systemData'        => 'system_data',
    ];

    public function validate()
    {
        Model::validateRequired('bizData', $this->bizData, true);
        Model::validateRequired('systemData', $this->systemData, true);
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
        if (null !== $this->bizData) {
            $res['biz_data'] = $this->bizData;
        }
        if (null !== $this->systemData) {
            $res['system_data'] = $this->systemData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateAisProxyRequest
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
        if (isset($map['biz_data'])) {
            $model->bizData = $map['biz_data'];
        }
        if (isset($map['system_data'])) {
            $model->systemData = $map['system_data'];
        }

        return $model;
    }
}
