<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class DeployAapProductinstanceRequest extends Model
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

    // 站点code
    /**
     * @var string
     */
    public $siteCode;

    // 产品部署参数
    /**
     * @var ProductDeployInitOption[]
     */
    public $productDeployInitOptions;
    protected $_name = [
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
        'siteCode'                 => 'site_code',
        'productDeployInitOptions' => 'product_deploy_init_options',
    ];

    public function validate()
    {
        Model::validateRequired('siteCode', $this->siteCode, true);
        Model::validateRequired('productDeployInitOptions', $this->productDeployInitOptions, true);
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
        if (null !== $this->siteCode) {
            $res['site_code'] = $this->siteCode;
        }
        if (null !== $this->productDeployInitOptions) {
            $res['product_deploy_init_options'] = [];
            if (null !== $this->productDeployInitOptions && \is_array($this->productDeployInitOptions)) {
                $n = 0;
                foreach ($this->productDeployInitOptions as $item) {
                    $res['product_deploy_init_options'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeployAapProductinstanceRequest
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
        if (isset($map['site_code'])) {
            $model->siteCode = $map['site_code'];
        }
        if (isset($map['product_deploy_init_options'])) {
            if (!empty($map['product_deploy_init_options'])) {
                $model->productDeployInitOptions = [];
                $n                               = 0;
                foreach ($map['product_deploy_init_options'] as $item) {
                    $model->productDeployInitOptions[$n++] = null !== $item ? ProductDeployInitOption::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
