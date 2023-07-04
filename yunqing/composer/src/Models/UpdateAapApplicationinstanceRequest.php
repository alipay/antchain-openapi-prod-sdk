<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class UpdateAapApplicationinstanceRequest extends Model
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

    // 应用实例
    /**
     * @var ApplicationInstance
     */
    public $applicationInstance;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'siteCode'            => 'site_code',
        'applicationInstance' => 'application_instance',
    ];

    public function validate()
    {
        Model::validateRequired('siteCode', $this->siteCode, true);
        Model::validateRequired('applicationInstance', $this->applicationInstance, true);
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
        if (null !== $this->applicationInstance) {
            $res['application_instance'] = null !== $this->applicationInstance ? $this->applicationInstance->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAapApplicationinstanceRequest
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
        if (isset($map['application_instance'])) {
            $model->applicationInstance = ApplicationInstance::fromMap($map['application_instance']);
        }

        return $model;
    }
}
