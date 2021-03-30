<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ReopenCreditDriverRequest extends Model
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

    // 产品id
    /**
     * @var string
     */
    public $productId;

    // 集团平台did
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 司机did
    /**
     * @var string
     */
    public $driverDid;

    // 云资金商户id
    /**
     * @var string
     */
    public $accountId;

    // 回调地址
    /**
     * @var string
     */
    public $callbackUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productId'         => 'product_id',
        'groupPlatformDid'  => 'group_platform_did',
        'driverDid'         => 'driver_did',
        'accountId'         => 'account_id',
        'callbackUrl'       => 'callback_url',
    ];

    public function validate()
    {
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('groupPlatformDid', $this->groupPlatformDid, true);
        Model::validateRequired('driverDid', $this->driverDid, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('callbackUrl', $this->callbackUrl, true);
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
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->driverDid) {
            $res['driver_did'] = $this->driverDid;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReopenCreditDriverRequest
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
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['group_platform_did'])) {
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if (isset($map['driver_did'])) {
            $model->driverDid = $map['driver_did'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }

        return $model;
    }
}
