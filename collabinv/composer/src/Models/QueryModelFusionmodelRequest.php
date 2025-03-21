<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class QueryModelFusionmodelRequest extends Model
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

    // 融合模型编码
    /**
     * @var string
     */
    public $fusionModelCode;

    // 模型调用的id，一般是用户id 可能是用户手机号或者身份照号码的md5
    /**
     * @var string
     */
    public $identity;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fusionModelCode'   => 'fusion_model_code',
        'identity'          => 'identity',
    ];

    public function validate()
    {
        Model::validateRequired('fusionModelCode', $this->fusionModelCode, true);
        Model::validateRequired('identity', $this->identity, true);
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
        if (null !== $this->fusionModelCode) {
            $res['fusion_model_code'] = $this->fusionModelCode;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryModelFusionmodelRequest
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
        if (isset($map['fusion_model_code'])) {
            $model->fusionModelCode = $map['fusion_model_code'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }

        return $model;
    }
}
