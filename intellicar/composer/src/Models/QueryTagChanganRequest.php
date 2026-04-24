<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class QueryTagChanganRequest extends Model
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

    // 请求唯一ID（UUID生成即可）
    /**
     * @var string
     */
    public $requestId;

    // 系统
    /**
     * @var string
     */
    public $os;

    // 1表示定制标签查询
    // 2表示标准标签查询
    // 3表示全量标签查询
    /**
     * @var int
     */
    public $type;

    // 设备信息
    /**
     * @var DeviceBean
     */
    public $deviceInfoList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneCode'         => 'scene_code',
        'requestId'         => 'request_id',
        'os'                => 'os',
        'type'              => 'type',
        'deviceInfoList'    => 'device_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('deviceInfoList', $this->deviceInfoList, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->os) {
            $res['os'] = $this->os;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->deviceInfoList) {
            $res['device_info_list'] = null !== $this->deviceInfoList ? $this->deviceInfoList->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTagChanganRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['os'])) {
            $model->os = $map['os'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['device_info_list'])) {
            $model->deviceInfoList = DeviceBean::fromMap($map['device_info_list']);
        }

        return $model;
    }
}
