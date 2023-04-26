<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateXrUserticketRequest extends Model
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

    // 所属业务
    /**
     * @var string
     */
    public $bizScene;

    // 用户通行证编码
    /**
     * @var string
     */
    public $xrTicketCode;

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 核销动作
    // open_screen（设备开屏）
    /**
     * @var string
     */
    public $xrVerificationOperate;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'bizScene'              => 'biz_scene',
        'xrTicketCode'          => 'xr_ticket_code',
        'userId'                => 'user_id',
        'instanceId'            => 'instance_id',
        'xrVerificationOperate' => 'xr_verification_operate',
    ];

    public function validate()
    {
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('xrTicketCode', $this->xrTicketCode, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->xrTicketCode) {
            $res['xr_ticket_code'] = $this->xrTicketCode;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->xrVerificationOperate) {
            $res['xr_verification_operate'] = $this->xrVerificationOperate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateXrUserticketRequest
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
        if (isset($map['xr_ticket_code'])) {
            $model->xrTicketCode = $map['xr_ticket_code'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['xr_verification_operate'])) {
            $model->xrVerificationOperate = $map['xr_verification_operate'];
        }

        return $model;
    }
}
