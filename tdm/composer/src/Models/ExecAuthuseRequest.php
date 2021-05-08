<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class ExecAuthuseRequest extends Model
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

    // 被授权租户身份ID：
    //
    // 身份证号/统一社会组织机构信用码
    //
    //
    /**
     * @var string
     */
    public $authorizedIdentity;

    // 分配code
    //
    //
    /**
     * @var string
     */
    public $authorizedPlatformIdentity;

    // 授权租户身份ID：
    // 身份证号/统一社会组织机构信用码
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 扩展字段
    //
    //
    /**
     * @var string
     */
    public $extendParams;

    // 请求流水号
    //
    // 幂等标示
    //
    //
    /**
     * @var string
     */
    public $requestId;

    // 标的物
    //
    //
    /**
     * @var string
     */
    public $targetCode;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'authorizedIdentity'         => 'authorized_identity',
        'authorizedPlatformIdentity' => 'authorized_platform_identity',
        'dataOwnerIdentity'          => 'data_owner_identity',
        'extendParams'               => 'extend_params',
        'requestId'                  => 'request_id',
        'targetCode'                 => 'target_code',
    ];

    public function validate()
    {
        Model::validateRequired('authorizedIdentity', $this->authorizedIdentity, true);
        Model::validateRequired('authorizedPlatformIdentity', $this->authorizedPlatformIdentity, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('extendParams', $this->extendParams, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('targetCode', $this->targetCode, true);
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
        if (null !== $this->authorizedIdentity) {
            $res['authorized_identity'] = $this->authorizedIdentity;
        }
        if (null !== $this->authorizedPlatformIdentity) {
            $res['authorized_platform_identity'] = $this->authorizedPlatformIdentity;
        }
        if (null !== $this->dataOwnerIdentity) {
            $res['data_owner_identity'] = $this->dataOwnerIdentity;
        }
        if (null !== $this->extendParams) {
            $res['extend_params'] = $this->extendParams;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->targetCode) {
            $res['target_code'] = $this->targetCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecAuthuseRequest
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
        if (isset($map['authorized_identity'])) {
            $model->authorizedIdentity = $map['authorized_identity'];
        }
        if (isset($map['authorized_platform_identity'])) {
            $model->authorizedPlatformIdentity = $map['authorized_platform_identity'];
        }
        if (isset($map['data_owner_identity'])) {
            $model->dataOwnerIdentity = $map['data_owner_identity'];
        }
        if (isset($map['extend_params'])) {
            $model->extendParams = $map['extend_params'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['target_code'])) {
            $model->targetCode = $map['target_code'];
        }

        return $model;
    }
}
