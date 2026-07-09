<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateXrXrticketpoolRequest extends Model
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

    // 券池名称
    /**
     * @var string
     */
    public $xrTicketPoolName;

    // 资源id
    /**
     * @var string
     */
    public $resourceId;

    // 通行证有效期
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

    // 券池剩余数量
    /**
     * @var int
     */
    public $surplusCount;

    // 核销类型，资源id改变时必须有值
    /**
     * @var string
     */
    public $xrVerificationType;

    // 业务类型
    /**
     * @var string
     */
    public $bizScene;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'xrTicketPoolName'   => 'xr_ticket_pool_name',
        'resourceId'         => 'resource_id',
        'validTime'          => 'valid_time',
        'testTime'           => 'test_time',
        'xrApps'             => 'xr_apps',
        'surplusCount'       => 'surplus_count',
        'xrVerificationType' => 'xr_verification_type',
        'bizScene'           => 'biz_scene',
    ];

    public function validate()
    {
        Model::validateRequired('xrTicketPoolName', $this->xrTicketPoolName, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
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
        if (null !== $this->xrTicketPoolName) {
            $res['xr_ticket_pool_name'] = $this->xrTicketPoolName;
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
        if (null !== $this->surplusCount) {
            $res['surplus_count'] = $this->surplusCount;
        }
        if (null !== $this->xrVerificationType) {
            $res['xr_verification_type'] = $this->xrVerificationType;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateXrXrticketpoolRequest
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
        if (isset($map['xr_ticket_pool_name'])) {
            $model->xrTicketPoolName = $map['xr_ticket_pool_name'];
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
        if (isset($map['surplus_count'])) {
            $model->surplusCount = $map['surplus_count'];
        }
        if (isset($map['xr_verification_type'])) {
            $model->xrVerificationType = $map['xr_verification_type'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }

        return $model;
    }
}
