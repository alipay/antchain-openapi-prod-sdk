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

    // 授权token
    /**
     * @var string
     */
    public $accessToken;

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

    // 标签库组合：
    // 1表示基础标签
    // 2表示行业标签
    // 3表示基础标签+行业标签
    // 8表示自定义标签
    // 9表示基础标签+自定义标签
    // 10表示行业标签+自定义标签
    // 11表示基础标签+行业标签+自定义标签
    /**
     * @var int
     */
    public $type;

    // 设备信息
    /**
     * @var DeviceBean
     */
    public $deviceInfoList;

    // 基础标签动态参数（对外编码）
    /**
     * @var string[]
     */
    public $baseTags;

    // 行业标签动态参数（对外编码）
    /**
     * @var string[]
     */
    public $industyTags;

    // 规则标签动态参数（对外编码）
    /**
     * @var string[]
     */
    public $businessTags;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneCode'         => 'scene_code',
        'accessToken'       => 'access_token',
        'requestId'         => 'request_id',
        'os'                => 'os',
        'type'              => 'type',
        'deviceInfoList'    => 'device_info_list',
        'baseTags'          => 'base_tags',
        'industyTags'       => 'industy_tags',
        'businessTags'      => 'business_tags',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('accessToken', $this->accessToken, true);
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
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
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
        if (null !== $this->baseTags) {
            $res['base_tags'] = $this->baseTags;
        }
        if (null !== $this->industyTags) {
            $res['industy_tags'] = $this->industyTags;
        }
        if (null !== $this->businessTags) {
            $res['business_tags'] = $this->businessTags;
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
        if (isset($map['access_token'])) {
            $model->accessToken = $map['access_token'];
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
        if (isset($map['base_tags'])) {
            if (!empty($map['base_tags'])) {
                $model->baseTags = $map['base_tags'];
            }
        }
        if (isset($map['industy_tags'])) {
            if (!empty($map['industy_tags'])) {
                $model->industyTags = $map['industy_tags'];
            }
        }
        if (isset($map['business_tags'])) {
            if (!empty($map['business_tags'])) {
                $model->businessTags = $map['business_tags'];
            }
        }

        return $model;
    }
}
