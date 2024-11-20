<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class NotifyRdaasTaxCallbackRequest extends Model
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

    // 通知场景
    /**
     * @var string
     */
    public $notifyScene;

    // 租户号
    /**
     * @var string
     */
    public $instCode;

    // 解决方案id
    /**
     * @var string
     */
    public $solutionId;

    // 通知回调地址
    /**
     * @var string
     */
    public $callbackUrl;

    // 业务参数
    /**
     * @var string
     */
    public $jsonBizParams;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'notifyScene'       => 'notify_scene',
        'instCode'          => 'inst_code',
        'solutionId'        => 'solution_id',
        'callbackUrl'       => 'callback_url',
        'jsonBizParams'     => 'json_biz_params',
    ];

    public function validate()
    {
        Model::validateRequired('notifyScene', $this->notifyScene, true);
        Model::validateRequired('instCode', $this->instCode, true);
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
        if (null !== $this->notifyScene) {
            $res['notify_scene'] = $this->notifyScene;
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->solutionId) {
            $res['solution_id'] = $this->solutionId;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->jsonBizParams) {
            $res['json_biz_params'] = $this->jsonBizParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyRdaasTaxCallbackRequest
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
        if (isset($map['notify_scene'])) {
            $model->notifyScene = $map['notify_scene'];
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['solution_id'])) {
            $model->solutionId = $map['solution_id'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['json_biz_params'])) {
            $model->jsonBizParams = $map['json_biz_params'];
        }

        return $model;
    }
}
