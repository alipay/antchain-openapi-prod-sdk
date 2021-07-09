<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UpdateContractPlatformRequest extends Model
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

    // 平台方企业信息
    /**
     * @var ContractPlatformOrganizationApplication
     */
    public $platform;

    // 平台方经办人信息
    /**
     * @var ContractPlatformAccountApplication
     */
    public $creator;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'platform'          => 'platform',
        'creator'           => 'creator',
    ];

    public function validate()
    {
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
        if (null !== $this->platform) {
            $res['platform'] = null !== $this->platform ? $this->platform->toMap() : null;
        }
        if (null !== $this->creator) {
            $res['creator'] = null !== $this->creator ? $this->creator->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateContractPlatformRequest
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
        if (isset($map['platform'])) {
            $model->platform = ContractPlatformOrganizationApplication::fromMap($map['platform']);
        }
        if (isset($map['creator'])) {
            $model->creator = ContractPlatformAccountApplication::fromMap($map['creator']);
        }

        return $model;
    }
}
