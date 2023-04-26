<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ListXrXrverificationmodelinstanceRequest extends Model
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

    // 业务类型
    /**
     * @var string
     */
    public $bizScene;

    // 资源id
    /**
     * @var string
     */
    public $resourceId;

    // 核销类型
    /**
     * @var string
     */
    public $xrVerificationType;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'bizScene'           => 'biz_scene',
        'resourceId'         => 'resource_id',
        'xrVerificationType' => 'xr_verification_type',
    ];

    public function validate()
    {
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('xrVerificationType', $this->xrVerificationType, true);
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
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->xrVerificationType) {
            $res['xr_verification_type'] = $this->xrVerificationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListXrXrverificationmodelinstanceRequest
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
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['xr_verification_type'])) {
            $model->xrVerificationType = $map['xr_verification_type'];
        }

        return $model;
    }
}
