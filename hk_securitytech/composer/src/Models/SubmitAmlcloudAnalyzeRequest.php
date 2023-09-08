<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SubmitAmlcloudAnalyzeRequest extends Model
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

    // biz_code
    /**
     * @var string
     */
    public $bizCode;

    // tenant_id
    /**
     * @var string
     */
    public $tenantId;

    // tnt_inst_id
    /**
     * @var string
     */
    public $tntInstId;

    // extendData
    /**
     * @var ExtendData
     */
    public $extendData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizCode'           => 'biz_code',
        'tenantId'          => 'tenant_id',
        'tntInstId'         => 'tnt_inst_id',
        'extendData'        => 'extend_data',
    ];

    public function validate()
    {
        Model::validateRequired('bizCode', $this->bizCode, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('tntInstId', $this->tntInstId, true);
        Model::validateRequired('extendData', $this->extendData, true);
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
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tntInstId) {
            $res['tnt_inst_id'] = $this->tntInstId;
        }
        if (null !== $this->extendData) {
            $res['extend_data'] = null !== $this->extendData ? $this->extendData->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAmlcloudAnalyzeRequest
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
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tnt_inst_id'])) {
            $model->tntInstId = $map['tnt_inst_id'];
        }
        if (isset($map['extend_data'])) {
            $model->extendData = ExtendData::fromMap($map['extend_data']);
        }

        return $model;
    }
}
