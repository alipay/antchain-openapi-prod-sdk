<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class ListUniversalsaasDigitalhumanVoiceRequest extends Model
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

    // 租户编码
    /**
     * @var string
     */
    public $tenantCode;

    // common---内置音色
    // custom--我的音色
    /**
     * @var string
     */
    public $type;

    // 2d---2d音色
    // 3d---3d音色
    /**
     * @var string
     */
    public $classification;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantCode'        => 'tenant_code',
        'type'              => 'type',
        'classification'    => 'classification',
    ];

    public function validate()
    {
        Model::validateRequired('tenantCode', $this->tenantCode, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('classification', $this->classification, true);
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
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->classification) {
            $res['classification'] = $this->classification;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListUniversalsaasDigitalhumanVoiceRequest
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
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['classification'])) {
            $model->classification = $map['classification'];
        }

        return $model;
    }
}
