<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class PublishProductSaassdkRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 要发布的共享能力名称
    /**
     * @var string
     */
    public $saasCode;

    // 本次打包的版本
    /**
     * @var string
     */
    public $saassdkVersion;

    // 是否发布
    /**
     * @var bool
     */
    public $publish;
    protected $_name = [
        'authToken'      => 'auth_token',
        'saasCode'       => 'saas_code',
        'saassdkVersion' => 'saassdk_version',
        'publish'        => 'publish',
    ];

    public function validate()
    {
        Model::validateRequired('saasCode', $this->saasCode, true);
        Model::validateRequired('saassdkVersion', $this->saassdkVersion, true);
        Model::validateRequired('publish', $this->publish, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->saasCode) {
            $res['saas_code'] = $this->saasCode;
        }
        if (null !== $this->saassdkVersion) {
            $res['saassdk_version'] = $this->saassdkVersion;
        }
        if (null !== $this->publish) {
            $res['publish'] = $this->publish;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PublishProductSaassdkRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['saas_code'])) {
            $model->saasCode = $map['saas_code'];
        }
        if (isset($map['saassdk_version'])) {
            $model->saassdkVersion = $map['saassdk_version'];
        }
        if (isset($map['publish'])) {
            $model->publish = $map['publish'];
        }

        return $model;
    }
}
