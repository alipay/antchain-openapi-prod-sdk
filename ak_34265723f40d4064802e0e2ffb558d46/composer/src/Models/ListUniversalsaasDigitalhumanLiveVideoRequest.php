<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_34265723f40d4064802e0e2ffb558d46\Models;

use AlibabaCloud\Tea\Model;

class ListUniversalsaasDigitalhumanLiveVideoRequest extends Model
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

    // bUC_Weh3
    /**
     * @var string
     */
    public $tenantCode;

    // 蚂蚁数字人平台直播id
    /**
     * @var string
     */
    public $liveId;

    // all全部、normal常规、temporary临时插播
    /**
     * @var string
     */
    public $videoType;

    // 业务标识
    /**
     * @var string
     */
    public $bizName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantCode'        => 'tenant_code',
        'liveId'            => 'live_id',
        'videoType'         => 'video_type',
        'bizName'           => 'biz_name',
    ];

    public function validate()
    {
        Model::validateRequired('tenantCode', $this->tenantCode, true);
        Model::validateRequired('liveId', $this->liveId, true);
        Model::validateRequired('videoType', $this->videoType, true);
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
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->liveId) {
            $res['live_id'] = $this->liveId;
        }
        if (null !== $this->videoType) {
            $res['video_type'] = $this->videoType;
        }
        if (null !== $this->bizName) {
            $res['biz_name'] = $this->bizName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListUniversalsaasDigitalhumanLiveVideoRequest
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
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }
        if (isset($map['live_id'])) {
            $model->liveId = $map['live_id'];
        }
        if (isset($map['video_type'])) {
            $model->videoType = $map['video_type'];
        }
        if (isset($map['biz_name'])) {
            $model->bizName = $map['biz_name'];
        }

        return $model;
    }
}
