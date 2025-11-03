<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class UpdateAicoguardcoreMeiyouRequest extends Model
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

    // 更新信息
    /**
     * @var string
     */
    public $resultInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'resultInfo'        => 'result_info',
    ];

    public function validate()
    {
        Model::validateRequired('resultInfo', $this->resultInfo, true);
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
        if (null !== $this->resultInfo) {
            $res['result_info'] = $this->resultInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAicoguardcoreMeiyouRequest
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
        if (isset($map['result_info'])) {
            $model->resultInfo = $map['result_info'];
        }

        return $model;
    }
}
