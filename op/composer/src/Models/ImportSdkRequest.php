<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ImportSdkRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;

    // SDK语言
    /**
     * @var string
     */
    public $sdkLanguage;

    // 版本
    /**
     * @var string
     */
    public $versionOfSdk;

    // 依赖详情
    /**
     * @var string
     */
    public $dependencyDetail;
    protected $_name = [
        'authToken'        => 'auth_token',
        'prodCode'         => 'prod_code',
        'sdkLanguage'      => 'sdk_language',
        'versionOfSdk'     => 'version_of_sdk',
        'dependencyDetail' => 'dependency_detail',
    ];

    public function validate()
    {
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('sdkLanguage', $this->sdkLanguage, true);
        Model::validateRequired('versionOfSdk', $this->versionOfSdk, true);
        Model::validateRequired('dependencyDetail', $this->dependencyDetail, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->sdkLanguage) {
            $res['sdk_language'] = $this->sdkLanguage;
        }
        if (null !== $this->versionOfSdk) {
            $res['version_of_sdk'] = $this->versionOfSdk;
        }
        if (null !== $this->dependencyDetail) {
            $res['dependency_detail'] = $this->dependencyDetail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportSdkRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['sdk_language'])) {
            $model->sdkLanguage = $map['sdk_language'];
        }
        if (isset($map['version_of_sdk'])) {
            $model->versionOfSdk = $map['version_of_sdk'];
        }
        if (isset($map['dependency_detail'])) {
            $model->dependencyDetail = $map['dependency_detail'];
        }

        return $model;
    }
}
