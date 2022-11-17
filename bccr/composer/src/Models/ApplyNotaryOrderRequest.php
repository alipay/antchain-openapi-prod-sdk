<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ApplyNotaryOrderRequest extends Model
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

    // 公证出证申请信息
    /**
     * @var NotaryApplyInfo
     */
    public $notaryApplyInfo;

    // 公证出证收件信息
    /**
     * @var NotaryReceiveInfo
     */
    public $notaryReceiveInfo;

    // 用户预览签署文件的时间
    /**
     * @var int
     */
    public $previewTime;

    // 用户签署文件时间
    /**
     * @var int
     */
    public $agreeTime;

    // 客户端令牌
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'notaryApplyInfo'   => 'notary_apply_info',
        'notaryReceiveInfo' => 'notary_receive_info',
        'previewTime'       => 'preview_time',
        'agreeTime'         => 'agree_time',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('notaryApplyInfo', $this->notaryApplyInfo, true);
        Model::validateRequired('notaryReceiveInfo', $this->notaryReceiveInfo, true);
        Model::validateRequired('previewTime', $this->previewTime, true);
        Model::validateRequired('agreeTime', $this->agreeTime, true);
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
        if (null !== $this->notaryApplyInfo) {
            $res['notary_apply_info'] = null !== $this->notaryApplyInfo ? $this->notaryApplyInfo->toMap() : null;
        }
        if (null !== $this->notaryReceiveInfo) {
            $res['notary_receive_info'] = null !== $this->notaryReceiveInfo ? $this->notaryReceiveInfo->toMap() : null;
        }
        if (null !== $this->previewTime) {
            $res['preview_time'] = $this->previewTime;
        }
        if (null !== $this->agreeTime) {
            $res['agree_time'] = $this->agreeTime;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyNotaryOrderRequest
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
        if (isset($map['notary_apply_info'])) {
            $model->notaryApplyInfo = NotaryApplyInfo::fromMap($map['notary_apply_info']);
        }
        if (isset($map['notary_receive_info'])) {
            $model->notaryReceiveInfo = NotaryReceiveInfo::fromMap($map['notary_receive_info']);
        }
        if (isset($map['preview_time'])) {
            $model->previewTime = $map['preview_time'];
        }
        if (isset($map['agree_time'])) {
            $model->agreeTime = $map['agree_time'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
