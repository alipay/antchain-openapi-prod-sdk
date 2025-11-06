<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GetDataAuthConfigRequest extends Model
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

    // 授权场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 企业信用代码
    /**
     * @var string
     */
    public $enterpriseCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneCode'         => 'scene_code',
        'enterpriseCode'    => 'enterprise_code',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('enterpriseCode', $this->enterpriseCode, true);
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
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->enterpriseCode) {
            $res['enterprise_code'] = $this->enterpriseCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDataAuthConfigRequest
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
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['enterprise_code'])) {
            $model->enterpriseCode = $map['enterprise_code'];
        }

        return $model;
    }
}
