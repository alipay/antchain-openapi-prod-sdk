<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeploySceneRequest extends Model
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

    // 场景名称
    /**
     * @var string
     */
    public $sceneName;

    // 链ID
    /**
     * @var string
     */
    public $bnaasBasicServiceDid;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'sceneName'            => 'scene_name',
        'bnaasBasicServiceDid' => 'bnaas_basic_service_did',
    ];

    public function validate()
    {
        Model::validateRequired('sceneName', $this->sceneName, true);
        Model::validateRequired('bnaasBasicServiceDid', $this->bnaasBasicServiceDid, true);
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
        if (null !== $this->sceneName) {
            $res['scene_name'] = $this->sceneName;
        }
        if (null !== $this->bnaasBasicServiceDid) {
            $res['bnaas_basic_service_did'] = $this->bnaasBasicServiceDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeploySceneRequest
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
        if (isset($map['scene_name'])) {
            $model->sceneName = $map['scene_name'];
        }
        if (isset($map['bnaas_basic_service_did'])) {
            $model->bnaasBasicServiceDid = $map['bnaas_basic_service_did'];
        }

        return $model;
    }
}
