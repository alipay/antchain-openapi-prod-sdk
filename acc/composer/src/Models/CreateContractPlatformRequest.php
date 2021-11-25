<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractPlatformRequest extends Model
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

    // 创建个人
    /**
     * @var Contractaccountapplication
     */
    public $creator;

    // 合同企业信息
    /**
     * @var Contractorganizationapplication
     */
    public $platform;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'creator'           => 'creator',
        'platform'          => 'platform',
    ];

    public function validate()
    {
        Model::validateRequired('creator', $this->creator, true);
        Model::validateRequired('platform', $this->platform, true);
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
        if (null !== $this->creator) {
            $res['creator'] = null !== $this->creator ? $this->creator->toMap() : null;
        }
        if (null !== $this->platform) {
            $res['platform'] = null !== $this->platform ? $this->platform->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractPlatformRequest
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
        if (isset($map['creator'])) {
            $model->creator = Contractaccountapplication::fromMap($map['creator']);
        }
        if (isset($map['platform'])) {
            $model->platform = Contractorganizationapplication::fromMap($map['platform']);
        }

        return $model;
    }
}
