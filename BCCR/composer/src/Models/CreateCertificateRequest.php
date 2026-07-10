<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateCertificateRequest extends Model
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

    // 版权登记id
    /**
     * @var string
     */
    public $registerId;

    // 证书类型
    /**
     * @var string
     */
    public $certificateType;

    // 功能类型
    /**
     * @var string
     */
    public $featuresType;

    // 公证处id
    /**
     * @var string
     */
    public $orgId;

    // 代理信息
    /**
     * @var ProxyData
     */
    public $proxyInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'registerId'        => 'register_id',
        'certificateType'   => 'certificate_type',
        'featuresType'      => 'features_type',
        'orgId'             => 'org_id',
        'proxyInfo'         => 'proxy_info',
    ];

    public function validate()
    {
        Model::validateRequired('registerId', $this->registerId, true);
        Model::validateRequired('certificateType', $this->certificateType, true);
        Model::validateRequired('featuresType', $this->featuresType, true);
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
        if (null !== $this->registerId) {
            $res['register_id'] = $this->registerId;
        }
        if (null !== $this->certificateType) {
            $res['certificate_type'] = $this->certificateType;
        }
        if (null !== $this->featuresType) {
            $res['features_type'] = $this->featuresType;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->proxyInfo) {
            $res['proxy_info'] = null !== $this->proxyInfo ? $this->proxyInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCertificateRequest
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
        if (isset($map['register_id'])) {
            $model->registerId = $map['register_id'];
        }
        if (isset($map['certificate_type'])) {
            $model->certificateType = $map['certificate_type'];
        }
        if (isset($map['features_type'])) {
            $model->featuresType = $map['features_type'];
        }
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['proxy_info'])) {
            $model->proxyInfo = ProxyData::fromMap($map['proxy_info']);
        }

        return $model;
    }
}
