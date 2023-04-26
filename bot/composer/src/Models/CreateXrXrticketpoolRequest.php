<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateXrXrticketpoolRequest extends Model
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

    // 有效期
    /**
     * @var string
     */
    public $validTime;

    // 体验时长
    /**
     * @var int
     */
    public $testTime;

    // vr设备集合
    /**
     * @var string
     */
    public $xrApps;

    // 券池数量，能发多少张券
    /**
     * @var int
     */
    public $maxPoolCount;

    // 券池名称
    /**
     * @var string
     */
    public $xrTicketPoolName;

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
        'validTime'          => 'valid_time',
        'testTime'           => 'test_time',
        'xrApps'             => 'xr_apps',
        'maxPoolCount'       => 'max_pool_count',
        'xrTicketPoolName'   => 'xr_ticket_pool_name',
        'xrVerificationType' => 'xr_verification_type',
    ];

    public function validate()
    {
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('validTime', $this->validTime, true);
        Model::validateRequired('testTime', $this->testTime, true);
        Model::validateRequired('maxPoolCount', $this->maxPoolCount, true);
        Model::validateRequired('xrTicketPoolName', $this->xrTicketPoolName, true);
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
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }
        if (null !== $this->testTime) {
            $res['test_time'] = $this->testTime;
        }
        if (null !== $this->xrApps) {
            $res['xr_apps'] = $this->xrApps;
        }
        if (null !== $this->maxPoolCount) {
            $res['max_pool_count'] = $this->maxPoolCount;
        }
        if (null !== $this->xrTicketPoolName) {
            $res['xr_ticket_pool_name'] = $this->xrTicketPoolName;
        }
        if (null !== $this->xrVerificationType) {
            $res['xr_verification_type'] = $this->xrVerificationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateXrXrticketpoolRequest
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
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }
        if (isset($map['test_time'])) {
            $model->testTime = $map['test_time'];
        }
        if (isset($map['xr_apps'])) {
            $model->xrApps = $map['xr_apps'];
        }
        if (isset($map['max_pool_count'])) {
            $model->maxPoolCount = $map['max_pool_count'];
        }
        if (isset($map['xr_ticket_pool_name'])) {
            $model->xrTicketPoolName = $map['xr_ticket_pool_name'];
        }
        if (isset($map['xr_verification_type'])) {
            $model->xrVerificationType = $map['xr_verification_type'];
        }

        return $model;
    }
}
