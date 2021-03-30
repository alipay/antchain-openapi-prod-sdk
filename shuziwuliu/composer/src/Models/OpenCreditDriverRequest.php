<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class OpenCreditDriverRequest extends Model
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

    // 司机云资金商户ID
    /**
     * @var string
     */
    public $accountId;

    // 开通结果回调url
    /**
     * @var string
     */
    public $callbackUrl;

    // 司机分布式数字身份
    /**
     * @var string
     */
    public $driverDid;

    // 集团平台方分布式数字身份
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 产品id 目前填写 PRODUCT_MYBANK
    /**
     * @var string
     */
    public $productId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accountId'         => 'account_id',
        'callbackUrl'       => 'callback_url',
        'driverDid'         => 'driver_did',
        'groupPlatformDid'  => 'group_platform_did',
        'productId'         => 'product_id',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('callbackUrl', $this->callbackUrl, true);
        Model::validateRequired('driverDid', $this->driverDid, true);
        Model::validateRequired('groupPlatformDid', $this->groupPlatformDid, true);
        Model::validateRequired('productId', $this->productId, true);
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->driverDid) {
            $res['driver_did'] = $this->driverDid;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenCreditDriverRequest
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['driver_did'])) {
            $model->driverDid = $map['driver_did'];
        }
        if (isset($map['group_platform_did'])) {
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }

        return $model;
    }
}
