<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyQmpPhonenumberstatusforsmsRequest extends Model
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

    // 12345
    /**
     * @var string
     */
    public $customerKey;

    // 用户模版类型
    /**
     * @var string
     */
    public $paramTemplate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'customerKey'       => 'customer_key',
        'paramTemplate'     => 'param_template',
    ];

    public function validate()
    {
        Model::validateRequired('customerKey', $this->customerKey, true);
        Model::validateRequired('paramTemplate', $this->paramTemplate, true);
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
        if (null !== $this->customerKey) {
            $res['customer_key'] = $this->customerKey;
        }
        if (null !== $this->paramTemplate) {
            $res['param_template'] = $this->paramTemplate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyQmpPhonenumberstatusforsmsRequest
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
        if (isset($map['customer_key'])) {
            $model->customerKey = $map['customer_key'];
        }
        if (isset($map['param_template'])) {
            $model->paramTemplate = $map['param_template'];
        }

        return $model;
    }
}
