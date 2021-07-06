<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryContentriskInternalRequest extends Model
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

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 内容业务ID，用于进行异步识别结果的索引查询
    /**
     * @var string
     */
    public $appSceneDataId;

    // 内部参数
    /**
     * @var BizInfo
     */
    public $bizInfo;

    // 内容检测事件id，根据此id查询异步检测结果
    /**
     * @var string
     */
    public $eventId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneCode'         => 'scene_code',
        'appSceneDataId'    => 'app_scene_data_id',
        'bizInfo'           => 'biz_info',
        'eventId'           => 'event_id',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('appSceneDataId', $this->appSceneDataId, true);
        Model::validateRequired('bizInfo', $this->bizInfo, true);
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
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->appSceneDataId) {
            $res['app_scene_data_id'] = $this->appSceneDataId;
        }
        if (null !== $this->bizInfo) {
            $res['biz_info'] = null !== $this->bizInfo ? $this->bizInfo->toMap() : null;
        }
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContentriskInternalRequest
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
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['app_scene_data_id'])) {
            $model->appSceneDataId = $map['app_scene_data_id'];
        }
        if (isset($map['biz_info'])) {
            $model->bizInfo = BizInfo::fromMap($map['biz_info']);
        }
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }

        return $model;
    }
}
