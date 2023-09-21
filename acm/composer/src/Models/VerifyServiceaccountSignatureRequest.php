<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class VerifyServiceaccountSignatureRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 系统来源
    /**
     * @var string
     */
    public $sourceSystem;

    // AK
    //
    /**
     * @var string
     */
    public $userAccessKey;

    // aksk加签结果
    /**
     * @var string
     */
    public $signatureResult;

    // 待加签内容
    /**
     * @var string
     */
    public $signatureText;

    // 加签算法
    /**
     * @var string
     */
    public $signatureAlgorithm;

    // 租户名称，八位字母
    /**
     * @var string
     */
    public $tenantName;
    protected $_name = [
        'authToken'          => 'auth_token',
        'sourceSystem'       => 'source_system',
        'userAccessKey'      => 'user_access_key',
        'signatureResult'    => 'signature_result',
        'signatureText'      => 'signature_text',
        'signatureAlgorithm' => 'signature_algorithm',
        'tenantName'         => 'tenant_name',
    ];

    public function validate()
    {
        Model::validateRequired('sourceSystem', $this->sourceSystem, true);
        Model::validateRequired('userAccessKey', $this->userAccessKey, true);
        Model::validateRequired('signatureResult', $this->signatureResult, true);
        Model::validateRequired('signatureText', $this->signatureText, true);
        Model::validateRequired('signatureAlgorithm', $this->signatureAlgorithm, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->sourceSystem) {
            $res['source_system'] = $this->sourceSystem;
        }
        if (null !== $this->userAccessKey) {
            $res['user_access_key'] = $this->userAccessKey;
        }
        if (null !== $this->signatureResult) {
            $res['signature_result'] = $this->signatureResult;
        }
        if (null !== $this->signatureText) {
            $res['signature_text'] = $this->signatureText;
        }
        if (null !== $this->signatureAlgorithm) {
            $res['signature_algorithm'] = $this->signatureAlgorithm;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyServiceaccountSignatureRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['source_system'])) {
            $model->sourceSystem = $map['source_system'];
        }
        if (isset($map['user_access_key'])) {
            $model->userAccessKey = $map['user_access_key'];
        }
        if (isset($map['signature_result'])) {
            $model->signatureResult = $map['signature_result'];
        }
        if (isset($map['signature_text'])) {
            $model->signatureText = $map['signature_text'];
        }
        if (isset($map['signature_algorithm'])) {
            $model->signatureAlgorithm = $map['signature_algorithm'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }

        return $model;
    }
}
