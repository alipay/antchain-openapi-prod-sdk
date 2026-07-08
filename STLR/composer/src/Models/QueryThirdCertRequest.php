<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class QueryThirdCertRequest extends Model
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

    // 三方平台的产品ID
    /**
     * @var string
     */
    public $productId;

    // GreenProductCertification ：绿色产品认证证书
    // GarbonNeutrality ： 碳中和证书
    // GreenhouseGasInventory 温室气体核查证书
    /**
     * @var string
     */
    public $certificationType;

    // 证书文件中的产品名称
    /**
     * @var string
     */
    public $cproductName;

    // 证书文件中的产品型号
    /**
     * @var string
     */
    public $cproductModel;

    // 证书文件中的生产商名称
    /**
     * @var string
     */
    public $cproductFirm;

    // 三方平台的企业ID
    /**
     * @var string
     */
    public $companyId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productId'         => 'product_id',
        'certificationType' => 'certification_type',
        'cproductName'      => 'cproduct_name',
        'cproductModel'     => 'cproduct_model',
        'cproductFirm'      => 'cproduct_firm',
        'companyId'         => 'company_id',
    ];

    public function validate()
    {
        Model::validateRequired('companyId', $this->companyId, true);
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
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->certificationType) {
            $res['certification_type'] = $this->certificationType;
        }
        if (null !== $this->cproductName) {
            $res['cproduct_name'] = $this->cproductName;
        }
        if (null !== $this->cproductModel) {
            $res['cproduct_model'] = $this->cproductModel;
        }
        if (null !== $this->cproductFirm) {
            $res['cproduct_firm'] = $this->cproductFirm;
        }
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryThirdCertRequest
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
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['certification_type'])) {
            $model->certificationType = $map['certification_type'];
        }
        if (isset($map['cproduct_name'])) {
            $model->cproductName = $map['cproduct_name'];
        }
        if (isset($map['cproduct_model'])) {
            $model->cproductModel = $map['cproduct_model'];
        }
        if (isset($map['cproduct_firm'])) {
            $model->cproductFirm = $map['cproduct_firm'];
        }
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }

        return $model;
    }
}
