<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMONRCSMART\Models;

use AlibabaCloud\Tea\Model;

class ConfirmRcApprovalImageRequest extends Model
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

    // 请求ID
    /**
     * @var string
     */
    public $requestId;

    // 审核场景列表
    /**
     * @var string[]
     */
    public $scenes;

    // 审核文件内容
    /**
     * @var DataVo
     */
    public $dataVo;

    // 登录账号；默认使用主账号
    /**
     * @var string
     */
    public $loginName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId'         => 'request_id',
        'scenes'            => 'scenes',
        'dataVo'            => 'data_vo',
        'loginName'         => 'login_name',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('scenes', $this->scenes, true);
        Model::validateRequired('dataVo', $this->dataVo, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->scenes) {
            $res['scenes'] = $this->scenes;
        }
        if (null !== $this->dataVo) {
            $res['data_vo'] = null !== $this->dataVo ? $this->dataVo->toMap() : null;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmRcApprovalImageRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['scenes'])) {
            if (!empty($map['scenes'])) {
                $model->scenes = $map['scenes'];
            }
        }
        if (isset($map['data_vo'])) {
            $model->dataVo = DataVo::fromMap($map['data_vo']);
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }

        return $model;
    }
}
