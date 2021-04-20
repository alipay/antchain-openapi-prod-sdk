<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class GetIsvSharecodeRequest extends Model
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

    // 电话号码/邮箱等登陆名
    /**
     * @var string
     */
    public $logonId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'logonId'           => 'logon_id',
    ];

    public function validate()
    {
        Model::validateRequired('logonId', $this->logonId, true);
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
        if (null !== $this->logonId) {
            $res['logon_id'] = $this->logonId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetIsvSharecodeRequest
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
        if (isset($map['logon_id'])) {
            $model->logonId = $map['logon_id'];
        }

        return $model;
    }
}
