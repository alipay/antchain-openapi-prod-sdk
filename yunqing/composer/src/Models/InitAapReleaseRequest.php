<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class InitAapReleaseRequest extends Model
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

    // 需要升级的产品实例
    /**
     * @var ProductDeployInitOptionRequest
     */
    public $productDeployInitOptionRequest;

    // 站点code
    /**
     * @var string
     */
    public $siteCode;
    protected $_name = [
        'authToken'                      => 'auth_token',
        'productInstanceId'              => 'product_instance_id',
        'productDeployInitOptionRequest' => 'product_deploy_init_option_request',
        'siteCode'                       => 'site_code',
    ];

    public function validate()
    {
        Model::validateRequired('productDeployInitOptionRequest', $this->productDeployInitOptionRequest, true);
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
        if (null !== $this->productDeployInitOptionRequest) {
            $res['product_deploy_init_option_request'] = null !== $this->productDeployInitOptionRequest ? $this->productDeployInitOptionRequest->toMap() : null;
        }
        if (null !== $this->siteCode) {
            $res['site_code'] = $this->siteCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitAapReleaseRequest
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
        if (isset($map['product_deploy_init_option_request'])) {
            $model->productDeployInitOptionRequest = ProductDeployInitOptionRequest::fromMap($map['product_deploy_init_option_request']);
        }
        if (isset($map['site_code'])) {
            $model->siteCode = $map['site_code'];
        }

        return $model;
    }
}
