<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SendCreditProxyRequest extends Model
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

    // 代理请求方法名
    /**
     * @var string
     */
    public $applyMethod;

    // 代理请求数据
    /**
     * @var string
     */
    public $applyData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applyMethod'       => 'apply_method',
        'applyData'         => 'apply_data',
    ];

    public function validate()
    {
        Model::validateRequired('applyMethod', $this->applyMethod, true);
        Model::validateRequired('applyData', $this->applyData, true);
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
        if (null !== $this->applyMethod) {
            $res['apply_method'] = $this->applyMethod;
        }
        if (null !== $this->applyData) {
            $res['apply_data'] = $this->applyData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendCreditProxyRequest
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
        if (isset($map['apply_method'])) {
            $model->applyMethod = $map['apply_method'];
        }
        if (isset($map['apply_data'])) {
            $model->applyData = $map['apply_data'];
        }

        return $model;
    }
}
