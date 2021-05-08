<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthRequest extends Model
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
    // 身份证号/统一社会组织机构信用码
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

    // 扩展信息
    /**
     * @var string
     */
    public $extendParams;

    // 标的物
    //
    //
    /**
     * @var string
     */
    public $targetCode;

    // 请求流水号幂等标示
    /**
     * @var string
     */
    public $requestId;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'authorizedIdentity'         => 'authorized_identity',
        'authorizedPlatformIdentity' => 'authorized_platform_identity',
        'dataOwnerIdentity'          => 'data_owner_identity',
        'extendParams'               => 'extend_params',
        'targetCode'                 => 'target_code',
        'requestId'                  => 'request_id',
    ];

    public function validate()
    {
        Model::validateRequired('authorizedIdentity', $this->authorizedIdentity, true);
        Model::validateRequired('authorizedPlatformIdentity', $this->authorizedPlatformIdentity, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('extendParams', $this->extendParams, true);
        Model::validateRequired('targetCode', $this->targetCode, true);
        Model::validateRequired('requestId', $this->requestId, true);
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
        if (null !== $this->targetCode) {
            $res['target_code'] = $this->targetCode;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthRequest
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
        if (isset($map['target_code'])) {
            $model->targetCode = $map['target_code'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }

        return $model;
    }
}
