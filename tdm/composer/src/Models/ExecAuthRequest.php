<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class ExecAuthRequest extends Model
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

    // 授权协议
    /**
     * @var AuthAgreement
     */
    public $authAgreement;

    // 扩展字段,目前是一个json串，传入相关附加信息，如果对应的附加信息key不需要，可以不传，
    //
    // key对应的value数据字典由平台提供
    /**
     * @var string
     */
    public $content;

    // 授权租户身份ID：
    // 身份证号/统一社会组织机构信用码
    //
    //
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 请求流水号(64位 由平台方定义)_
    // 幂等标示
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

    // 核身产品类型
    /**
     * @var string
     */
    public $certificationType;

    // 核身信息
    //
    //
    /**
     * @var string
     */
    public $certificationInfo;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'authorizedIdentity'         => 'authorized_identity',
        'authorizedPlatformIdentity' => 'authorized_platform_identity',
        'authAgreement'              => 'auth_agreement',
        'content'                    => 'content',
        'dataOwnerIdentity'          => 'data_owner_identity',
        'requestId'                  => 'request_id',
        'targetCode'                 => 'target_code',
        'certificationType'          => 'certification_type',
        'certificationInfo'          => 'certification_info',
    ];

    public function validate()
    {
        Model::validateRequired('authorizedIdentity', $this->authorizedIdentity, true);
        Model::validateRequired('authorizedPlatformIdentity', $this->authorizedPlatformIdentity, true);
        Model::validateRequired('authAgreement', $this->authAgreement, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
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
        if (null !== $this->authAgreement) {
            $res['auth_agreement'] = null !== $this->authAgreement ? $this->authAgreement->toMap() : null;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->dataOwnerIdentity) {
            $res['data_owner_identity'] = $this->dataOwnerIdentity;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->targetCode) {
            $res['target_code'] = $this->targetCode;
        }
        if (null !== $this->certificationType) {
            $res['certification_type'] = $this->certificationType;
        }
        if (null !== $this->certificationInfo) {
            $res['certification_info'] = $this->certificationInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecAuthRequest
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
        if (isset($map['auth_agreement'])) {
            $model->authAgreement = AuthAgreement::fromMap($map['auth_agreement']);
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['data_owner_identity'])) {
            $model->dataOwnerIdentity = $map['data_owner_identity'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['target_code'])) {
            $model->targetCode = $map['target_code'];
        }
        if (isset($map['certification_type'])) {
            $model->certificationType = $map['certification_type'];
        }
        if (isset($map['certification_info'])) {
            $model->certificationInfo = $map['certification_info'];
        }

        return $model;
    }
}
